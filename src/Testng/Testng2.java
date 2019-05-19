package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng2 {

	@Test(priority=1,groups="Sanity")
	public void Test1() {
	System.out.println("Second Testng method 1");
	}
	
	@Test(priority=2,groups="Sanity")
	
	public void Test2() {
		System.out.println("Second Testng method 2");
	}
	
	@Test(priority=3,groups= {"Sanity","Regression"})
	public void Test3() {
		System.out.println("Second Testng method 3");
	}
	
	@Test(priority=4,groups="Sanity")
	public void Test4() {
		
		System.out.println("Second Testng method 4"); 
	}
	
	@Test(priority=5,groups="Sanity")
	public void Test5() {
		System.out.println("Second Testng method 5");
	}
	
	@BeforeMethod
	public void before() {
		System.out.println();
		System.out.println("Before Second Testng");
	}
	
	@AfterMethod
	public void after() {
		System.out.println("After Second Testng");
	}
	
	@BeforeClass
	public static void secondBeforeclass() {
		System.out.println("Start Second TestngProgram");
	}
	
	@AfterClass
	public static void secondAfterclass() {
		System.out.println("End Second Testng Program");
	}
	
}
