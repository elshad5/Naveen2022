package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinksElement {
static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		//6 linkText:
		// link html tag =<a> with text
//		By macBookLocator=By.linkText("MacBook");
//		eleUtil.doClick(macBookLocator);

		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//		driver.findElement(By.linkText("CONTACT SALES")).click();
		
//		By contactBtn=By.linkText("CONTACT SALES");
//		eleUtil.doClick(contactBtn);
		
		
		//7. partialLinkText:
		//CONTACT SALES
		//CONTACT TEAM
		//CONTACT MARKETING
		
//		driver.findElement(By.partialLinkText("SALES")).click();
		By partialLinkText=By.partialLinkText("SALES");
		eleUtil.doClick(partialLinkText);

	}

}
