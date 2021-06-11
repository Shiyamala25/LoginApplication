package org.adactinPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.LibGeneric;

public class SelectHotel extends LibGeneric {
	public SelectHotel() {
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement clickButton;
	
	@FindBy(id="continue")
	private WebElement clickContinue;

	public WebElement getClickButton() {
		return clickButton;
	}

	public WebElement getClickContinue() {
		return clickContinue;
	}

}
