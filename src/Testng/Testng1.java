package Testng;

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;

	public class Testng1 {

			@Test(enabled=false,priority=1,groups="Smoke")
			public void new1() {
			System.out.println("New Testng Method");
			}
			
			@Test(priority=2,groups="Smoke")
			
			public void new2() {
				System.out.println("New Testng Method 2");
			}
			
			@Test(priority=3,groups="Smoke")
			public void new3() {
				System.out.println("New Testng Method 3");
			}
			
			@Test(priority=4,groups="Smoke")
			public void new4() {
				
				System.out.println("New Testng Method 4"); 
			}
			
			@Test(priority=5,groups="Smoke")
			public void new5() {
				System.out.println("New Testng Method 5");
			}
			
			@BeforeMethod
			public void before() {
				System.out.println();
				System.out.println("Before Test");
			}
			
			@AfterMethod
			public void after() {
				System.out.println("After Test");
			}
			
			@BeforeClass
			public static void secondBeforeclass() {
				System.out.println("Start First Program");
			}
			
			@AfterClass
			public static void secondAfterclass() {
				System.out.println("End First Program");
			}
		}