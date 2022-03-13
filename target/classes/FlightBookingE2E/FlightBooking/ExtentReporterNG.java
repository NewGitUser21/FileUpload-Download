/**
 * 
 */
package FlightBookingE2E.FlightBooking;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

/**
 * @author DELL
 * 
 * To get a customize report
 * 
 * Get extent report dependency from Apache Maven com.aventstack:extentreports
 *
 */
public class ExtentReporterNG {
	
	static ExtentReports extent;
	
	public static ExtentReports getReportObjec()
	{
		
		String path = System.getProperty("user.dir")+"/CustomReports/index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Soubhagya Ranjan Jena");
		
		return extent;
		
		
	}

}
