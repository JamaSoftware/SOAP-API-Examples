package com.jamasoftware.examples.soap;

import com.jamasoftware.examples.soap.wsdl.*;

import java.util.ArrayList;
import java.util.List;


public class ItemExamples {
    public static void getItemExample(ContourSoapService service, WsAuth token) {
        System.out.println("Jama API getItem Example");
        System.out.println("Return a single item via the getItem method");
        System.out.println("-------------------------------------------------------------------");

        long itemId = 2;  // 2 is present in the Jama default demonstration data

        WsItem item = service.getItem(token, itemId);
        List<WsField> fields = item.getFields();

        System.out.println(String.format("Item %s: %s", itemId, item.getName()));
        System.out.println(item.getDescription());
        for (WsField field : fields) {
            // Note: WsItem.getValues() returns an ArrayList, even for fields that would logically
            // only have a single value like "createdDate" or "documentKey".
            System.out.println(String.format(
                    "%20s: %s",
                    field.getLabel(),
                    field.getValues()));
        }
    }

    public static void updateItemExample(ContourSoapService service, WsAuth token) {
        System.out.println("Jama API updateItem Example");
        System.out.println("Update a single existing item");
        System.out.println("-------------------------------------------------------------------");

        long itemId = 2;
        String newPriority = "300";
        /*
        This is the id of the priority "Low". For more information on setting picklist values, see:
        https://community.jamasoftware.com/jama/topics/soap-api-how-do-i-update-the-value-of-a-field-of-type-pick-list
         */

        System.out.println(String.format("Getting item %s", itemId));
        WsItem item = service.getItem(token, itemId);

        System.out.println("Updating description");
        item.setDescription(item.getDescription() + "<p>More content</p>");

        System.out.println("Setting priority field dropdown to Low");
        List<WsField> fields = item.getFields();
        for (WsField field : fields) {
            if (field.getName().equals("priority")) {
                field.getValues().clear();
                field.getValues().add(newPriority);
            }
        }

        System.out.println(String.format("Updating item %s in Jama", itemId));
        service.updateItem(token, item);

        // Note that items are versioned in Jama - updateItem will create a new version of the
        // item.
    }


    public static void getItemsFromTextSearchExample(ContourSoapService service, WsAuth token) {
        System.out.println("Jama API getItemsFromTextSearch Example");
        System.out.println("Get all items that match a search string using pagination");
        System.out.println("-------------------------------------------------------------------");


        // Search phrase uses Lucene syntax. See http://help.jamasoftware.com/search_tips.htm
        String searchTerms = "\"QA Build 1\"";
        int start = 0;  // Start with the first item in the search results. Note that the first
        // result is #0 (zero-indexed)
        int count = 10; // For demonstration purposes, get 10 items at a time. Typically in production
        // use batch sizes of 50 - 100 items, but it depends on your system and usage
        // what will have the best performance.

        int total = 0;
        List<WsItem> searchResults;

        while (true) {
            System.out.println(String.format("Getting results %s - %s", start + 1, start + count));
            searchResults = service.getItemsFromTextSearch(token, searchTerms, start, count);

            for (WsItem item : searchResults) {
                total += 1;
                System.out.println(String.format("%5s: %s (API ID %s)", total, item.getName(), item.getId()));
            }

            if (searchResults.isEmpty() || searchResults.size() < count) {  // No more search results.
                System.out.println(String.format("Finished. %s items found.", total));
                break;
            } else {
                start += count;
            }
        }
    }


    public static void addItemExample(ContourSoapService service, WsAuth token) {
        System.out.println("Jama API addItem Example");
        System.out.println("Create a new item when the document type is different in different projects");
        System.out.println("-------------------------------------------------------------------");
        WsItem item = new WsItem();

        long projectId = 1;     // Coverage Plus - Traditional

        List<WsDocumentType> itemTypes = service.getDocumentTypesForProject(token, projectId);

        // Find the correct parent ID for this project - a set named "Defects"
        List<WsItem> parentItems = service.getItemsFromTextSearch(token,
                String.format("+project.id:%s +name:Defects", projectId), 0, 1);
        WsItem parentItem;
        if (parentItems.size() > 0) {
            parentItem = parentItems.get(0);
            item.setName("Single Test Item");
            item.setDescription("This is a test<br>Some HTML tags are allowed in the description<br>");
            item.setParentId(parentItem.getId());                           // Defects set
            item.setDocumentTypeId(parentItem.getChildDocumentTypeId());    // Type of items in the set.
            // Note that different projects may have
            // different item types with the same
            // name, though that is not recommended.

            WsItem newItem = service.addItem(token, item);
            // set field values on the item here.
            service.updateItem(token, newItem);
            System.out.println(String.format("Created item %s", newItem.getId()));
        } else {
            System.out.println(String.format("Error: set named 'Defects' not found in project %s", projectId));
        }
    }


    public static void addItemsExample(ContourSoapService service, WsAuth token) {
        System.out.println("Jama API addItems Example");
        System.out.println("Create new items and add them in sets of 100");
        System.out.println("-------------------------------------------------------------------");

        int count = 0;
        int itemsToAdd = 1000;

        while (count < itemsToAdd) {
            List<WsItem> items = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                // Items must have at least: name, parentId, and documentTypeId.
                WsItem item = new WsItem();
                item.setName(String.format("Test item %s", count));
                item.setDescription("This is a test");
                item.setParentId(240);                  // Hard coded, see addItemExample for details
                item.setDocumentTypeId(27);             // Hard coded
                count += 1;
                items.add(item);
            }
            service.addItems(token, items);
            System.out.println(String.format("Added %s/%s items", count, itemsToAdd));
        }
    }


    public void addRelationship(ContourSoapService service, WsAuth token) {
        System.out.println("Jama API add relationship example");
        System.out.println("Create a relationship between two items");
        System.out.println("-------------------------------------------------------------------");

        // Get items to create a relationship between
        WsItem fromItem = service.getItem(token, (long) 154);   // Test case CP-TC-1
        WsItem toItem = service.getItem(token, (long) 231);     // Bug CP-BUG-1

        // Get available relationship types
        WsRelationshipType relationType = service.getRelationshipTypeList(token, (long) 2).get(0);   // "Related to"

        List<WsRelationship> relationships = new ArrayList<WsRelationship>();

        // Create a relationship object
        WsRelationship relationship = new WsRelationship();
        relationship.setFromItem(fromItem);
        relationship.setToItem(toItem);
        relationship.setRelationshipType(relationType);

        relationships.add(relationship);

        List<WsRelationship> results;

        // Create all the relationships added above
        results = service.createRelationships(token, relationships);

        // Print a list of relationships that were created. Note that two items can only have a single
        // relationship
        for (WsRelationship result : results) {
            System.out.println(String.format("Created relationship ID %s", result.getId()));
        }
    }


    public static void moveDocumentExample(ContourSoapService service, WsAuth token) {
        System.out.println("Jama API moveDocument Example");
        System.out.println("Move an item to a different place in the tree view");
        System.out.println("-------------------------------------------------------------------");

        long itemToMove = 3;    // The item CP-FEAT-3 in the "Coverage Plus - Traditional" project. Typically you would
        // get this from a WsItem's getId() method
        long newParent = 5;     // The folder CP-FLD-2 in the "Coverage Plus - Traditional" project

        // Note that a set of a given type of items can only contain that type of item, folders, or Text items.
        // For example, you could not have a set of Test Cases that also contain a User Story. However, you could
        // have a component that contains a set of Test Cases and a set of User Stories. For more information, see:
        // http://help.jamasoftware.com/what_is_a_component.htm
        // http://help.jamasoftware.com/what_is_a_set.htm
        // http://help.jamasoftware.com/what_is_a_folder.htm

        // Note that both items and folders can have children underneath them.

        boolean result = service.moveDocument(token, itemToMove, newParent);

        // If moveDocument is called with an item's current parent, it will return true (IE, that the
        // item was moved successfully even if the actual location didn't change)
        if (result) {
            System.out.println("The item was moved successfully");
        } else {
            System.out.println("The item was not moved successfully");
        }
    }


}

