package org.login;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseclass.LibGeneric;

public class Login {

	public static void main(String[] args) throws InterruptedException,AWTException, IOException  {		

		String url = " http://automationpractice.com/index.php?controller=authentication&back=my-account";
		
		LibGeneric l = new LibGeneric();		
		WebDriver d = l.browserLaunch();
		l.launchUrl(url);		
		
		WebElement txtEmail = d.findElement(By.id("email"));
		l.sendKeys(txtEmail, "shiyamala@gmail.com");
		
		WebElement txtPassword = d.findElement(By.name("passwd"));
		l.sendKeys(txtPassword, "123456");
		
		WebElement btnSignin = d.findElement(By.id("SubmitLogin"));
		l.btnClick(btnSignin);
		
		String title = l.title();
		System.out.println(title);
	}

}
