package waitInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebDriversWait {
	
	private String URL="http://demos.telerik.com/aspnet-ajax/ajax/examples/loadingpanel/explicitshowhide/defaultcs.aspx";
	WebDriver driver;
	//WebDriverWait wait;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
	}

	@Test
	public void DynamicWait(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*Wait for grid to appear*/
		
		// container = By.cssSelector(".demo-container");
		//it = new WebDriverWait(driver,5);
	    //driver.wait.until(ExpectedConditions.presenceOfElementLocated(container));
		
		/*Get the text before performing an ajax call*/
		WebElement noDatesTextElement = driver.findElement(By.xpath("//div[@class='RadAjaxPanel']/span"));
		String textBeforeAjaxCall = noDatesTextElement.getText().trim();
		System.out.println(textBeforeAjaxCall);
		
		/*Click on the date*/
		driver.findElement(By.linkText("1")).click();
		
		/*Wait for loader to disappear */
		//By loader = By.className("raDiv");
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
		
		
		/*Get the text after ajax call*/
		WebElement selectedDatesTextElement = driver.findElement(By.xpath("//div[@class='RadAjaxPanel']/span"));
		//wait.until(ExpectedConditions.visibilityOf(selectedDatesTextElement));
		String textAfterAjaxCall = selectedDatesTextElement.getText().trim();
		System.out.println(textAfterAjaxCall);
	}
}

