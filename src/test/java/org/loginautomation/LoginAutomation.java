package org.loginautomation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.pojo.LoginPojo;

import baseclass.LibGeneric;

public class LoginAutomation {

	public static void main(String[] args) throws IOException {

String url = " http://automationpractice.com/index.php?controller=authentication&back=my-account";
		
		LibGeneric l = new LibGeneric();		
		WebDriver d = l.browserLaunch();
		l.launchUrl(url);
		
		LoginPojo login = new LoginPojo();
		l.sendKeys(login.getTxtEmail(), l.excelRead(1, 0));
		l.sendKeys(login.getTxtPasswd(), l.excelRead(1, 1));
		l.btnClick(login.getBtnSignIn());
		String title = l.title();
		System.out.println(title);
	}

}
