package Stepdefinitions;

import org.openqa.selenium.support.PageFactory;

import PageObjects.BaseClass;
import PageObjects.ProceedToCheckOut_page;
import cucumber.api.java.en.When;


public class address_Steps{
	ProceedToCheckOut_page proceedToCheckOutPage= PageFactory.initElements(BaseClass.getDriver(), ProceedToCheckOut_page.class);
	
	
	
@When("^I verify details on the confirmation page and proceed to checkout$")
public void I_verify_address_and_proceed() throws Throwable {
	
	proceedToCheckOutPage.ProccedToCheckOut();
  
}
}