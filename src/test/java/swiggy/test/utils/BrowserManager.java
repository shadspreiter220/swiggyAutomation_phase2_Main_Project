package swiggy.test.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserManager {

	public WebDriver driver;

	
	public WebDriver initDriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\sspreiter.ECO\\eclipseWorkspace\\PH2Project\\src\\main\\resources\\data.properties");

		prop.load(fis);
		prop.getProperty("browser");
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\SimpliLearnPH2\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SimpliLearnPH2\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		driver.manage().timeouts().getPageLoadTimeout();
		return driver;
	}

}
