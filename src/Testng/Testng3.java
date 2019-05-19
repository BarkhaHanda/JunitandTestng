package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Testng3 {

	@Test(groups="Regression",priority=1)
	public void Third1() {
		System.out.print("Third Test method1");
		
	}
	
	@Test(groups="Regression",priority=3)
	public void Third2() {
		System.out.println("Third Test method2");
		
	}
	
	@Test(groups="Regression",priority=2)
	public void Third3() {
		System.out.println("Third Test method3");
		
	}
	
	@BeforeMethod
	public void beforeThird() {
		System.out.println("Before Third Test Method");
		System.out.println();
	}
	
	@AfterMethod
	public void afterThird() {
		System.out.println("After Third Test Method");
		System.out.println();
	};
	
	@BeforeClass
	public static void beforeThirdclass() {
		System.out.println("Before Third class");


	}
	
	@AfterMethod
	public static void afterThirdclass() {
		System.out.println("After Third class");


	}
	
}
