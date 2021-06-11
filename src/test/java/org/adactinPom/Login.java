package org.adactinPom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import baseclass.LibGeneric;

public class Login{

	public static void main(String[] args) throws IOException, InterruptedException {

		String url = "https://adactinhotelapp.com/";
		LibGeneric lib = new LibGeneric();
		WebDriver driver = lib.browserLaunch();
		lib.launchUrl(url);	
		
		AdactinLoginPojo login = new AdactinLoginPojo();		
		lib.sendKeys(login.getTxtUserName(), lib.excelRead(1,0 ));
		lib.sendKeys(login.getTxtPassword(), lib.excelRead(1, 1));
		lib.btnClick(login.getBtnLogin());
		String title = lib.title();
		System.out.println(title);
		
		
		SearchHotelPojo hlogin = new SearchHotelPojo();
		lib.selectByValue(hlogin.getLocation(), lib.excelRead(1, 2));		
		lib.selectByValue(hlogin.getHotels(), lib.excelRead(1,3));
		lib.selectByValue(hlogin.getRoomType(), lib.excelRead(1,4));
		lib.selectByValue(hlogin.getNoOfRooms(), lib.excelRead(1,5));
		lib.sendKeys(hlogin.getDateIn(), lib.excelRead(1,6));
		lib.sendKeys(hlogin.getDateOut(), lib.excelRead(1,7));
		lib.selectByValue(hlogin.getAdultsPerRoom(), lib.excelRead(1,8));
		lib.selectByValue(hlogin.getChildrenPerRoom(), lib.excelRead(1,9));
		lib.btnClick(hlogin.getClickSubmit());
		
		
		SelectHotel sel = new SelectHotel();
		lib.btnClick(sel.getClickButton());
		lib.btnClick(sel.getClickContinue());
		
		BookAHotel blogin = new BookAHotel();
		lib.sendKeys(blogin.getTxtFirstName(), lib.excelRead(1,10));
		lib.sendKeys(blogin.getTxtLastName(), lib.excelRead(1,11));
		lib.sendKeys(blogin.getTxtAddress(), lib.excelRead(1,12));
		lib.sendKeys(blogin.getTxtCreditCardcNumber(), lib.excelRead(1,13));
		lib.selectByValue(blogin.getSelectCreditCardType(), lib.excelRead(1,14));
		lib.selectByValue(blogin.getSelectExpMonth(), lib.excelRead(1,15));
		lib.selectByValue(blogin.getSelectExpYear(), lib.excelRead(1,16));
		lib.sendKeys(blogin.getTxtCvvNumber(), lib.excelRead(1,17));
		lib.btnClick(blogin.getBtnClick());
		Thread.sleep(5000);
		lib.btnClick(blogin.getBtnLogout());
		
	}

}
