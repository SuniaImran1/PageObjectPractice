package Stepdefinitions;

import org.openqa.selenium.support.PageFactory;

import PageObjects.BaseClass;
import PageObjects.Homepage;
import PageObjects.SignIn_Page;
import cucumber.api.java.en.When;

public class SignInSignOut_Steps {
	Homepage homepage = PageFactory.initElements(BaseClass.getDriver(), Homepage.class);
	SignIn_Page loginPage = PageFactory.initElements(BaseClass.getDriver(), SignIn_Page.class);

	public SignInSignOut_Steps() {

	}

	@When("^I open automationpractice website$")
	public void I_open_automationpractice_website() throws Throwable {
		homepage.navigatetoHomePage("http://automationpractice.com");
		Homepage.sign_in.click();

	}

	@When("^I sign in$")
	public void I_sign_in() throws Throwable {
		loginPage.signUsingEmail("suniaimran@mail.com", "Magento123");
	}

}
