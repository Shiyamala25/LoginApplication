package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.LibGeneric;

public class LoginPojo extends LibGeneric{

	public LoginPojo() {
		PageFactory.initElements(driver,this);		
	}
	@FindBy(id="email")
	public WebElement txtEmail;
	
	@FindBy(name = "passwd")
	public WebElement txtPasswd;
	
	@FindBy(id = "SubmitLogin")
	public WebElement btnSignIn;
	
	
		
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPasswd() {
		return txtPasswd;
	}

	public WebElement getBtnSignIn() {
		return btnSignIn;
	}
		
	
}
