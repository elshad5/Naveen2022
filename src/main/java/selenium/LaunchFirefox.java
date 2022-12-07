package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFirefox {

	public static void main(String[] args) {

			//geckodriver.exe-->Mozilla
		System.setProperty("webdriver.gecko.driver",
				"C:\\Selenium\\drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
		//WebDriverManager
//		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();

	}

}
