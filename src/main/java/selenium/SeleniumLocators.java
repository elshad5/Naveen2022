package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocators {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		

		// 2.name:
		// we dont need this one, we have methods below
//		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("test@123");

		ElementUtil eleUtil = new ElementUtil(driver);

//		By email_id=By.name("email");
//		eleUtil.doSendKeys(email_id, "test@123");

//		String email_name="email";
//		String email_password="password";
//		eleUtil.doSendKeys("name",email_name, "test@gmail.com");

		// 3.class name: can be duplicate for multiple web elements use only when it
		// unique for the single element
		// we dont need this one, we have methods below
		// driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");

//		String searchBox="form-control";
//		eleUtil.doSendKeys("class", searchBox, "test@gmail.com");

		// 4.xpath: is not attribute, it is address of the element in HTML DOM
		// we dont need this one, we have methods below
//		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("test@gmail.com");
		
//		By username=By.xpath("//input[@id='input-email']");
//		By loginBtn=By.xpath("//input[@class='btn btn-primary']");
//		
//		eleUtil.doSendKeys(username, "test@gmail.com");
//		eleUtil.doClick(loginBtn);
		
		
		//5. css selector:
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		String locator="#Form_submitForm_Name";
		By fName=By.cssSelector(locator);
		eleUtil.doSendKeys("css", locator, "Elshad");
		

	}
	


}
