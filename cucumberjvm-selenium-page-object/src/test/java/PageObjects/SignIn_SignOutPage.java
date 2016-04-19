package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignIn_SignOutPage extends BaseClass{
	
	@FindBy(how=How.ID, using="email")
	public static WebElement email;
	
	@FindBy(how=How.ID, using="passwd")
	public static WebElement password;
	
	@FindBy(how=How.ID, using="SubmitLogin")
	public static WebElement signin_button;
	

	@FindBy(how=How.ID, using="email_create")
	public static WebElement email_create;

	@FindBy(how=How.ID, using="SubmitCreate")
	public static WebElement submit_create;
	
	@FindBy (how=How.XPATH,using=".//*[@class='logout']")
	public static WebElement signout_button;
	
	public void signUsingEmail(String username,String pwd)
	{
		
		email.sendKeys(username);
		password.sendKeys(pwd);
		signin_button.click();
	}
	public void signOutButton(){
		signout_button.click();
		
	}
}
