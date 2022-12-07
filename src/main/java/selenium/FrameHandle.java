package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
//		driver.switchTo().frame(2);// by index, it not recommended due to possible change
//		driver.switchTo().frame("main");// by value
		driver.switchTo().frame(driver.findElement(By.name("main")));// by WebElement,
		String header=driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
	}

}
