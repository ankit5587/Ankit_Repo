package cookies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnvSetup {
	

	@Test
	public static void openBrowser(){
	    WebDriver wd;
             
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
	    wd = new ChromeDriver();
	    wd.get("http://www.youtube.com/");
	    wd.manage().window().maximize();
	   
	    
	}
	
}
