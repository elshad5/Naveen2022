package myTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	
	WebDriver driver;
	@Parameters({"url","browser"})
	@BeforeTest
	public void setup(String url,String browserName) {
		System.out.println("launching browser: "+browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("safari")) {
//			WebDriverManager.firefoxdriver().setup();
			driver= new SafariDriver();
		}
		else {
			System.out.println("Please pass the right browserName..."+browserName);
		}
		driver.get(url);
//		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//		driver.get("https://www.google.com");
	
	}
	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
