/*package org.redBusJunit;

import java.io.IOException;

import org.facebookJunit.FacebookPojo;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseclass.LibGeneric;
import junit.framework.Assert;

public class RedbusLogin {
	
	static LibGeneric lib = new LibGeneric();
	static WebDriver driver;
	
	@BeforeClass
	public static void tc1() {
		String url = "https://www.flipkart.com/account/login";
		driver = lib.browserLaunch();
		lib.launchUrl(url);		
	}	
	
	@Test
	public void tc5() throws IOException, InterruptedException {
		RedbusPojo login = new RedbusPojo();
		//WebElement txtEmail = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		//txtEmail.sendKeys("shiyamalamphil.maths@gmail.com");
		lib.sendKeys(login.getTxtEmail(), lib.excelRead(0, 0));
		lib.sendKeys(login.getTxtPassword(), lib.excelRead(1, 1));
		lib.btnClick(login.getBtnSignIn());	
		
		//Thread.sleep(1000);
		//WebElement findElement = driver.findElement(By.className("_9ay7"));
		//String text = findElement.getText();
		//System.out.println(text);
		
		//Assert.assertEquals("The email address you entered isn't connected to an account. Find your account and log in.",
				//text);
	}

}
*/