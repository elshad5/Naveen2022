package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileOpload {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//type=file
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\elsha\\OneDrive\\Desktop\\SQL CHEAT SHEET.pdf");
		
		
		
	}

}
