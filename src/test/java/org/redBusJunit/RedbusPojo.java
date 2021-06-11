package org.redBusJunit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.LibGeneric;

public class RedbusPojo extends LibGeneric{

	public RedbusPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy//input[@class='_2IX_2- VJZDxU']
	private WebElement txtEmail;
	
	@FindBy(className="_2IX_2- _3mctLh VJZDxU")
	private WebElement txtPassword;
	
	@FindBy(className="_2KpZ6l _2HKlqd _3AWRsL")
	private WebElement btnSignIn;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnSignIn() {
		return btnSignIn;
	}
	
	

}
