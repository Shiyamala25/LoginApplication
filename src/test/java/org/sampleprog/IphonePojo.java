package org.sampleprog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.LibGeneric;

public class IphonePojo extends LibGeneric {
	public IphonePojo() {
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement txtIphone;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement btnSearch;
	
	@FindBy(xpath="//span[@class='a-dropdown-prompt']")
	private WebElement btnClick;
	
	
	

}
