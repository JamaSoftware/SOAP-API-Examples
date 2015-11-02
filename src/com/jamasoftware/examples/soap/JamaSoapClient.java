/*
    Jama SOAP API Example Code
    October 27th, 2015

    Based on default demonstration data installed with Jama

    This code is not intended to be a complete solution to any particular problem, but is designed to
    illustrate different Jama API calls.

    WARNING: Some of the examples will create or update items. Do not run this code against your
    production Jama installation without understanding what it will do.

 */

package com.jamasoftware.examples.soap;

import com.jamasoftware.examples.soap.wsdl.ContourSoapService;
import com.jamasoftware.examples.soap.wsdl.ContourSoapServiceV3;
import com.jamasoftware.examples.soap.wsdl.WsAuth;

import java.net.MalformedURLException;
import java.net.URL;


public class JamaSoapClient {
    private static String userName;
    private static String password;
    private static String url;
    private static ContourSoapService contourSoapService;


    public static void main(String[] argv) throws Exception {
        userName = "sample";                                                        // SOAP API Username
        password = "password";                                                      // SOAP API Password
        url = "http://localhost:8080/contour/ws/v3/soap/ContourSoapService?wsdl";   // SOAP API endpoint URL

        // Create a Contour Soap Service connection object and login credentials
        ContourSoapService service = getContourSoapService();
        WsAuth token = getAuth();

        // Item handling examples
        ItemExamples ie = new ItemExamples();
//        ItemExamples.getItemExample(service, token);
//        ie.updateItemExample(service, token);
//        ie.getItemsFromTextSearchExample(service, token);
//        ie.addItemExample(service, token);
//        ie.addItemsExample(service, token);
//        ie.addRelationship(service, token);
//        ie.moveDocumentExample(service, token);

        // Project handling examples
        ProjectExamples pe = new ProjectExamples();
//        ProjectExamples.getProjectsExample(service, token);
//        ProjectExamples.getActivities(service, token);

        // User handling examples
        UserExamples ue = new UserExamples();
//        UserExamples.getUsersExample(service, token);
//        ue.addUserExample(service, token);
//        ue.updateUserExample(service, token);
//        ue.deactivateUserExample(service, token);

        // Test handling examples
        TestExamples te = new TestExamples();
//        te.getTestPlanGroupsExample(service, token);
//        te.listTestCyclesExample(service, token);
        te.listTestCyclesInPlanExample(service, token);
//        te.findUnexecutedTestRunsExample(service, token);
//        te.getTestCaseFieldFromTestRun(service, token);
//        te.findTestPlansForCountry(service, token);
//        te.createAndExecuteTestCycle(service, token);

    }


    private static ContourSoapService getContourSoapService() {
        if (contourSoapService == null) {
            try {
                ContourSoapServiceV3 factory = new ContourSoapServiceV3(new URL(url));
                contourSoapService = factory.getContourSoapServicePort();
            } catch (MalformedURLException e) {
                System.out.println("Error: " + e.getLocalizedMessage());
                System.exit(1);
            }
        }
        return contourSoapService;
    }


    private static WsAuth getAuth() {
        WsAuth auth = new WsAuth();
        auth.setUser(userName);
        auth.setPassword(password);
        return auth;
    }

}
