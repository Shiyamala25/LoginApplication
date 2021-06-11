package org.testngSample;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SuiteA {
	@Parameters({"username","password"})
	@Test
	private void tc1(@Optional("Java") String s1, @Optional("Selenium") String s2) {	
		// Login
		System.out.println("Test Case 1");
		System.out.println(s1);
		System.out.println(s2);
	}

	@Test
	private void tc3() {
		System.out.println("Test Case 3");
	}

	@Test
	private void tc2() {
		System.out.println("Test Case 2");
	}

}
