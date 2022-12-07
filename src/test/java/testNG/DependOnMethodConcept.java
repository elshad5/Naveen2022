package testNG;

import org.testng.annotations.Test;

public class DependOnMethodConcept {

	
	@Test
	public void loginTest() {
		System.out.println("login test");
//		int i=9/0;
	}
	
	@Test(dependsOnMethods="loginTest")// it is not good practice, since if the the one depending is failing it is going skip
	public void homeTest() {
		System.out.println("home test");
	}
	
//	@Test
//	public void searchTest() {
//		System.out.println("search test");
//	}
}
