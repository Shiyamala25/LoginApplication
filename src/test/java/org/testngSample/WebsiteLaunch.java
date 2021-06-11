package org.testngSample;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.LibGeneric;

public class WebsiteLaunch {

	LibGeneric lib = new LibGeneric();
	WebDriver driver;
	
	
	@Test
	private void chrome() {
		String url = "http://www.greenstechnologys.com/";
		driver = lib.browserLaunch();
		driver.get("https://www.google.com/");
		lib.launchUrl(url);
		driver.quit();
	}
	
	@Test
	private void internetExplorer() {
		String url = "http://www.greenstechnologys.com/";
		driver = lib.browserLaunch();
		driver.get("https://in.yahoo.com/");
		lib.launchUrl(url);
		
	}

	@Test
	private void firefox(){
		String url = "http://www.greenstechnologys.com/";
		driver = lib.browserLaunch();
		driver.get("https://www.firefox.com");
		lib.launchUrl(url);
		
	}

}
