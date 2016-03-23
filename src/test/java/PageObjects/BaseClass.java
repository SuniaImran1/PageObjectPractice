package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass{
	static WebDriver driver ;

	public BaseClass() {
		
		getDriver();

	
	}

	public static WebDriver getDriver() {
		if(driver!=null)
		{
			
		return driver;
		}
		else
		{
			driver= new FirefoxDriver();
			return driver;
		}
	}
	
	
	
}