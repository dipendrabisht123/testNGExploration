package Reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;

public class ExtentReport {
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest testLogger;
	
	static {
		htmlReporter = new ExtentHtmlReporter("./Reports/ExtentReport.html");
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		testLogger = extent.createTest("Test1");
		
	}
	
	public static void log(Status sStatus, String sMessage) {
		
		testLogger.log(sStatus, sMessage);
	}
}
