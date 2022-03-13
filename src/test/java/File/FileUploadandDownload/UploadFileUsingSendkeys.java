package File.FileUploadandDownload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class UploadFileUsingSendkeys 
{
    
	@SuppressWarnings("deprecation")
	@Test
	public void UploadFilePlusSendKeys() throws InterruptedException {
		  
		 String projectPath = System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver", projectPath + "/Driver/chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
			
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		 Thread.sleep(2000);
		 Actions act= new Actions(driver); 
		 WebElement chooseFile=driver.findElement(By.xpath("//input[@id='fileupload1']"));
		 act.moveToElement(chooseFile).perform(); 
		 Thread.sleep(1000); 
		 chooseFile.sendKeys("C:\\Users\\DELL\\OneDrive\\Desktop\\UIDAI Error Code sp.png");
		 }
	
}
