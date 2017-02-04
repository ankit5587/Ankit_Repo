package selenium.properites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class setup {
	WebDriver driver;
	String URL = "https://www.linkedin.com/";
	@Test
	public void setUP() throws Exception{
			File file = new File("C:\\Users\\ankit\\workspace1\\Selenium\\src\\selenium\\properites\\datafile.properties");
			
			FileInputStream fileInput = new FileInputStream(file);
			
			Properties prop = new Properties();
		    prop.load(fileInput);
			
		//	System.setProperty(prop.getProperty("chrome"),prop.getProperty("driverPath"));
			System.setProperty("webdriver.chrome.driver","C:\\eclipse\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
	}

}
