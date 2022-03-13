/**
 * 
 */
package FlightBookingE2E.FlightBooking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

/**
 * @author DELL
 *
 */
public class bookFlight extends pageFactoryFlightBooking {
	
    public bookFlight(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebDriver driver;
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	public void bookFlightTicket() throws InterruptedException
	{
		
		selectOrigination().click();
			
		selectSource().click();
		
		Reporter.log("Bangalore is selected as boarding point");
		
    	//Thread.sleep(2000);
    	
    	selectDestination().click();
    	
    	Reporter.log("Chennai is selected as destination point");
    	
    	selectCurDate().click();
    	
    	Reporter.log("Current date is selected");
    	
    	//Verifying second calendar is disabled for one-way trip
    	if(verifysecCalenderDisabledOneWay().getAttribute("Style").contains("0.5")) 
    	//"1" for second calendar enabled
          {
        	  //System.out.println("Second calendar is disabled");
        	  Assert.assertTrue(true);
        	  
        	  Reporter.log("Second calendar is disabled while selecting flight");
	      }
    	else 
    	{
    		Assert.assertTrue(false);
    		
    		Reporter.log("Second calendar is not disabled while selecting flight");
    	}
    	
    	
    	
    	selectPassengers().click();
    	//Thread.sleep(2000);
    	for(int i=1;i<5;i++)
    	{
    		noOfPassengersAdded().click();
    		//Thread.sleep(2000);
    	}
    	    
    	Reporter.log("Number of Senior citizens selected for boarding from BLA to MAA are '5'");
    	
    	//Thread.sleep(2000);
    	selectbuttonforNoOfPassengersAdded().click();
    	
    	Reporter.log("Number of passengers are confirmed");
    	
        WebElement staticDropdown = selectCurrency();
    	Select dropdown = new Select(staticDropdown);
    	//Thread.sleep(2000);
    	//select based on index number
    	dropdown.selectByIndex(1); 
    	//Indian Rupee
    	
    	//System.out.println("Equivalent Indian rupee is selected");
    	
    	Reporter.log("Indian currency is selected");
    	
    	//Thread.sleep(2000);
    	confirmBooking().click();
    	
    	Reporter.log("Flight booking confirmed");
		
	}
}
