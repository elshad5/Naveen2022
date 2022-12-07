package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectWithSelectClassOnly {
	public static WebDriver driver;

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country=By.id("Form_submitForm_Country");
		//driver.findElement(country).sendKeys("Canada");
		
//		Select select=new Select(driver.findElement(country));
//		List<WebElement>optionList=select.getOptions();
//		
//		for(WebElement e:optionList) {
//			String text=e.getText();// store in var, then use it is this kind of cases
//			System.out.println(text);
//			if(text.equals("Canada")) {
//				e.click();
//				break;
//			}
//		}
		
//		doSelectValuUsingOptions(country,"Canada");
//		List<WebElement>optionList=(List<WebElement>) driver.findElement(By.xpath("//select[@id='Form_submitForm_Country']/option"));
		By countryOptions=By.xpath("//select[@id='Form_submitForm_Country']/option");
		doSelectValuFromDropDown(country,"Canada");
	}
	
	public static void doSelectValuFromDropDown(By locator,String value) {
		List<WebElement>optionList=driver.findElements(locator);
		
		for(WebElement e:optionList) {
			String text=e.getText();// store in var, then use it is this kind of cases
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}
		}

	}
public static void doSelectValuUsingOptions(By locator,String value) {
	Select select=new Select(driver.findElement(locator));
	List<WebElement>optionList=select.getOptions();
	
	for(WebElement e:optionList) {
		String text=e.getText();// store in var, then use it is this kind of cases
		System.out.println(text);
		if(text.equals(value)) {
			e.click();
			break;
		}
	}

}
}
