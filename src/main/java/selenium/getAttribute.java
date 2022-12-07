package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getAttribute {
	static WebDriver driver;
public static void main(String [] args) {
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	ElementUtil eleUtil=new ElementUtil(driver);
//	String attrName=driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//	System.out.println(attrName);
	
//	String loginUrl=driver.findElement(By.linkText("Login")).getAttribute("href");
//System.out.println(loginUrl);
	
	By fn=By.id("input-firstname");
	By ln=By.linkText("Login");
	String placeholderVal=eleUtil.doGetAttribute(fn, "placeholder");
	String loginUrl=eleUtil.doGetAttribute(ln, "href");
System.out.println(placeholderVal);
System.out.println(loginUrl);

}
}
