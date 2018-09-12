package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {

    private static final Logger LOGGER = LogManager.getLogger(ListenerClass.class.getName());


    @Override
    public void onTestStart(ITestResult iTestResult) {
        //System.out.println("TestMethod Started :" + iTestResult.getName());
        LOGGER.info("TestMethod Started:" + iTestResult.getName() + " start" );
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        //System.out.println("TestMethod Success :" + iTestResult.getName());
        LOGGER.info("TestMethod Success:" + iTestResult.getName() + " success TEST!!!" );
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        //System.out.println("TestMethod Failure :" + iTestResult.getName());
        LOGGER.info("TestMethod Failure:" + iTestResult.getName() + " FAIIILL" );
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        //System.out.println("TestMethod Skipped :" + iTestResult.getName());
        LOGGER.info("TestMethod Skipped:" + iTestResult.getName() + " skipped((" );
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        //System.out.println("TestMethod TestFailedButWithinSuccessPercentage :" + iTestResult.getName());
        LOGGER.info("TestMethod TestFailedButWithinSuccessPercentage:" + iTestResult.getName() + " Big suite success" );
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        //System.out.println("TestMethod Start :" + iTestContext.getName());
        LOGGER.info("TestMethod Start:" + iTestContext.getName() + " Big suite start" );

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        //System.out.println("TestMethod Finish :" + iTestContext.getName());
        LOGGER.info("TestMethod onFinish:" + iTestContext.getName() + " Big suite finish!!" );
    }
}
