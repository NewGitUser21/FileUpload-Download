package FlightBookingE2E.FlightBooking;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, SocketTimeoutException, IOException {
		// TODO Auto-generated method stub
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
    	
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    	   	
    	//Verifying one-way is selected
    	Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected());
    	System.out.println("One-Way trip is selected");
    	
    	//Auto suggested drop downs
    	driver.findElement(By.id("autosuggest")).sendKeys("ind");
    	Thread.sleep(3000);
	    List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); //findelements not element
    	
	    for(WebElement option :options)
	    {
	    	if(option.getText().equalsIgnoreCase("India"))
	    	{
	    		option.click();
	    		break;
	    	}
	    }
    	
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
    	
    	WebElement source;
    	source = driver.findElement(By.xpath("//a[@value='BLR']"));
    	source.click();
    	Thread.sleep(2000);
    	WebElement destination;
    	destination = driver.findElement(By.xpath("(//a[@value='MAA'])[2]")); //Considering index value
    	destination.click();
    	WebElement selCurdate;
    	selCurdate = driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")); //space replaced with (.)
    	Thread.sleep(2000);
    	selCurdate.click();
    	//Verifying second calendar is disabled for one-way trip
    	if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5")) //"1" for second calendar enabled
          {
        	  System.out.println("Second calendar is disabled");
        	  Assert.assertTrue(true);
	      }
    	else 
    	{
    		Assert.assertTrue(false);
    	}

    	driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
    	System.out.println("Senior Citizen Discount is checked");
    	
    	driver.findElement(By.id("divpaxinfo")).click();
    	Thread.sleep(2000);
    	for(int i=1;i<5;i++)
    	{
    		driver.findElement(By.id("hrefIncAdt")).click();
    		Thread.sleep(2000);
    	}
    	System.out.println("Total 5 Adult passengers are selected");
    	
    	Thread.sleep(2000);
    	driver.findElement(By.id("btnclosepaxoption")).click();
    	
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
    	Select dropdown = new Select(staticDropdown);
    	Thread.sleep(2000);
    	//select based on index number
    	dropdown.selectByIndex(1); //Indian Rupee
    	System.out.println("Equivalent Indian rupee is selected");
    	
    	Thread.sleep(2000);
    	driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
    	System.out.println("Hit on search button to confirm booking");
    	
        System.out.println("Test script run successfully");
    	
        //Below steps throws java.net.SocketException the browser is quitting before the response was retrived.
    	//Thread.sleep(2000);
    	//driver.close();
    	//driver.quit();
	}

}
