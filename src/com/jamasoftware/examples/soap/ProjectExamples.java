package com.jamasoftware.examples.soap;

import com.jamasoftware.examples.soap.wsdl.*;

import java.util.List;


public class ProjectExamples {
    public static void getProjectsExample(ContourSoapService service, WsAuth token) {
        System.out.println("Jama API getProjects Example");
        System.out.println("Get information on all projects in Jama");
        System.out.println("-------------------------------------------------------------------");

        List<WsProject> projects = service.getProjects(token);

        System.out.println("API ID\tName");
        for (WsProject project : projects) {
            System.out.println(String.format(
                    "%5s:\t%s (%s)",
                    project.getId(),
                    project.getName(),
                    project.getProjectKey()));
        }
    }


    public static void getActivities(ContourSoapService service, WsAuth token) {
        System.out.println("Jama API getActivities Example");
        System.out.println("Get activities (comment stream) for a given project in Jama");
        System.out.println("-------------------------------------------------------------------");

        // Get last 50 activities from "Coverage Plus - Traditional"
        List<WsActivity> activities = service.getActivities(token, (long)1, 0, 50);

        WsItem modifiedItem;

        String itemName;

        for (WsActivity activity : activities) {
            if (activity.getItem() != null) {               // An activity isn't necessarily on a specific item, so
                itemName = activity.getItem().getName();    // handle null getItem() results.
            } else {
                itemName = "";
            }
            System.out.println(String.format("%s: %s %s - %s",
                    activity.getDate(),
                    activity.getAction(),
                    itemName,
                    activity.getComments()
            ));
        }

    }
}

