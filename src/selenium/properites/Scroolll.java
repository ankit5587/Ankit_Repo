package selenium.properites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Scroolll {

	WebDriver driver;
	String URL = "https://www.youtube.com/";

	@BeforeClass
	public void setUp() throws Exception {
		File file = new File("C:\\Users\\ankit\\workspace1\\Selenium\\src\\selenium\\properites\\datafile.properties");
	
		 FileInputStream fileInput = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fileInput);
		
		//System.setProperty(prop.getProperty("chrome"),prop.getProperty("driverPath"));
		
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();

	}	
		@Test(priority=1)
		public void scrollingToBottomofAPage() 
		{
		driver.navigate().to(URL);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}
		
		@Test(priority=2)
		public void scrollingToElementofAPage() {
			driver.navigate().to("https://www.youtube.com/yt/copyright/");
			WebElement element = driver.findElement(By.partialLinkText("How Content ID works"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		
		}
		@Test(priority=3)
		public void scrollingByCoordinatesofAPage() {
			driver.navigate().to("https://support.google.com/youtube/answer/2797370");
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		}
		
		
	}
