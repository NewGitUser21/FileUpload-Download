package File.FileUploadandDownload;

import java.awt.AWTException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class DownLoadFileUsingChromeOptionsClass 
{
    
	@SuppressWarnings("deprecation")
	@Test
	public void UploadFilePlusRobot() throws InterruptedException, AWTException {
		  
		 String projectPath = System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver", projectPath + "/Driver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();	 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 String downloadFilepath = "E:\\Download";
		 
	        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	        chromePrefs.put("profile.default_content_settings.popups", 0);
	        chromePrefs.put("download.default_directory", downloadFilepath);
	        ChromeOptions options = new ChromeOptions();
	        options.setExperimentalOption("prefs", chromePrefs);
	        options.addArguments("--test-type");
	        options.addArguments("--disable-extensions"); //to disable browser extension pop-up
	        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	        driver = new ChromeDriver(options);  
	        driver.get("http://www.seleniumhq.org/download/");
	        Thread.sleep(3000);
	        //driver.findElement(By.linkText("32 bit Windows IE")).click();
	        driver.findElement(By.xpath("//a[contains(text(),'32 bit Windows IE')]")).click();
	                 
		 }

}
