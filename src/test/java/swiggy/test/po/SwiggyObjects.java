package swiggy.test.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwiggyObjects {

	public WebDriver driver;

	By cityName = By.linkText("Delhi");
	By clickSignIn = By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[2]/div/span[2]");
	By enterMobile = By.name("mobile");
	By clickOnLogin = By.xpath("//a[@class='a-ayg']");

	public SwiggyObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement clickCityName() {
		return driver.findElement(cityName);
	}

	public WebElement clickOnSignIn() {
		return driver.findElement(clickSignIn);
	}

	public WebElement enterPhoneNumber() {
		return driver.findElement(enterMobile);
	}
	public WebElement clickLogin() {
		return driver.findElement(clickOnLogin);
	}
	
		
	}



