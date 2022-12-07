package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.cybertekschool.com/");
		
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		
		ex.executeScript("window.scrollBy(0,4000)");
//		ex.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement a=driver.findElement(By.xpath("//a[.='Web Tables']"));
		
//		ex.executeScript("arguments[0].scrollIntoView(true)",a);
//		Thread.sleep(2000);
//		a.click();
//		Thread.sleep(2000);
		
	}

}
