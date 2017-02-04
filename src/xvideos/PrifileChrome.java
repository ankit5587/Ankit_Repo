package xvideos;
/*import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;*/
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.Select;
import org.testng.internal.thread.TestNGThread;

public class PrifileChrome {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		String userProfile = "C:\\Users\\ankit\\AppData\\Local\\Google\\Chrome\\User Data\\";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=" + userProfile);
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("http://www.metacafe.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-href='http://www.metacafe.com/login/']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("login_email")).sendKeys("ankitbajaj1008@gmail.com");
		
		driver.findElement(By.id("login_pass")).sendKeys("33341988");
		
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     System.out.println("bdivdfnviofdbf");
	     driver.findElement(By.xpath("//*[@id=\"mc-header\"]/div/div[3]/div[1]")).click();
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     //  driver.findElement(By.id("mc-header-addpost-list")).click();
	     //driver.findElement(By.xpath("//*[@id=\"mc-header-addpost-list\"]/a[2]']")).click();
	     driver.findElement(By.linkText("Gallery")).click();
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     driver.findElement(By.id("mc-upload-file-select")).click();
	     System.out.println("vvvvvvvvvvvvvvvvvv");
	     Runtime.getRuntime().exec("C:\\Users\\ankit\\Desktop\\autoIT\\fileopen.exe");
	     System.out.println("xxxxxxxxxxxxxxxxxx");
	     TestNGThread.sleep(5);
	     
	     //driver.findElement(By.name("comment_new_16161")).sendKeys("Hello thidndsoerngkoern");
	     driver.findElement(By.id("edit_album_title")).sendKeys("My first auotmation");
	     
	     driver.findElement(By.xpath("//textarea[@id='edit_album_description']")).sendKeys("Hi My name is ankit vfffffffffffffffffffff ffffffffff fffffffffff ffffffffff thidndsoerngkoern");
	     
	     driver.findElement(By.xpath("//*[@id=\"s2id_autogen1\"]")).click();
	     driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[5]")).click();
	     
	     
	     driver.findElement(By.xpath("//*[@id='s2id_edit_album_categories']")).click();
	     driver.findElement(By.xpath("/html/body/div[8]/ul")).click();
	     
	     driver.findElement(By.xpath("//*[@id='s2id_edit_album_categories']")).click();
	     driver.findElement(By.xpath("/html/body/div[8]/ul")).click();
	     
	     driver.findElement(By.xpath("//*[@id=\"edit_album_tags\"]")).sendKeys("dvdsvdv,vdsv/.,vdsvd,vsdv");
	     
	  //   driver.findElement(By.xpath("//*[@id='s2id_edit_album_categories']")).click();
	  //   driver.findElement(By.xpath("/html/body/div[8]/ul")).click();
	     
	     Thread.sleep(10);
	     driver.findElement(By.xpath("//*[@id=\"mc-btn-publish\"]")).getText();
	     driver.findElement(By.xpath("//*[@id=\"mc-btn-publish\"]")).click();
	 //    System.out.println(driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li")).getText());
	     System.out.println(driver.findElement(By.xpath("//*[@id=\"mc-channel\"]/div[2]/div[1]/div[2]/form/div[3]/div[2]/div/label/div")).getText());
	     
	     
	     // Select newSelect= new select(driver.findElement(By))
		// Select(driver.findElement(By.xpath("//*[@id=\"mc-header\"]/div/div[3]/div[1]")));
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// newSelect.selectByVisibleText("Galery");
		///
		// driver.findElement(By.xpath("//a[@href='http://www.metacafe.com/upload-photos/']")).click();
		/*
		 * driver.findElement(By.xpath(
		 * "//a[@href='http://www.metacafe.com/signup/']")).click();
		 * driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 * driver.findElement(By.id("signup_email")).sendKeys(
		 * "ankitbajaj1008@gmail.com");
		 * driver.findElement(By.id("signup_pass")).sendKeys("33341988");
		 * driver.findElement(By.id("signup_pass2")).sendKeys("33341988");
		 * driver.findElement(By.id("signup_username")).sendKeys("ankit bajaj");
		 * Select dSelect = new
		 * Select(driver.findElement(By.name("birth_date_Month")));
		 * dSelect.selectByVisibleText("December"); Select mSelect = new
		 * Select(driver.findElement(By.name("birth_date_Day")));
		 * mSelect.selectByVisibleText("10"); Select ySelect = new
		 * Select(driver.findElement(By.name("birth_date_Year")));
		 * ySelect.selectByVisibleText("1988"); BufferedReader br = new
		 * BufferedReader(new InputStreamReader(System.in)); String captcha;
		 * System.out.println("Please Enter the CAPTCHA Code:: "); captcha =
		 * br.readLine();
		 * System.out.println("Entered  CAPTCHA Code is:: "+captcha);
		 * driver.findElement(By.id("signup_code")).sendKeys(captcha);
		 * driver.findElement(By.xpath("//button[@type='submit']")).click();
		 */
	}
}
// System.out.println("hihihcisc");
// WebElement err =
// driver.findElement(By.xpath("//div[@style='display']"));
/*
 * Robot robot = new Robot(); Thread.sleep(2000); robot.mousePress(2);
 */
// System.out.println("w2e223");
// System.out.println(err);

/*
 * public void search(){
 * driver.findElement(By.id("masthead-search-term")).sendKeys("Indian");
 * driver.findElement(By.xpath("//*[@id=\"search-btn\"]")).click();
 * driver.findElement(By.partialLinkText("Indian")).click();
 */
