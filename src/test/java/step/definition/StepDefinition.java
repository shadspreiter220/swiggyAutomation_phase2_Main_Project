package step.definition;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import swiggy.test.po.SwiggyObjects;
import swiggy.test.utils.BrowserManager;

public class StepDefinition extends BrowserManager {

	@Given("user is on homepage")
	public void user_is_on_homepage() throws IOException {
		driver = initDriver();
		driver.get("https://www.swiggy.com/");

	}

	@When("user clicks on city name")
	public void user_clicks_on_city_name() throws InterruptedException {

		SwiggyObjects obj1 = new SwiggyObjects(driver);
		obj1.clickCityName().click();

	}

	@Then("user clicks on sign in")
	public void user_clicks_on_sign_in() {
		SwiggyObjects obj3 = new SwiggyObjects(driver);
		obj3.clickOnSignIn().click();

	}

	@And("user types in phone number")
	public void user_types_in_phone_number() {

		SwiggyObjects obj4 = new SwiggyObjects(driver);
		obj4.enterPhoneNumber().sendKeys("2085694987");

	}

	@And("user clicks on login button")
	public void user_clicks_login_button() throws InterruptedException {

		SwiggyObjects obj5 = new SwiggyObjects(driver);
		obj5.clickLogin().click();
		Thread.sleep(3000);
	}
	
	@Then("close browser")
	public void close_browser() {
		
		driver.close();
	}
	

}
