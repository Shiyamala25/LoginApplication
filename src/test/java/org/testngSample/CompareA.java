package org.testngSample;

import org.testng.annotations.Test;

public class CompareA {
	@Test(groups = { "Smoke", "Regression" })
	private void tc1() {
		System.out.println("Test Case 1");
	}
	
	@Test(groups = { "Adhoc", "Regression" })
	private void tc3() {
		System.out.println("Test Case 3");
	}
	
	@Test(groups = { "Smoke" })
	private void tc2() {
		System.out.println("Test Case 2");
	}

}
