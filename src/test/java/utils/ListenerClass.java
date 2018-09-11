package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {


    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("TestMethod Started :" + iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("TestMethod Success :" + iTestResult.getName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("TestMethod Failure :" + iTestResult.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("TestMethod Skipped :" + iTestResult.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("TestMethod TestFailedButWithinSuccessPercentage :" + iTestResult.getName());
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("TestMethod Start :" + iTestContext.getName());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("TestMethod Finish :" + iTestContext.getName());
    }
}
