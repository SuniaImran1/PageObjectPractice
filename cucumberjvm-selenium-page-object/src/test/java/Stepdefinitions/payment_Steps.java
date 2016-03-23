package Stepdefinitions;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageObjects.BaseClass;
import PageObjects.Payment_Page;
import PageObjects.ProceedToCheckOut_page;
import cucumber.api.java.en.When;




public class payment_Steps extends BaseClass{
	Payment_Page payment =  PageFactory.initElements(getDriver(),Payment_Page.class);
	
	
	
@When("^I verify payment details page and proceed$")
public void I_verify_payment_details_page_and_proceed() throws Throwable {
	
	payment.shippingProceedToCheckOut();
}
}