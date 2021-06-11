package org.sampleprog;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AmazonIphones {	
	
	@Test
	public void ascendingOrder() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vignesh\\eclipse-workspace\\SeleniumDay4\\driver90\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		WebElement txtIphone = driver.findElement(By.id("twotabsearchtextbox"));
		txtIphone.sendKeys("iphones");		
		
		WebElement btnClick = driver.findElement(By.id("nav-search-submit-button"));
		btnClick.click();
				
		WebElement btnOption = driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
		btnOption.click();
				
		WebElement btnSelect = driver.findElement(By.xpath("(//a[@class='a-dropdown-link'])[1]"));
		btnSelect.click();
	
    }
}










