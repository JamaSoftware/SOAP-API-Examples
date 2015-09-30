/*
    Jama SOAP API Example Code
    September 14th, 2015

    Based on default demonstration data installed with Jama

    This code is not intended to be a complete solution to any particular problem, but is designed to
    illustrate different Jama API calls.

    WARNING: Some of the examples will create or update items. Do not run this code against your
    production Jama installation without understanding what it will do.

 */

package example;

import com.jama.*;
import java.net.MalformedURLException;
import java.net.URL;

public class JamaSoapClient {
    private static String userName;
    private static String password;
    private static String url;
    private static ContourSoapService contourSoapService;

    public static void main(String[] argv) {
        userName = "sample";                                                        // SOAP API Username
        password = "password";                                                      // SOAP API Password
        url = "http://localhost:8080/contour/ws/v3/soap/ContourSoapService?wsdl";   // SOAP API endpoint URL

        // Create a Contour Soap Service connection object and login credentials
        com.jama.ContourSoapService service = getContourSoapService();
        WsAuth token = getAuth();

        // Run example code
        Examples exp = new Examples();

//        exp.getItemExample(service, token);
//        exp.getProjectsExample(service, token);
//        exp.updateItemExample(service, token);
//        exp.getItemsFromFilterExample(service, token);
//        try {
//            exp.addItemExample(service, token);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        exp.addItemsExample(service, token);
//        exp.createAndExecuteTestCycle(service, token);
//        exp.addRelationship(service, token);
//        exp.moveDocumentExample(service, token);
        exp.getUsersExample(service, token);
//        exp.updateUserExample(service, token);
//        exp.addUserExample(service, token);
//        exp.deactivateUserExample(service, token);

    }


    private static ContourSoapService getContourSoapService()  {
        if (contourSoapService == null) {
            try {
                ContourSoapServiceV3 factory = new ContourSoapServiceV3(new URL(url));
                contourSoapService = factory.getContourSoapServicePort();
            } catch (MalformedURLException e) {
                System.out.println("Error: " + e.getLocalizedMessage());
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
