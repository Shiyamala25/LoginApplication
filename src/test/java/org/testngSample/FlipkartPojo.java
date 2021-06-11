package org.testngSample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.LibGeneric;

public class FlipkartPojo extends LibGeneric {

	public FlipkartPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement txtEmail;
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement txtPassword;	
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement btnClick;
	
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}
}
