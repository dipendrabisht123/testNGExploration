package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Core.DriverBase;
import Page.Base.PageBase;
import Reporting.ExtentReport;

public class GoogleSearchPage extends PageBase{
	
	public void searchText(String sSearchText) {
		
		getDriver().findElement(By.name("q")).sendKeys(sSearchText, Keys.ENTER);
		
		ExtentReport.log(Status.PASS, "Test passed with correct search.");
		
		/*ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./Reports/extent.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest testLogger = extent.createTest("Test1");
		
		testLogger.log(Status.PASS, "Test passed with correct search.");
		
		extent.flush();*/
		
				
	}

}
