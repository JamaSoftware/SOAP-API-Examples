package com.jamasoftware.examples.soap;

import com.jamasoftware.examples.soap.wsdl.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.datatype.DatatypeFactory;

import java.util.*;


public class TestExamples {

    public static void listTestCyclesExample(ContourSoapService service, WsAuth token) {
        System.out.println("Jama API list test cycles in a project example");
        System.out.println("List test cycles");
        System.out.println("-------------------------------------------------------------------");

        int projectId = 1;

        String searchString = String.format("+project.id:%s +entityType:testcycle", projectId);
        int start = 0;
        int count = 50;

        int total = 0;
        List<WsItem> searchResults;

        while (true) {
            System.out.println(String.format("Getting results %s - %s", start + 1, start + count));
            searchResults = service.getItemsFromTextSearch(token, searchString, start, count);

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


    public void listTestCyclesInPlanExample(ContourSoapService service, WsAuth token) {
        System.out.println("Jama API list test cycles in a test plan example");
        System.out.println("List all test cycles in a given test plan");
        System.out.println("-------------------------------------------------------------------");

        // 265 is the test plan "CoveragePlus Release" in the project "Coverage Plus - Traditional".
        long testPlanId = 265;

        String searchString = String.format("+entityType:testcycle +testPlan.id:%s", testPlanId);
        int start = 0;
        int count = 50;
        int total = 0;
        List<WsItem> searchResults;

        while (true) {
            System.out.println(String.format("Getting results %s - %s", start + 1, start + count));
            searchResults = service.getItemsFromTextSearch(token, searchString, start, count);

            for (WsItem item : searchResults) {
                total += 1;
                System.out.println(String.format("%5s: %s (API ID %s)",
                        total, item.getName(), item.getId()));
            }

            if (searchResults.isEmpty() || searchResults.size() < count) {  // No more search results.
                System.out.println(String.format("Finished. %s items found.", total));
                break;
            } else {
                start += count;
            }
        }
    }


    public void getTestPlanGroupsExample(ContourSoapService service, WsAuth token) {
        System.out.println("Jama API find test groups example");
        System.out.println("List test groups in a given test cycle");
        System.out.println("-------------------------------------------------------------------");

        // Get groups in the given test plan. 265 is "CoveragePlus Release" in the project
        // "Coverage Plus - Traditional".
        int testPlanId = 265;
        List<WsTestGroup> groups = service.getTestPlanGroups(token, testPlanId);

        for (WsTestGroup group : groups) {
            System.out.println(group.getName());
            for (WsItemName testcase : group.getTestCases()) {
                System.out.println(String.format("    %s (API ID: %s)", testcase.getName(), testcase.getId()));
                // Because this is a WsItemName object instead of the full WsItem object, steps are not
                // available without doing a separate getItem call for that test case. For example:
                // WsItem fullTestCase = service.getItem(token, testcase.getId())
            }
        }
    }


    public static void findUnexecutedTestRunsExample(ContourSoapService service, WsAuth token) {
        System.out.println("Jama API find test runs example");
        System.out.println("Find test runs that have not been executed in a given test cycle");
        System.out.println("-------------------------------------------------------------------");

        int projectId = 1;
        int testCycleId = 266;

        // Note: to find all unexecuted test runs in the project, remove "+testCycle.id:%s" from the search string.
        // To find all passed test runs, change "+testRunStatus:not" to "+testRunStatus:passed"
        String searchString = String.format("+project.id:%s +entityType:testrun +testRunStatus:not +testCycle.id:%s",
                projectId, testCycleId);
        int start = 0;
        int count = 50;

        int total = 0;
        List<WsItem> searchResults;

        while (true) {
            System.out.println(String.format("Getting results %s - %s", start + 1, start + count));
            searchResults = service.getItemsFromTextSearch(token, searchString, start, count);

            for (WsItem item : searchResults) {
                total += 1;
                System.out.println(String.format("%5s: %s (API ID %s)",
                                                 total, item.getName(), item.getId()));
            }

            if (searchResults.isEmpty() || searchResults.size() < count) {  // No more search results.
                System.out.println(String.format("Finished. %s items found.", total));
                break;
            } else {
                start += count;
            }
        }
    }


    public void getTestCaseFieldFromTestRun(ContourSoapService service, WsAuth token) {
        System.out.println("Jama API get test case information from test run example");
        System.out.println("Find the priority of the test case for a given test run");
        System.out.println("-------------------------------------------------------------------");

        // This would work for any other custom field in the Test Case as well

        WsExecutableTestRun executableTestRun = service.getExecutableTestRun(token, 270);
        WsItem testRun = executableTestRun.getTestRun();    // If you already have the WsItem object for a test run,
                                                            // start here

        // Find the ID of the Test Case
        Long testCaseId = null;
        for (WsField field : testRun.getFields()) {       // Look for field with the test case ID
            if (field.getName().equals("testCase")) {     // The API ids for fields are listed in Jama under
                                                          // Admin > Item Types > [type]. You could also match on that
                                                          // with field.getId() == 286
                testCaseId = Long.parseLong(field.getValues().get(0));
            }
        }

        // Get the Test Case's WsItem object
        String priority = null;
        WsItem testCase = null;

        if (testCaseId != null) {
            testCase = service.getItem(token, testCaseId);
            for (WsField field : testCase.getFields()) {
                if (field.getName().equals("priority")) {
                    priority = field.getDisplays().get(0);    // getDisplays() returns an array. If the field contains a
                                                              // single value, just get the first item in the array.
                                                              // For other field types such as text fields or integers,
                                                              // use getValues() instead.

        /*
        For a picklist, getValues() would return the ID of the value in the picklist. For more information see:
        https://community.jamasoftware.com/jama/topics/soap-api-how-do-i-update-the-value-of-a-field-of-type-pick-list
        */
                }
            }
        }

        if (testCase != null) {
            System.out.println(String.format("The test run \"%s\" (API ID %s) is derived from the test case \"%s\" " +
                                             "(API ID %s) that has a priority of \"%s\"",
                    testRun.getName(), testRun.getId(), testCase.getName(), testCaseId, priority));
        }

    }




    public static void findTestPlansForCountry(ContourSoapService service, WsAuth token) {
        System.out.println("Jama API find test plans based on custom field example");
        System.out.println("Find test plans for a given country. Assumes custom field named \"country\" exists");
        System.out.println("-------------------------------------------------------------------");

        /*
         This example assumes that the item type "Test Plan" has the following custom field added to it:
         Field Label: Country
         Unique Field Name: country
         Pick List: Country

         The pick list named "Country" is defined with the values:
         United States of America
         Spain
         Japan

         Also, at least one test plan exists with a Country of "Spain".

         This would also work with other field types.
        */

        int projectId = 1;
        String country = "Spain";

        String searchString = String.format("+project.id:%s +entityType:testplan +country:%s",
                                            projectId, country);
        int start = 0;
        int count = 50;
        int total = 0;
        List<WsItem> searchResults;

        while (true) {
            System.out.println(String.format("Getting results %s - %s", start + 1, start + count));
            searchResults = service.getItemsFromTextSearch(token, searchString, start, count);

            for (WsItem item : searchResults) {
                total += 1;
                System.out.println(String.format("%5s: %s (API ID %s)",
                        total, item.getName(), item.getId()));
            }

            if (searchResults.isEmpty() || searchResults.size() < count) {  // No more search results.
                System.out.println(String.format("Finished. %s items found.", total));
                break;
            } else {
                start += count;
            }
        }
    }


    public void createAndExecuteTestCycle(ContourSoapService service, WsAuth token) throws Exception {
        System.out.println("Jama API execute test example");
        System.out.println("Execute tests in a test run");
        System.out.println("-------------------------------------------------------------------");

        // Get groups in the given test plan. 265 is "CoveragePlus Release" in the project
        // "Coverage Plus - Traditional". Note that test plans and test cases must be defined beforehand in the
        // Jama UI.
        List<WsTestGroup> groups = service.getTestPlanGroups(token, 265);

        List<WsTestRunStatus> includeStatuses = new ArrayList<WsTestRunStatus>();
        includeStatuses.add(WsTestRunStatus.PASSED);        // You may or may not want to include passed tests in the.
        includeStatuses.add(WsTestRunStatus.NOT_RUN);       // new test cycle. For example, for a bug fix release,
        includeStatuses.add(WsTestRunStatus.INPROGRESS);    // you might only want to re-test failed and blocked tests.
        includeStatuses.add(WsTestRunStatus.BLOCKED);
        includeStatuses.add(WsTestRunStatus.FAILED);

        // Start and end dates of this test cycle
        XMLGregorianCalendar startDate = getDateObject(2015, 9, 1);
        XMLGregorianCalendar endDate = getDateObject(2015, 9, 2);

        // Create a new test cycle
        WsItem testCycle = service.createNewTestCycle(token, 265, "Release 1.0 QA Build 2", "Created from SOAP",
                startDate, endDate, includeStatuses, groups);

        // Get test cases from the test cycle that was just created
        String searchString = String.format("testCycle.id:%s", testCycle.getId());
        List<WsItem> tests = service.getItemsFromTextSearch(token, searchString, 0, 100);

        // For each test, simulate executing the test. These values should be set by your program
        // (for example, if a test passes or fails)
        for (WsItem test : tests) {
            System.out.println(test.getName());
            WsExecutableTestRun testRun = service.getExecutableTestRun(token, test.getId());

            List<WsTestRunStep> steps = testRun.getSteps();
            for (WsTestRunStep step : steps) {
                System.out.println(String.format("  Action: %s", step.getAction()));
                System.out.println(String.format("Expected: %s", step.getExpectedResult()));
                step.setResult("Result of test");       // Result is the result of the test. For example,
                                                        // someone was able to log in, or an error message was
                                                        // displayed
                step.setStatus(WsTestRunStatus.PASSED);
                // or WsTestRunStatus.FAILED, or one of the other values in the WsTestRunStatus enum
            }

            service.executeTestRun(token, test.getId(), 2, "Results of tests", false, steps);
            System.out.println("********************");
        }
    }


    /**
     * Helper to create a XMLGregorianCalendar object for a given date. An alternate way to do this would be
     * to change the web services client to use a "more friendly" object like Java.util.Date or Java.time.LocalDate.
     * Note that the Jama server expects time in GMT.
     *
     * @param year Year
     * @param month Month 1-12
     * @param day Day 1-31
     * @return
     * @throws DatatypeConfigurationException
     */
    private XMLGregorianCalendar getDateObject(int year, int month, int day)
            throws DatatypeConfigurationException
    {
        // GregorianCalendar's array of months is 0-indexed, so it's 0-11 instead of 1-12.
        GregorianCalendar gregorianCalendar = new GregorianCalendar(year, month-1, day);
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
        return datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
    }
}
