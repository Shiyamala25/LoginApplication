package org.testngSample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A {

	@BeforeClass
	private void tc6() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	private void tc4() {
		System.out.println("Before Method");
	}

	@Test(priority = -1, invocationCount = 10)
	private void tc1() {
		System.out.println("Test Case 1");
	}

	@Test(priority = 0)
	private void tc3() {
		System.out.println("Test Case 3");
	}

	@Test(priority = 1, enabled = false)
	private void tc2() {
		System.out.println("Test Case 2");
	}

	@AfterMethod
	private void tc5() {
		System.out.println("After Method");
	}

	@AfterClass
	private void tc7() {
		System.out.println("After Class");
	}

}
