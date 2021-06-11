/*package org.adactinJunit;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import baseclass.LibGeneric;

public class AdactinHotelLogin {
	static LibGeneric lib = new LibGeneric();
	static WebDriver driver;

	@BeforeClass
	public static void tc1() {
		String url = "http://adactinhotelapp.com/";
		driver = lib.browserLaunch();
		lib.launchUrl(url);
	}

	@Test
	public void tc2() throws IOException, InterruptedException {
		AdactinHotelPojo hotel = new AdactinHotelPojo();
		lib.sendKeys(hotel.getTxtUserName(), lib.excelRead(1, 0));
		lib.sendKeys(hotel.getTxtPassword(), lib.excelRead(1, 1));
		lib.btnClick(hotel.getBtnLogin());

		SearchHotelPojo search = new SearchHotelPojo();		
		lib.selectByValue(search.getSelectLocation(), lib.excelRead(1, 2));
		lib.selectByValue(search.getSelectHotel(), lib.excelRead(1, 3));
		lib.selectByVisibleText(search.getSelectRoomType(), lib.excelRead(1, 4));
		lib.selectByValue(search.getSelectNoOfRooms(), lib.excelRead(1, 5));
		lib.sendKeys(search.getTxtDateIn(), lib.excelRead(1, 6));
		lib.sendKeys(search.getTxtDateOut(), lib.excelRead(1, 7));
		lib.selectByValue(search.getSelectAdultsPerRoom(), lib.excelRead(1, 8));
		lib.selectByValue(search.getSelectChildrenPerRom(), lib.excelRead(1, 9));
		lib.btnClick(search.getBtnSearch());
		
		SelectHotelPojo select = new SelectHotelPojo();
		lib.btnClick(select.getBtnClick());
		lib.btnClick(select.getBtnContinue());
		
		BookAHotel login = new BookAHotel();
		lib.sendKeys(login.getTxtFirstName(), lib.excelRead(1, 10));
		lib.sendKeys(login.getTxtLastName(), lib.excelRead(1, 11));
		lib.sendKeys(login.getTxtAddress(), lib.excelRead(1, 12));
		lib.sendKeys(login.getCreditCardNo(), lib.excelRead(1, 13));
		lib.selectByValue(login.getCreditCardType(), lib.excelRead(1, 14));
		lib.selectByValue(login.getExpMonth(), lib.excelRead(1, 15));
		lib.selectByValue(login.getExpYear(), lib.excelRead(1, 16));
		lib.sendKeys(login.getCvvNumber(), lib.excelRead(1, 17));
		lib.btnClick(login.getBookAHotel());
		Thread.sleep(7000);
		lib.btnClick(login.getLogout());
		
		
		
	}

}
*/