package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert=driver.switchTo().alert();//JS Methods:alert(),prompt(),confirm()
//NoAlertPresentException: no such alert(if alert pop up is not present on the page )
		
		String text=alert.getText();
		System.out.println(text);
		
		alert.accept();
		alert.dismiss();
		alert.sendKeys("testing");
	}

}
