package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeListConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		
		//total links on the page  and return  the href list
		
//		List<WebElement> linkList=driver.findElements(By.tagName("a"));
//		for(WebElement e:linkList) {
//			String hrefValue=e.getAttribute("href");
//			System.out.println(hrefValue);
//		}
		ElementUtil eleUtil=new ElementUtil(driver);
		By links=By.tagName("a");
		By images=By.tagName("img");
		
		System.out.println(eleUtil.getAttributeList(links,"href"));
		System.out.println(eleUtil.getAttributeList(images,"alt"));
		System.out.println(eleUtil.getAttributeList(images,"height"));
		System.out.println(eleUtil.getAttributeList(images,"srs"));
		
		
		
	}
	
	

}
