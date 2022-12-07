package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiobsClickAndSendKeys {
	public static WebDriver driver;
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId=By.id("input-email");
		By pwd=By.id("input-password");
		By loginBtn=By.xpath("input[@value='Login']");
		
		doActionsSendKeys(emailId,"test@gmail.com");
		doActionsSendKeys(pwd,"12345");
		doActionsClick(loginBtn);
		
		
//		Actions act=new Actions(driver);
//		act.sendKeys(driver.findElement(emailId),"test@gmail.com").perform();
//		act.sendKeys(driver.findElement(pwd),"1234").perform();
//		act.click(driver.findElement(loginBtn)).perform();
	}
	
	public static void doActionsSendKeys(By locator,String value) {
		Actions act=new Actions(driver);
		act.sendKeys(getElement(locator),value).perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions act=new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
