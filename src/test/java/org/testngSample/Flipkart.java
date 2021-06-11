package org.testngSample;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import baseclass.LibGeneric;

public class Flipkart {
	LibGeneric lib = new LibGeneric();
	WebDriver driver;

	@BeforeClass
	public void browserLaunch() {
		String url = "https://www.flipkart.com/account/login";
		driver = lib.browserLaunch();
		lib.launchUrl(url);
	}
	@Test
	public void flipkartLogin() throws InterruptedException {
		FlipkartPojo login = new FlipkartPojo();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','shiyamala@123')", login.getTxtEmail());
		js.executeScript("arguments[0].setAttribute('value','123456')", login.getTxtPassword());
		js.executeScript("arguments[0].click()", login.getBtnClick());
				
	}
	
}		

	