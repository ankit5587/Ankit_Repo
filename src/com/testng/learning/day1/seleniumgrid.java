package com.testng.learning.day1;

import java.net.URL;

import org.openqa.selenium.Platform;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class seleniumgrid {
	
	@Test
	public void checkPageTitle() throws Exception{
		
		DesiredCapabilities cp = DesiredCapabilities.firefox();
		cp.setPlatform(Platform.WINDOWS);
		URL url = new URL("http://localhost:4444/wd/hub");
		//System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		RemoteWebDriver  driver = new RemoteWebDriver(url, cp);
		
		driver.get("https://www.hsbc.co.in/1/2/homepage");
		
		System.out.println("current page titile is" + driver.getTitle());
		driver.close();
		
	}

}
