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
}

