package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownOptions {
	public static WebDriver driver;

	public static void main(String[] args) {

		//dropdown-select tag
				//use select class from Selenium
				
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
				
				
				By country=By.id("Form_submitForm_Country");
				
//				By country1=By.xpath("//select[@id='Form_submitForm_Country']/option");
				
//				if(getDropDownCount(country)-1==231) {
//					System.out.println("Pass");
//					
//				}
				
//				System.out.println(getDropDownValueList(country).contains("Canada"));
				Select select=new Select(driver.findElement(country));
				
				select.getAllSelectedOptions();
				
				
				
//				List<WebElement>countryList=select.getOptions();	
				
//				System.out.println("total value: "+countryList.size());
//				
//				for(WebElement e:countryList) {
//					String text=e.getText();
//					if(text.equals("Azerbaijan"))
//					System.out.println(text);
//				}
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static int getDropDownCount(By locator) {
		Select select=new Select(getElement(locator));
		return select.getOptions().size();
		}
	
	public static List<String> getDropDownValueList(By locator) {
		Select select=new Select(getElement(locator));
		List<String> optionsValList=new ArrayList<String>();
		List<WebElement> optionsElement=select.getOptions();
		for(WebElement e:optionsElement) {
			String text=e.getText();
			optionsValList.add(text);
		}
return optionsValList;
	}

}
