package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDroop {
	public static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceEle=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement targetEle=driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions act=new Actions(driver);
		
		//option 1
//		act.clickAndHold(sourceEle).
//		moveToElement(targetEle).// build part optional due to update 
//		release().build().perform();
		
		
		//option 2
		act.dragAndDrop(sourceEle, targetEle).perform();
		
	}

}
