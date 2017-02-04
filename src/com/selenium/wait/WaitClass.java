package com.selenium.wait;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClass {

	public static void main(String[] args) {
		WebDriver wd;
        
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
	    wd = new ChromeDriver();
	    wd.get("http://learn-automation.com/explicit-wait-in-selenium-webdriver/");
	    wd.manage().window().maximize();
	    //wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    WebDriverWait  wait = new WebDriverWait(wd,20);
	    
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"null\"]")));
	    
	    System.out.println(element.isDisplayed());
	   // wd.findElement(By.xpath("//input[@id=\"null\"]")).sendKeys("ascdsvs@gmail.com");
	}

}
