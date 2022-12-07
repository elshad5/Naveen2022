package myTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithNegativeTest{

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@DataProvider
	public Object[][] getLoginNegativeData() {
		
		return new Object[][] {
			{"elshad@gmail.com","test1"},
			{"elshad.shah@gmail.com","test123"},
			{"elshad.Canada@gmail.com","test12345"},
			{"    ","testTest"},
			{"elshad@gmail.com","    "}
		};
				}
		@Test(dataProvider="getLoginNegativeData")
		public void loginTestWithNegativeData(String un, String pwd) {
			
			driver.findElement(By.id("input-email")).clear();
			driver.findElement(By.id("input-email")).sendKeys(un);
			
			driver.findElement(By.id("input-email")).clear();
			driver.findElement(By.id("input-password")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			String errorMsg=driver.findElement(By.cssSelector("div.alert-dismissible")).getText().trim();
			System.out.println(errorMsg);
			Assert.assertEquals(errorMsg, "Warning: No match for E-Mail Address and/or Password.");
		
		}
		
		@AfterTest
		public void teardown() {
			driver.quit();
		}
	
	
	
}
