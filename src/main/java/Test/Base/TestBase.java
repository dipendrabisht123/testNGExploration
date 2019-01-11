package Test.Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;

import Core.DriverBase;
import Reporting.ExtentReport;

public class TestBase {
	public static ExtentReports extent;
	
	@BeforeMethod
	public void beforTest() {
		DriverBase.getDriver().get("https://www.google.com/");
		extent = ExtentReport.extent;
		
	}
	
	@AfterMethod
	public void afterTest() {
		
		extent.flush();
		
	}
}
