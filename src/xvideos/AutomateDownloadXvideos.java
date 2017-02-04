package xvideos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



public class AutomateDownloadXvideos {
	 static WebDriver wd1;

    @Test
	public void OpenBrowser() {
        
    	System.setProperty("webdriver.chrome.driver","C:\\eclipse\\chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("user-data-dir=C:/Users/ankit/AppData/Local/Google/Chrome/User Data");
    	options.addArguments("--start-maximized");
    	wd1 = new ChromeDriver(options);
    	
    	wd1.get("http://www.youtube.com/");
	    wd1.manage().window().maximize();
	}

    @Test
    public void search(){
    	wd1.findElement(By.id("masthead-search-term")).sendKeys("Indian");
    	wd1.findElement(By.xpath("//*[@id=\"search-btn\"]")).click();
    	wd1.findElement(By.partialLinkText("Indian")).click();
    }
}
