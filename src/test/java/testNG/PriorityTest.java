package testNG;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority=5)
	public void a_test() {
		System.out.println("A test");
	}
	
	@Test(priority=4)
	public void b_test() {
		System.out.println("B test");
	}
	
	@Test (priority=1)
	public void c_test() {
		System.out.println("C test");
	}
	
	@Test(priority=2)
	public void d_test() {
		System.out.println("D test");
	}
	
	@Test(priority=3 )
	public void e_test() {
		System.out.println("E test");
	}
}
