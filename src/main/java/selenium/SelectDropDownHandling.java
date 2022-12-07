package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownHandling {
	public static WebDriver driver;

	public static void main(String[] args) {
		ElementUtil elUtil=new ElementUtil(driver);
		//dropdown-select tag
		//use select class from Selenium
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		
		By country=By.id("Form_submitForm_Country");
		elUtil.doSelectByIndex(country,5);
		elUtil.doSelectByVisible(country,"Canada");
		elUtil.doSelectByValue(country,"Azerbaijan");
//		Select select=new Select(driver.findElement(country));
//		
//		select.selectByIndex(5);//by index, it is not recommended due to possible change to web
//		select.selectByVisibleText("Canada");//by visible text
//		select.selectByValue("Azerbaijan");
		
		
	}
	

}
