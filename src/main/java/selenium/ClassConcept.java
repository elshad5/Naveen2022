package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassConcept {
public static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		
//		driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("test@gmail.com");
		//InvalidSelectorException
		// one class name should be used
		
//		driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("test@gmail.com");

		
		driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("test@gmail.com");

		
	}

}
