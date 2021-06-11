package org.adactinJunit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.LibGeneric;

public class SelectHotelPojo extends LibGeneric {
	
	public SelectHotelPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement btnClick;
	
	@FindBy(id="continue")
	private WebElement btnContinue;
	

	public WebElement getBtnContinue() {
		return btnContinue;
	}


	public WebElement getBtnClick() {
		return btnClick;
	}

}
