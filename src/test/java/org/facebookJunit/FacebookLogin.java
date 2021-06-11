/*package org.facebookJunit;

import java.io.IOException;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import baseclass.LibGeneric;
import junit.framework.Assert;


public class FacebookLogin {

	static LibGeneric lib = new LibGeneric();
	static WebDriver driver;
	
	@BeforeClass
	public static void tc1() {
		String url = "https://en-gb.facebook.com/";
		driver = lib.browserLaunch();
		lib.launchUrl(url);		
	}	
	
	@SuppressWarnings("deprecation")
	@Test
	public void tc5() throws IOException, InterruptedException {
		FacebookPojo login = new FacebookPojo();
		lib.sendKeys(login.getTxtEmail(), lib.excelRead(1, 0));
		lib.sendKeys(login.getTxtPassword(), lib.excelRead(1, 1));
		lib.btnClick(login.getBtnLogin());	
		Thread.sleep(5000);
		WebElement findElement = driver.findElement(By.className("_9ay7"));
		String text = findElement.getText();
		System.out.println(text);
		Assert.assertEquals("The email address you entered isn't connected to an account. Find your account and log in.",
				text);
	}
	

}
*/