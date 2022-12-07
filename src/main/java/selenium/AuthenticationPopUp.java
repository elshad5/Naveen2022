package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String username="admin";
		String pwd="admin";
		driver.get("https://"+username+":"+pwd+"@"+"the-internet.herokuapp.com/basic_auth");
		
		
	}

}
