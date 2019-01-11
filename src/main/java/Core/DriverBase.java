package Core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverBase {
	
	private static DriverBase instance = null;
	private WebDriver driver;
	
	private DriverBase() {
		System.setProperty( "webdriver.chrome.driver","C:\\Dipendra\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	
	public static DriverBase getDriverBase() {
		if (instance == null) {
			instance = new DriverBase();
		}
		
		return instance;
	}
	
	public static WebDriver getDriver() {
		
		return getDriverBase().driver;
	}

}
