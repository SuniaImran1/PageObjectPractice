package Stepdefinitions;




import java.sql.Driver;

import org.junit.BeforeClass;
import org.openqa.selenium.support.PageFactory;

import PageObjects.BaseClass;
import PageObjects.Homepage;
import PageObjects.SignIn_SignOutPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;

public class SignInSignOut_Steps {
	
	
	Homepage homepage = PageFactory.initElements(BaseClass.getDriver(), Homepage.class);
	
	
	
	SignIn_SignOutPage loginPage = PageFactory.initElements(BaseClass.getDriver(), SignIn_SignOutPage.class);

	public SignInSignOut_Steps() {

	}

	@When("^I open automationpractice website$")
	public void I_open_automationpractice_website() throws Throwable {
	
		homepage.navigatetoHomePage("http://automationpractice.com");
		//Homepage.sign_in.click();

	}

	@When("^I sign in$")
	public void I_sign_in() throws Throwable {
		Homepage.sign_in.click();
		loginPage.signUsingEmail("suniaimran@mail.com", "Magento123");
	}

	@When("^I sign out$")
	public void I_sign_out() throws Throwable {
		loginPage.signOutButton();
		Thread.sleep(2000);
	
	}
@After
public void close_Browser()
{
	BaseClass.getDriver().close();
	BaseClass.setDriver(null);
}

}
