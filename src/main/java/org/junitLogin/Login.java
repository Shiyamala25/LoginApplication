/*package org.junitLogin;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.pojo.LoginPojo;

import baseclass.LibGeneric;

public class Login {
	static LibGeneric l = new LibGeneric();

	@BeforeClass
	public static void tc6() {
		String url = " http://automationpractice.com/index.php?controller=authentication&back=my-account";
		WebDriver d = l.browserLaunch();
		l.launchUrl(url);
	}

	@Before
	public void tc4() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void tc8() throws IOException {
		LoginPojo login = new LoginPojo();
		l.sendKeys(login.getTxtEmail(), l.excelRead(1, 0));
		l.sendKeys(login.getTxtPasswd(), l.excelRead(1, 1));
		l.btnClick(login.getBtnSignIn());
	}
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
	}

	@Test
	public void tc3() {
		System.out.println("Test Case 3");
	}

	@Test
	public void tc2() {
		System.out.println("Test Case 2");
	}

	@After
	public void tc5() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterClass
	public static void tc7() {
		l.browserClose();
	}

}
*/