package org.sample.wd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestJunit2 {

	@Test()
	public void new1() {
	System.out.println("New Test Method");
	}
	
	@Test
	public void new2() {
		System.out.println("New Test Method 2");
	}
	
	@Test
	public void new3() {
		System.out.println("New Test Method 3");
	}
	
	@Test
	public void new4() {
		
		System.out.println("New Test Method 4"); 
	}
	@Ignore
	@Test
	public void new5() {
		System.out.println("New Test Method 5");
	}
	
	@Before
	public void before() {
		System.out.println();
		System.out.println("Before Second Test");
	}
	
	@After
	public void after() {
		System.out.println("After Second Test");
	}
	
	@BeforeClass
	public static void secondBeforeclass() {
		System.out.println("Start Second Program");
	}
	
	@AfterClass
	public static void secondAfterclass() {
		System.out.println("End Second Program");
	}
}
