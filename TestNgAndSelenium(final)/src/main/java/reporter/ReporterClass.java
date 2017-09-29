package reporter;

import java.io.BufferedWriter;

import java.io.File;

import java.io.FileWriter;

import java.io.IOException;

import java.io.PrintWriter;

import java.util.List;

import java.util.Map;

import java.util.Set;

import org.testng.IReporter;

import org.testng.IResultMap;

import org.testng.ISuite;

import org.testng.ISuiteResult;

import org.testng.ITestContext;

import org.testng.ITestResult;

import org.testng.xml.XmlSuite;


import static java.awt.SystemColor.text;

public class ReporterClass implements IReporter {
    @Override
    public void generateReport(List xmlSuites, List suites, String outputDirectory) {
//         PrintWriter mOut;
//        public void generateReport(List xmlSuites, List suites,
//        String outputDirectory) {
//            new File(outputDirectory).mkdirs();
//            try {
//                mOut = new PrintWriter(new BufferedWriter(new FileWriter(new File(
//                        outputDirectory, "custom-report.html"))));
//            } catch (IOException e) {
//                System.out.println("Error in creating writer: " + e);
//            }
//            startHtml();
//            print("Suites run: " + suites.size());
//            for (ISuite suite : suites) {
//                print("Suite>" + suite.getName());
//                Map<String, ISuiteResult> suiteResults = suite.getResults();
//                for (String testName : suiteResults.keySet()) {
//                    print("    Test>" + testName);
//                    ISuiteResult suiteResult = suiteResults.get(testName);
//                    ITestContext testContext = suiteResult.getTestContext();
//                    print("        Failed>" + testContext.getFailedTests().size());
//                    IResultMap failedResult = testContext.getFailedTests();
//                    Set testsFailed = failedResult.getAllResults();
//                    for (ITestResult testResult : testsFailed) {
//
//                        print("            " + testResult.getName());
//
//                        print("                " + testResult.getThrowable());
//
//                    }
//
//                    IResultMap passResult = testContext.getPassedTests();
//
//                    Set testsPassed = passResult.getAllResults();
//
//                    print("        Passed>" + testsPassed.size());
//
//                    for (ITestResult testResult : testsPassed) {
//
//                        print("            "
//
//                                        + testResult.getName()
//
//                                        + ">took "
//
//                                        + (testResult.getEndMillis() - testResult
//
//                                        .getStartMillis()) + "ms");
//
//                    }
//                    IResultMap skippedResult = testContext.getSkippedTests();
//
//                    Set testsSkipped = skippedResult.getAllResults();
//
//                    print("        Skipped>" + testsSkipped.size());
//
//                    for (ITestResult testResult : testsSkipped) {
//
//                        print("            " + testResult.getName());
//
//                    }
//
//
//
//                }
//
//            }
//
//            endHtml();
//
//            mOut.flush();
//
//            mOut.close();
//
//        }
//
//
//
//        private void print(String text) {
//
//            System.out.println(text);
//
//            mOut.println(text + "
//
//                    ");
//
//        }
//
//
//
//        private void startHtml() {
//
//            mOut.println("");
//
//            mOut.println("");
//
//            mOut.println("TestNG Html Report Example");
//
//            mOut.println("");
//
//            mOut.println("");
//
//        }
//
//
//
//        private void endHtml() {
//
//            mOut.println("");
//
//        }
//
//    }
}
    }
