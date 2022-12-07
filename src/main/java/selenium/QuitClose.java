package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launch chrome
		
		driver.get("https://naveenautomationlabs.com/opencart/");//enter url
		
		String title=driver.getTitle();//get the title
		System.out.println("page title is: "+title);
		 		
		String url=driver.getCurrentUrl();
		System.out.println("Current url is: "+url);
		
		
//		driver.quit();
		driver.close();//close browser
		
//		driver=new ChromeDriver();//open browser again
//		driver.get("https://naveenautomationlabs.com/opencart/");//enter url again
		
//		System.out.println(driver.getTitle());
	}

}
