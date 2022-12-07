package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClick=driver.findElement(By.xpath("//span[.='right click me']"));
		Actions act=new Actions(driver);
		act.contextClick(rightClick).perform();
		
		List<WebElement>rightEle=driver.findElements(By.xpath("//li[contains(@class,'context-menu-icon')]/span"));
		System.out.println(rightEle.size());
		for(WebElement e:rightEle) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals("Copy")) {
				e.click();
				break;
			}
		}
		
	}

}
