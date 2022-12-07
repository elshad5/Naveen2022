package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// start the server with binary/.exe file
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // launch chrome
		
		// without protocol it will not work, but without www it will work
		driver.get("https://www.google.com");//enter url
		
		String title=driver.getTitle();// get the title
		System.out.println("page title is: "+title);
		
		//verification point/checkpoint/assertion/actual vs expected result
		if(title.equals("Google")) {
			System.out.println("correct title");
		}else {
			System.out.println("incorrect title");
		}
		
		// automation steps+verification point(checkpoint)=> Automation Testing
		
		String url=driver.getCurrentUrl();
		System.out.println("Current url is: "+url);
		
		// give all HTML DOM
//		String source=driver.getPageSource();
//		System.out.println("Page source is: "+source);
		
		
		driver.quit();// close the browser
		
	
	
	}

}
