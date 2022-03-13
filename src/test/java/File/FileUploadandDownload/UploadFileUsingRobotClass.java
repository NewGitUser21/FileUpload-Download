package File.FileUploadandDownload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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
public class UploadFileUsingRobotClass 
{
    
	@SuppressWarnings("deprecation")
	@Test
	public void UploadFilePlusRobot() throws InterruptedException, AWTException {
		  
		 String projectPath = System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver", projectPath + "/Driver/chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
			
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		 Thread.sleep(2000);
		 Actions act= new Actions(driver); 
		 WebElement chooseFile=driver.findElement(By.xpath("//input[@id='fileupload1']"));
		 act.moveToElement(chooseFile).click().perform(); 
		 Thread.sleep(1000); 
		 uploadFile("C:\\Users\\DELL\\OneDrive\\Desktop\\UIDAI Error Code sp.png");
		 }
	
	public static void setClipBoard(String file) {
		  StringSelection obj= new StringSelection(file);
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
		 }
	
	public static void uploadFile(String filePath) throws AWTException {
		  setClipBoard(filePath);
		  Robot rb= new Robot();
		  rb.keyPress(KeyEvent.VK_CONTROL);
		  rb.keyPress(KeyEvent.VK_V);
		  rb.keyRelease(KeyEvent.VK_CONTROL);
		  rb.keyRelease(KeyEvent.VK_V);
		  rb.keyPress(KeyEvent.VK_ENTER);
		  rb.keyRelease(KeyEvent.VK_ENTER);
		 }
	
}
