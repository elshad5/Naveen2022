package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
//		driver.findElement(By.name("q")).sendKeys("Naveen Automation Labs");
//		Thread.sleep(3000);
//		
//		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']"));
//		
//		System.out.println("total list: "+list.size());
//		
//		for(WebElement e: list) {
//			String text=e.getText();
//			System.out.println("total list-->: "+text);
//			if(text.contains("youtube")) {
//				e.click();
//				break;
//			}
//		}
		
		ElementUtil eleUtil=new ElementUtil(driver);
		By search=By.name("q");
		By suggListLocator=By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']");
		eleUtil.performSearch(search,"Naveen Automation Labs",suggListLocator,"youtube");

	}
//This part was moved to elementUtil class
	
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);		
//	}
//	
//	public static void dosendKeys(By locator,String value) {
//		getElement(locator).sendKeys(value);;
//	}
//	public static void performSearch(By search,String searchKey,By suggListLocator,String suggName) throws InterruptedException {
//		dosendKeys(search,searchKey);
//		Thread.sleep(3000);
//		
//		List<WebElement> list=driver.findElements(suggListLocator);
//		
//		System.out.println("total list: "+list.size());
//		
//		for(WebElement e: list) {
//			String text=e.getText();
//			System.out.println("total list-->: "+text);
//			if(text.contains(suggName)) {
//				e.click();
//				break;
//			}
//		}
//	}

}
