package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

// go to the guru99 demo home page
// check Guru99 Bank is present

public class Homepage extends BaseClass{
	
	
	public void navigatetoHomePage(String url)
	{
		driver.get(url);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Sign in")
	public static WebElement sign_in;
	
	
	@FindBy(how=How.ID, using="email")
	public static WebElement email;
	
	


}