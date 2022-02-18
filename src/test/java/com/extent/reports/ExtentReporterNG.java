package com.extent.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
		static ExtentReports extent;
		
	public static ExtentReports getReportObject() {
		
		String path = System.getProperty("user.dir")+"/reports/swiggy_extent.01.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Swiggy Automation Results");
		reporter.config().setDocumentTitle("Test Results");
	
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Shad Spreiter");
		return extent;
		
	}
	
	
	

}
