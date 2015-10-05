package com.jamasoftware.examples.soap;

import com.jamasoftware.examples.soap.wsdl.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.datatype.DatatypeFactory;

import java.util.*;


public class TestExamples {
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
     * to change the web services client to use a "more friendly" object like Java.util.Date. Note that the
     * Jama server expects time in GMT.
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
