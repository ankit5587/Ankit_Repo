package Shadow.DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShadowDomExample {
	WebDriver driver;
	String driverPath = "C:\\eclipse\\";
	@BeforeTest
	public void setup(){
		System.out.println("Opening chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
		driver = new ChromeDriver();
		}
	@Test
	public void testGetText_FromShadowDOMElements() {
		System.out.println("Open Chrome downloads");
		driver.get("chrome://downloads/");	
		System.out.println("Validate downloads page header text");
		WebElement root1 = driver.findElement(By.tagName("downloads-manager"));
		
		 //Get shadow root element
		WebElement shadowRoot1 = expandRootElement(root1);
		
		WebElement root2 = shadowRoot1.findElement(By.cssSelector("downloads-toolbar"));
		
		WebElement shadowRoot2 = expandRootElement(root2);
		
		WebElement root3 = shadowRoot2.findElement(By.cssSelector("cr-toolbar"));
		
		WebElement shadowRoot3 = expandRootElement(root3);
		
		String actualHeading = shadowRoot3.findElement(By.cssSelector("div[id=leftContent]>h1")).getText();
		// Verify header title
		Assert.assertEquals("Downloads", actualHeading);		
		
	}
	
	
	
	private WebElement expandRootElement(WebElement element) {
		WebElement ele = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot",element);
						return ele;
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
	