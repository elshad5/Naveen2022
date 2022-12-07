package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterListWithStaleElement {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement>listEle=driver.findElements(By.className("footer a"));
		for(WebElement e:listEle) {
			e.click();
			driver.navigate().back();
			listEle=driver.findElements(By.className("footer a"));
		
		}
		
		
	}

}
