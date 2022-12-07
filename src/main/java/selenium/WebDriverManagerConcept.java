package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverManagerConcept {

	public static void main(String[] args) {
//we dont need it anymore, since we use webdrivermanager by garcia
//		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		
WebDriverManager.chromedriver().setup();	
WebDriver driver=new ChromeDriver();

		//Naveen said this one not popular since it close driver automatically 
		//WebDriver driver=WebDriverManager.chromedriver().create();
		
		
//driver.get("https://naveenautomationlabs.com/opencart/");
driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title=driver.getTitle();
		System.out.println("page title is: "+title);
	}
}
