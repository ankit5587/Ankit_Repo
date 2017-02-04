package cookies;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoCookies {
	   
	static WebDriver wd;

	   @Test
	   public void login() throws IOException{   
		   //openBrowser();
		
		   System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		    wd = new ChromeDriver();
		    wd.get("http://stackoverflow.com");
		    wd.manage().window().maximize();   
		   
		File f = new File("cookies.data");
		f.delete();		
		f.createNewFile();
		FileWriter fileWrite = new FileWriter(f);	
		BufferedWriter Bwrite = new BufferedWriter(fileWrite);

		for(Cookie ck : wd.manage().getCookies())							
        {		
            Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
            Bwrite.newLine();			
        }		
		
		Bwrite.flush();			
        Bwrite.close();			
        fileWrite.close();	
		
		}
}
