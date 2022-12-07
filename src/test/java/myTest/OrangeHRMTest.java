package myTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMTest extends BaseTest  {

	
//	WebDriver driver;
//	@BeforeTest
//	public void setup() {
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
//		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//	}
	
	@Test(priority=1)
	public void titleTest() {
//		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Sign Up for a Free HR Software Trial | OrangeHRM | OrangeHRM");
	}
	@Test(priority=2)
	public void contactSalesLinkTest() {
		Assert.assertFalse(driver.findElement(By.xpath("(//button[@class='btn btn-ohrm btn-free-demo'])[2]")).isDisplayed());
	}
	
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}
}
