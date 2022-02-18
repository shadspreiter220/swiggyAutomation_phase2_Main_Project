package swiggy.test.tc;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Swiggy_Tests_Grid   {
	
	
	@Test
	public void swiggyGrid () throws MalformedURLException  {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		WebDriver driver= new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"), cap);
		
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		
		
		
		

	}

	
}
	


