package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {
static WebDriver driver;
	public static void main(String[] args) {
// copy paste from Naveen materials
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-qualifier-2022-1321451/jersey-vs-united-states-of-america-2nd-match-group-a-1321466/full-scorecard");
		
		getWicketTakerName("Shafali Verma");
		
		
		
		
		

	}
	
	public static String  getWicketTakerName(String playerName) {
		String wickettaker=driver.findElement(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td")).getText();
		return wickettaker;
	}
//	public static String  getPlayerScoreCardList(String playerName) {
//		driver.findElements(By.xpath(""))
//	}
}
