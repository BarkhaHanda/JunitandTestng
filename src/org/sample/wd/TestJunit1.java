package org.sample.wd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestJunit1 {

	@Test
	public void test() {
		System.out.println("Test Method 1");
	}
	
	@Test
		public void test2() {
			System.out.println("Test Method 2");	
		}
	@Ignore
	@Test
	public void test3() {
		
		System.out.println("Test Method 3");
	}
	
	@Test
	public void test4() {
		System.out.println("Test Method 4");
	}
	
	@Before
	public void testBefore() {
		System.out.println();
		System.out.println("Before test");
	}
	
	@After
	public void testAfter() {
			System.out.println("After Test");
	}
	
	@BeforeClass
	public static void startProgram() {
	
		System.out.println("Start First Program");
	}
	@AfterClass
	public static void endProgram() {
		System.out.println("End First Program");
		
	}
	}
	