package org.adactinJunit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import baseclass.LibGeneric;

public class SearchHotelPojo extends LibGeneric {
	
	public  SearchHotelPojo() {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(id="location")
	private WebElement selectLocation;
		
	@FindBy(id="hotels")
	private WebElement selectHotel;
	
	@FindBy(id="room_type")
	private WebElement selectRoomType;

	@FindBy(id="room_nos")
	private WebElement selectNoOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement txtDateIn;
	
	@FindBy(id="datepick_out")
	private WebElement txtDateOut;
	
	@FindBy(id="adult_room")
	private WebElement selectAdultsPerRoom;
	
	@FindBy(id="child_room")
	private WebElement selectChildrenPerRom;
	
	@FindBy(id="Submit")
	private WebElement btnSearch;
	
	public WebElement getSelectLocation() {
		return selectLocation;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getSelectRoomType() {
		return selectRoomType;
	}

	public WebElement getSelectNoOfRooms() {
		return selectNoOfRooms;
	}

	public WebElement getTxtDateIn() {
		return txtDateIn;
	}

	public WebElement getTxtDateOut() {
		return txtDateOut;
	}

	public WebElement getSelectAdultsPerRoom() {
		return selectAdultsPerRoom;
	}

	public WebElement getSelectChildrenPerRom() {
		return selectChildrenPerRom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	
}
