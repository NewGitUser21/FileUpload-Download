/**
 * 
 */
package FlightBookingE2E.FlightBooking;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author DELL
 *
 */
public class pageFactoryFlightBooking {
	

	public WebDriver driver;
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	/*
	 * By productName = By.cssSelector("h4.product-name");
	 * 
	 * By addVegtables = By.xpath("//div[@class='product-action']/button");
	 */
//--------------------------------------------------------------------------------------	
	
	//FAILED: PageNavigation
	//java.lang.ClassCastException: class org.openqa.selenium.By$ById cannot be cast to class org.openqa.selenium.WebElement (org.openqa.selenium.By$ById and org.openqa.selenium.WebElement are in unnamed module of loader 'app')
	
	//By tripType = By.id("ctl00_mainContent_rbtnl_Trip_0");
	By tripType = By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_0']");
	
	//By selectCountry = By.id("autosuggest");
	By selectCountry = By.xpath("//*[@id='autosuggest']");
	
	By selectCountryFromList = By.cssSelector("li[class='ui-menu-item'] a");
	
	//By selectOrigination = By.id("ctl00_mainContent_ddl_originStation1_CTXT");
	By selectOrigination = By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']");
	
	By selectSource = By.xpath("//a[@value='BLR']");
	
	//Considering index value
	By selectDestination = By.xpath("(//a[@value='MAA'])[2]");
	
	By selectCurDate = By.cssSelector(".ui-state-default.ui-state-highlight");
	
	//By verifysecCalenderDisabledOneWay = By.id("Div1");
	By verifysecCalenderDisabledOneWay = By.xpath("//*[@id='Div1']");
	
	By verifySeniorCitizenDiscount = By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']");
	
	//By selectPassengers = By.id("divpaxinfo");
	By selectPassengers = By.xpath("//*[@id='divpaxinfo']");
	
	//By noOfPassengersAdded = By.id("hrefIncAdt");
	By noOfPassengersAdded = By.xpath("//*[@id='hrefIncAdt']");
	
	//By selectbuttonforNoOfPassengersAdded = By.id("btnclosepaxoption");
	By selectbuttonforNoOfPassengersAdded = By.xpath("//*[@id='btnclosepaxoption']");
	
	//By selectCurrency = By.id("ctl00_mainContent_DropDownListCurrency");
	By selectCurrency = By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']");
	
	//By confirmBooking = By.id("ctl00_mainContent_btn_FindFlights");
	By confirmBooking = By.xpath("//*[@id='ctl00_mainContent_btn_FindFlights']");
	
	
//--------------------------------------------------------------------------------------
	
	public pageFactoryFlightBooking(WebDriver driver)
	{
		this.driver=driver;
	}
	
//--------------------------------------------------------------------------------------	
	
	
	public WebElement tripType() 
	{
		
		return driver.findElement(tripType);	
	}
	
	public WebElement selectCountry() 
	{
		
		return driver.findElement(selectCountry);	
	}
	
	public List<WebElement> selectCountryFromList() 
	{
		
		return driver.findElements(selectCountryFromList);	
	}
	
	public WebElement selectOrigination() 
	{
		
		return driver.findElement(selectOrigination);	
	}
	
	public WebElement selectSource() 
	{
		
		return driver.findElement(selectSource);	
	}
	
	public WebElement selectDestination() 
	{
		
		return driver.findElement(selectDestination);	
	}
	
	public WebElement selectCurDate() 
	{
		
		return driver.findElement(selectCurDate);	
	}
	
	public WebElement verifysecCalenderDisabledOneWay() 
	{
		
		return driver.findElement(verifysecCalenderDisabledOneWay);	
	}
	
	public WebElement verifySeniorCitizenDiscount() 
	{
		
		return driver.findElement(verifySeniorCitizenDiscount);	
	}
	
	public WebElement selectPassengers() 
	{
		
		return driver.findElement(selectPassengers);	
	}
	
	public WebElement noOfPassengersAdded() 
	{
		
		return driver.findElement(noOfPassengersAdded);	
	}
	
	public WebElement selectbuttonforNoOfPassengersAdded() 
	{
		
		return driver.findElement(selectbuttonforNoOfPassengersAdded);	
	}
	
	public WebElement selectCurrency() 
	{
		
		return driver.findElement(selectCurrency);	
	}
	
	public WebElement confirmBooking() 
	{
		
		return driver.findElement(confirmBooking);	
	}
	
//--------------------------------------------------------------------------------------
	
	/*
	 * public void preCheckings() throws InterruptedException {
	 * 
	 * //Verifying one-way is selected Assert.assertTrue(((WebElement)
	 * tripType).isSelected());
	 * 
	 * Reporter.log("One-Way trip is selected");
	 * 
	 * ((WebElement) selectCountry).sendKeys("ind");
	 * 
	 * 
	 * 
	 * Thread.sleep(3000);
	 * 
	 * @SuppressWarnings("unchecked") List<WebElement> options =(List<WebElement>)
	 * selectCountryFromList; //find elements not element
	 * 
	 * for(WebElement option :options) {
	 * if(option.getText().equalsIgnoreCase("India")) { option.click(); break; } }
	 * 
	 * Reporter.log("Country - India is selected from list of available countries");
	 * 
	 * 
	 * ((WebElement) verifySeniorCitizenDiscount).click();
	 * 
	 * Reporter.log("Senior-Citizen check box is selected");
	 * 
	 * }
	 */
	
	/*
	 * public void bookFlight() throws InterruptedException {
	 * 
	 * ((WebElement) selectOrigination).click();
	 * 
	 * ((WebElement) selectSource).click();
	 * 
	 * Reporter.log("Bangalore is selected as boarding point");
	 * 
	 * Thread.sleep(2000);
	 * 
	 * ((WebElement) selectDestination).click();
	 * 
	 * Reporter.log("Chennai is selected as destination point");
	 * 
	 * ((WebElement) selectCurDate).click();
	 * 
	 * Reporter.log("Current date is selected");
	 * 
	 * //Verifying second calendar is disabled for one-way trip if(((WebElement)
	 * verifysecCalenderDisabledOneWay).getAttribute("Style").contains("0.5")) //"1"
	 * for second calendar enabled {
	 * //System.out.println("Second calendar is disabled"); Assert.assertTrue(true);
	 * 
	 * Reporter.log("Second calendar is disabled while selecting flight"); } else {
	 * Assert.assertTrue(false);
	 * 
	 * Reporter.log("Second calendar is not disabled while selecting flight"); }
	 * 
	 * 
	 * 
	 * ((WebElement) selectPassengers).click(); Thread.sleep(2000); for(int
	 * i=1;i<5;i++) { ((WebElement) noOfPassengersAdded).click();
	 * Thread.sleep(2000); }
	 * 
	 * Reporter.
	 * log("Number of Senior citizens selected for boarding from BLA to MAA are '5'"
	 * );
	 * 
	 * Thread.sleep(2000); ((WebElement)
	 * selectbuttonforNoOfPassengersAdded).click();
	 * 
	 * Reporter.log("Number of passengers are confirmed");
	 * 
	 * WebElement staticDropdown = (WebElement) selectCurrency; Select dropdown =
	 * new Select(staticDropdown); Thread.sleep(2000); //select based on index
	 * number dropdown.selectByIndex(1); //Indian Rupee
	 * 
	 * //System.out.println("Equivalent Indian rupee is selected");
	 * 
	 * Reporter.log("Indian currency is selected");
	 * 
	 * Thread.sleep(2000); ((WebElement) confirmBooking).click();
	 * 
	 * Reporter.log("Flight booking confirmed");
	 * 
	 * }
	 */
	
	
	

}
