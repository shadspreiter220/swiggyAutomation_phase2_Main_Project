package swiggy.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.extent.reports.ExtentReporterNG;

public class Listeners implements ITestListener {
	
	ExtentTest test;
	ExtentReports extent=ExtentReporterNG.getReportObject();

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Navigation Test Started");
		test =extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Navigation Test Success");
		test.log(Status.PASS, "Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Navigation Test Failed");
		test.fail(result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Navigation Test Skipped");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Suite Started");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Suite Finished");
		extent.flush();

	}

}