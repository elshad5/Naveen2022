package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElementConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		
		//SVG element:
		//   //*[local-name()='svg']/*[name()='g' and @fill-rule='evenodd']
		//   //*[name()='g' and @fill-rule='evenodd']
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

}
