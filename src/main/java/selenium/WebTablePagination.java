package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePagination {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://selectorshub.com/xpath-practice-page/");
		
		while(true) {
			if(driver.findElements(By.xpath("//td[.='Hong Kong']")).size()>0) {
				selectCity("Hong Kong");
				break;
			}else {
			//pagination logic:
				WebElement next=driver.findElement(By.linkText("Next"));
				if(next.getAttribute("class").contains("disbaled")) {
					System.out.println("pagination is over.. country is not found");
					break;
				}
				next.click();
				Thread.sleep(1000);
			
			}
		}
		
	}
public static void selectCity(String country) {
	driver.findElement(By.xpath("//td[.='"+country+"']/preceding-sibling::td/input[@type='checkbox']"))
	.click();
}
}
