package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
//		WebElement parentMenu=driver.findElement(By.className("menulink"));
//		Actions act=new Actions(driver);
//		act.moveToElement(parentMenu).perform();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("COURSES")).click();
		
		
		By parentMenu=By.className("menulink");
		By childMenu=(By.linkText("COURSES"));
		
		handle_two_level_menu_items(parentMenu,childMenu);
		
	}
	
	public static void handle_two_level_menu_items(By parentMenu,By childMenu) {
		Actions act=new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		getElement(childMenu).click();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
