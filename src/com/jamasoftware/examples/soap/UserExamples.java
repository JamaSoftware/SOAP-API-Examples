package com.jamasoftware.examples.soap;

import com.jamasoftware.examples.soap.wsdl.ContourSoapService;
import com.jamasoftware.examples.soap.wsdl.WsAuth;
import com.jamasoftware.examples.soap.wsdl.WsUser;

import java.util.List;


public class UserExamples {
    public static void getUsersExample(ContourSoapService service, WsAuth token) {
        System.out.println("Jama API getUsersExample Example");
        System.out.println("Get the list of users configured in Jama");
        System.out.println("-------------------------------------------------------------------");

        // Note that getUsersExample does not support the start and count parameters - it will return all
        // the active users in the system except for the root user.
        List<WsUser> users = service.getUsers(token);

        for (WsUser user : users) {
            System.out.println(String.format("%s: %s\t%s", user.getId(), user.getUserName(), user.getLicenseType()));
        }
    }


    public static void addUserExample(ContourSoapService service, WsAuth token) {
        System.out.println("Jama API addUser Example");
        System.out.println("Create a new user in Jama");
        System.out.println("-------------------------------------------------------------------");

        // Notes:
        // 1) After adding a user via the API, you will have to give them permissions in the
        //    Jama UI, either by adding them to a group or setting permissions manually.
        // 2) If you're using another authentication method (SAML, LDAP, Crowd), you do not
        //    need to add users via the API.

        WsUser user = new WsUser();
        user.setFirstName("Test");
        user.setLastName("User");
        user.setFullName("Test User");
        user.setPassword("password");       // Password in plain text. User will be asked to change it the first
        // time they log in
        user.setEmail("tuser@example.com");
        user.setUserName("testuser");       // User names must be unique
        user.setOrgId(2);                   // Organization ID
        user.setLicenseType("N");           // If not defined, the user would be given "Creator (Float)"
        // Valid types are:
        //     N     Creator
        //     C     Creator (Float)
        //     S     Stakeholder
        //     FC    Collaborator (Float)
        //     R     Collaborator (Reserved)
        //     V     Reviewer (Float)
        //     RV    Reviewer (Reserved)
        //     NV    Reviewer
        //     I     Inactive
        //
        // The available license types will depend on your Jama license

        service.addUser(token, user);
    }


    public static void updateUserExample(ContourSoapService service, WsAuth token) {
        System.out.println("Jama API updateUser Example");
        System.out.println("Update an existing user in Jama");
        System.out.println("-------------------------------------------------------------------");

        WsUser user = service.getUser(token, 5);    // User "sample" in demo

        System.out.println(String.format("Current email address: %s", user.getEmail()));

        user.setEmail("sample@example.com");

        WsUser changedUser = service.updateUser(token, user);

        System.out.println(String.format("Email address is now: %s", changedUser.getEmail()));
    }


    public static void deactivateUserExample(ContourSoapService service, WsAuth token) {
        System.out.println("Jama API updateUser Example");
        System.out.println("Deactivate an existing user in Jama via the updateUser call");
        System.out.println("-------------------------------------------------------------------");

        WsUser user = service.getUser(token, 6);    // User ID 6 does not exist in the sample database,
        // but would be created in addUserExample above

        user.setActivated(false);       // Disable the user and set license type to inactive
        user.setLicenseType("I");       // note that users are never deleted in Jama
        // because their history must be maintained

        service.updateUser(token, user);
    }
}
