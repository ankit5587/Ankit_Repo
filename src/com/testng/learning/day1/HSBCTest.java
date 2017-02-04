package com.testng.learning.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HSBCTest {
	
	WebDriver WD;
	String xx;

	@BeforeTest
	public void openBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		WD = new ChromeDriver();
		WD.get("https://www.hsbc.co.in/1/2/homepage");
		WD.getClass();
		 xx = WD.getCurrentUrl();
		WD.getPageSource();
		WD.getWindowHandle();
		WD.manage().window().maximize();
		
	}
	@Test
	public void checkPageTitle(){
		
		WD.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div[7]/a/img")).click();
		System.out.println(xx);
		Assert.assertEquals(xx, "https://www.hsbc.co.in/1/2/homepage");
		
		
	}
}
