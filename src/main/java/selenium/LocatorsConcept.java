package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");


//webElement+actions(click,sendkeys,gettext,isDisplayed)


//1.id

//1st: this is not good approach
//driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//driver.findElement(By.id("input-password")).sendKeys("test@123");


//2nd:
//I prefer this one
//WebElement emailId=driver.findElement(By.id("input-email"));
//WebElement password=driver.findElement(By.id("input-password"));
//
//emailId.sendKeys("naveen@gmail.com");
//password.sendKeys("test@123");


//3rd: By locator: also called OR
//By emailId=By.id("input-email");
//By password=By.id("input-password");
//
//WebElement email=driver.findElement(emailId);
//WebElement paswd=driver.findElement(password);
//
//email.sendKeys("naveen@gmail.com");
//paswd.sendKeys("test@123");



//4. By locator+generic function
//Based on Naveen it is the best approach
//By emailId=By.id("input-email");
//By password=By.id("input-password");
//
//getElement(emailId).sendKeys("naveen@gmail.com");
//getElement(password).sendKeys("test@123");


//5. By locator+generic function for element and action:
//By emailId=By.id("input-email");
//By password=By.id("input-password");
//
//doSendKeys(emailId,"naveen@gmail.com");
//doSendKeys(password,"test@123");



//6th. By locator+generic function for element and actions in some util class:
//Naveen recommends this one
//By emailId=By.id("input-email");
//By password=By.id("input-password");
//
//ElementUtil eleUtil=new ElementUtil(driver);
//eleUtil.doSendKeys(emailId,"naveen@gmail.com");
//eleUtil.doSendKeys(password,"test@123");

//7th: using utils in different class 


//8th: String locator+generic function for element and actions in some util class:
// it is like number 6 option
ElementUtil eleUtil=new ElementUtil(driver);
String email_id="input-email";
String password_id="input-password";
eleUtil.doSendKeys("id",email_id,"naveen@gmail.com");
eleUtil.doSendKeys("id",password_id,"test@123");

	}
	
	//After creationg of elementutil class no need this one, still keeping for review
//	//4. By locator+generic function
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	//5. By locator+generic function for element and action:
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
		
	}
	
	

}
