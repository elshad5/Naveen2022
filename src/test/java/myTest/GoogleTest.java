package myTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	
	@Test(priority=1)
	public void titleTest() {
//		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
		
		
	@Test(priority=2, enabled=false)//true if I want to execute
	public void searchFieldTest() {
		Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
	}
	
	//CRUD
	//create a user-->@test1(Elshad)-X//disabled//parallel-th1
	
	//update a user-->@test2(update Elshad)-skipped//only test execution//th2

	
	//1. create a user(Elshad)
	
	//update a user-->
	//@test
	//1. create a user(Elshad)
	//2. update the same user(Elshad ph)
	
	//delete a user-->
		//@test
		//1. create a user (Elshad)
		//2. delete the same user (Elshad )
	
	//get a user-->
			//@test
			//1. create a user (Elshad)
			//2. delete the same user (Elshad )
	

}
