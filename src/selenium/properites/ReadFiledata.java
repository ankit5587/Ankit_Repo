package selenium.properites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFiledata {
	    public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\ankit\\workspace1\\Selenium\\src\\selenium\\properites\\datafile.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		//System.setProperty(prop.getProperty("chrome"),prop.getProperty("driverPath"));
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.id("Email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("Passwd")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("SignIn")).click();
		
	}

}
