package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestionList {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
//		By loc=By.xpath("//li[text()='T-shirts > Faded Short Sleeve T-shirts']");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(2000);
		eleUtil.selectItem("T-shirts > Faded Short Sleeve T-shirts");
		
		
	}
	//This part was moved to elementUtil class
//	public static void selectItem(String productName) {
//		driver.findElement(By.xpath("//li[text()='"+productName+"']")).click();
//
//	}

}
