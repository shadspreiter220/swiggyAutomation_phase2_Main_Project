package com.extent.reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	ExtentReports extent;
	@BeforeTest
	public void config() {
		
		//ExtentReports , ExtentSparkReporter
		
		String path = System.getProperty("user.dir")+"/reports/extentreports1.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
	
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Shad Spreiter");
		
		
	}
	
	
	
	
	
	
	@Test
	public void initialDemo() {
		
		ExtentTest test =extent.createTest("initial demo");
		System.setProperty("webdriver.chrome.driver", "C:/Users/sspreiter.ECO/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://Swiggy.com");
		System.out.println(driver.getTitle());
		driver.close();
		test.fail("results did not match");
		extent.flush();
	}

}
