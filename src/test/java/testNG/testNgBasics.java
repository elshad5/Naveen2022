package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNgBasics {

	//TestNG: java Unit testing FW
	//global pre condition
	//pre condition
	//test steps(test cases)+expected result vs actual result--Pass/Fail
	//post steps
	
	
	
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS- connectWithDB");
	}
	
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT- createUser");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC- launchBrowser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("BM- login");
	}
	
	@Test
	public void homePageTest(){
		System.out.println("Passed- homePageTest");
	}
	
	@Test
	public void searchTest(){
		System.out.println("Passed- searchTest");
	}
	
	@Test
	public void addToCartTest(){
		System.out.println("Passed- addToCartTest");
	}
	@AfterMethod
	public void logout() {
		System.out.println("AM- logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC- close Browser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT- deleteUser");
	}
	
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS- disconnectWithDB");
	}
	
	
}
