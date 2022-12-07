package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		//1.cross browser
//		WebDriver driver= new ChromeDriver();
//		driver= new FirefoxDriver();
//		driver= new SafariDriver();
		
		//2.chrome specific
//		ChromeDriver d1=new ChromeDriver();
		
		//3.
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		
	}

}
