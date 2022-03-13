/**
 * 
 */
package FlightBookingE2E.FlightBooking;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



/**
 * @author DELL
 *
 */
public class baseNavigation extends base {
	
public static WebDriver driver;
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		//log.info("Driver is initialized");
		Reporter.log("Driver is initialized");
		
        String urlName = prop.getProperty("url");	
		driver.get(urlName);
		//log.info("Navigated to Home Page");
		Reporter.log("Navigated to Home Page");
		
	}
	
	@Test
	public static void PageNavigation() throws IOException, InterruptedException
	{ 
	
		flightPreCheckins cn = new flightPreCheckins(driver);
		cn.preCheckings();
		
		bookFlight bf = new bookFlight(driver);
		bf.bookFlightTicket();
		
		
	}

}
