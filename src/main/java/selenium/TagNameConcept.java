package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		ElementUtil eleUtil=new ElementUtil(driver);
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/product&product_id=43");
		
//		String prName=driver.findElement(By.tagName("h1")).getText();
//		System.out.print(prName);
//		By productHeader=By.tagName("h1");
//		By terms=By.linkText("Terms & Conditions");
//		
//		String acPrName=doElementGetText(productHeader);
//		if(acPrName.equals("MacBook")) {
//			System.out.println("product name is correct..Pass");
//		}else {
//			System.out.println("Fail");
//		}
//		System.out.println(doElementGetText(terms));
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By firstNameLabel=By.xpath("//label[text()='First Name']");
		System.out.println(eleUtil.doElementGetText(firstNameLabel));
	}


	

}
