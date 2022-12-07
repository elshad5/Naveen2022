package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSExecutor {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.get("https://www.amazon.ca/");
		driver.get("https://naveenautomationlabs.com/opencart/");
	
		//browser--JS
	
		
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		String title=js.executeScript("return document.title;").toString();
//		System.out.println(title);

		
//		js.executeAsyncScript("alert('Elshad salam');");
		
		
		JSUtil jsUtil=new JSUtil(driver);
		
//		String title=jsUtil.getTitleByJS();
//		System.out.println(title);
		
//		jsUtil.generateAlert("Hi this Elshad`s alert");
		
//		jsUtil.refreshBrowserByJS();
		
		
//		String pageText=jsUtil.getPageInnerText();// good for content text testing
//		System.out.println(pageText);
//		if(pageText.contains("Smart Security")) {
//			System.out.println("1 Pass");
//		}
//			
//			if(pageText.contains("Warehouse Deals")) {
//				System.out.println("2 Pass");
//			}
		
			
//			driver.get("https://classic.crmpro.com/index.html");
//			WebElement test=driver.findElement(By.cssSelector("div#navbar-collapse"));
			
			//manual testing,circle element on webpage, we can generate border for specific element
//			jsUtil.drawBorder(test);
			
			
			
			// we can go down of page and interact with it, selenium is not helpful in this cases
//			jsUtil.scrollPageDown();
//			Thread.sleep(2000);
//			jsUtil.scrollPageUp();
//			Thread.sleep(2000);
//			jsUtil.scrollPageDown();
//			Thread.sleep(2000);
//			jsUtil.scrollPageUp();
			
			WebElement ele=driver.findElement(By.xpath("//img[@title='iPhone']"));
			jsUtil.scrollIntoView(ele);
			
			// dont use JS click for regular automation
	
	}

}
