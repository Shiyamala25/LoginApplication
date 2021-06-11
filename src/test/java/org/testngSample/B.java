package org.testngSample;

import org.testng.annotations.Test;

public class B {
	@Test(groups = "Smoke")
	private void tc4() {
		System.out.println("Test Case 4");
	}
	@Test(groups="Sanity")
	private void tc5() {
		System.out.println("Test Case 5");
	}
	@Test(groups="Adhoc")
	private void tc6() {
		System.out.println("Test Case 6");
	}

}
