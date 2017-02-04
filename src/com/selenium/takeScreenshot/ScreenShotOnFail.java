package com.selenium.takeScreenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.selenium.takeScreenshot.ListnerClass.class)
public class ScreenShotOnFail {

		
	static WebDriver WD= null;
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
	public void checkPageTitle() throws Exception{
		
		WD.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div[7]/a/img")).click();
		System.out.println(xx);
		Assert.assertEquals(xx, "https://www.hsbc.co.in/1/2/homepag");
	}
	
	public static void getscreenshot() throws Exception{
		
		File src= ((TakesScreenshot)WD).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\ankit\\Pictures\\ankit.png"));
	}
	
	
	@AfterTest
	public void closeBrowser()
	{
		WD.quit();
	}
}
