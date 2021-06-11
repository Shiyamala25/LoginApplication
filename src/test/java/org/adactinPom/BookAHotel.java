package org.adactinPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.LibGeneric;

public class BookAHotel extends LibGeneric {

	public BookAHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement txtFirstName ;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress ;
	
	@FindBy(id="cc_num")
	private WebElement txtCreditCardcNumber ;
	
	@FindBy(id="cc_type")
	private WebElement selectCreditCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement selectExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement selectExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCvvNumber;
	
	@FindBy(id="book_now")
	private WebElement btnClick;
	
	@FindBy(id="logout")
	private WebElement btnLogout;
	

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditCardcNumber() {
		return txtCreditCardcNumber;
	}

	public WebElement getSelectCreditCardType() {
		return selectCreditCardType;
	}

	public WebElement getSelectExpMonth() {
		return selectExpMonth;
	}

	public WebElement getSelectExpYear() {
		return selectExpYear;
	}

	public WebElement getTxtCvvNumber() {
		return txtCvvNumber;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}
	public WebElement getBtnLogout() {
		return btnLogout;
	}
}
