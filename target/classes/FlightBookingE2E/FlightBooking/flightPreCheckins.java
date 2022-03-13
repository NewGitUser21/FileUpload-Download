/**
 * 
 */
package FlightBookingE2E.FlightBooking;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

/**
 * @author DELL
 *
 */
public class flightPreCheckins extends pageFactoryFlightBooking {
	
    public static WebDriver driver;
	
	public static Logger log = LogManager.getLogger(base.class.getName());

	public flightPreCheckins(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void preCheckings() throws InterruptedException
	{
		
		//Verifying one-way is selected
		Assert.assertTrue(tripType().isSelected());
		
		Reporter.log("One-Way trip is selected");
		
		selectCountry().sendKeys("ind");
		
				
    	//Thread.sleep(3000);
    	
	    List<WebElement> options = (List<WebElement>) selectCountryFromList(); 
	    //find elements not element
    	
	    for(WebElement option :options)
	    {
	    	if(option.getText().equalsIgnoreCase("India"))
	    	{
	    		option.click();
	    		break;
	    	}
	    }
	    
	    Reporter.log("Country - India is selected from list of available countries");
	    
	  
	    verifySeniorCitizenDiscount().click();
    	
	    Reporter.log("Senior-Citizen check box is selected");
		
	}
	
	
}
