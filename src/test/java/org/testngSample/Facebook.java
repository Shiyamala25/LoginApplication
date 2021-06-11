package org.testngSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Facebook {
	WebDriver driver;

	@BeforeClass
	private void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vignesh\\eclipse-workspace\\SeleniumDemo\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
	}

	@Test
	private void fbUsername() {
		WebElement txtUsernmae = driver.findElement(By.id("email"));
		txtUsernmae.sendKeys("shiyamala@123");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("123456");
		
		WebElement btnClick = driver.findElement(By.name("login"));
		btnClick.click();
	}

}
