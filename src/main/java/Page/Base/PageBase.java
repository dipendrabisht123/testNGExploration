package Page.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import Core.DriverBase;

public class PageBase {
	
	
	
	public WebDriver getDriver () {
		return DriverBase.getDriver();
	}
	
	
}
