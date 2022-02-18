package swiggy.test.tc;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import swiggy.test.po.SwiggyObjects;
import swiggy.test.utils.BrowserManager;

public class Swiggy_Tests_ExtentReports extends BrowserManager {

	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest extentTest;

	@BeforeClass
	public void beforeClass() throws IOException {

		driver = initDriver();
		driver.get("https://www.swiggy.com/");

	}


	@Test
	public void browserNavigation() throws IOException {
		SwiggyObjects obj1 = new SwiggyObjects(driver);
		obj1.clickCityName().click();

	}

	@Test(dependsOnMethods = { "browserNavigation" })
	public void clickOnSignIn() throws InterruptedException {
		SwiggyObjects obj3 = new SwiggyObjects(driver);
		obj3.clickOnSignIn().click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods = { "clickOnSignIn" })
	public void typePhone() {
		SwiggyObjects obj4 = new SwiggyObjects(driver);
		obj4.enterPhoneNumber().sendKeys("2085694987");
	}

	@Test(dependsOnMethods = { "typePhone" })
	public void clickLogin() throws InterruptedException {
		SwiggyObjects obj5 = new SwiggyObjects(driver);
		obj5.clickLogin().click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
