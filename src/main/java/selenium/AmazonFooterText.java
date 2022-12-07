package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonFooterText {
static WebDriver driver;
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		
		System.out.println(getHeaderValue("Careers"));
		System.out.println(getHeaderValue("Sell on Amazon Handmade"));
		System.out.println(getHeaderValue("Gift Cards"));
		System.out.println(getHeaderValue("Returns Are Easy"));
		
		// copy paste from Naveen materials
	}
	
	public static String getHeaderValue(String footerLinkText) {
		String header=driver.findElement(By.xpath("//a[text()='"+footerLinkText+"']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div"))
				.getText();
		return header;
	}

}
