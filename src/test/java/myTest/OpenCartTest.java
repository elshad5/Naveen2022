package myTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest{

	
//	WebDriver driver;
//	@BeforeTest
//	public void setup() {
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
//		driver.get("https://www.google.com");
//	}
	
	@Test(priority=1)
	public void titleTest() {
//		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
		
		
	@Test(priority=2)
	public void searchFieldTest() {
		Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
	}
	
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}
}
