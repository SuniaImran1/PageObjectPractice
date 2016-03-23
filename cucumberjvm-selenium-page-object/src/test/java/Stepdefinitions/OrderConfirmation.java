package Stepdefinitions;

import org.openqa.selenium.support.PageFactory;

import PageObjects.BaseClass;
import PageObjects.ShoppingCart_Page;
import PageObjects.orderconfirmation_page;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderConfirmation extends BaseClass {
	
	orderconfirmation_page OrderConfirmationpage= PageFactory.initElements(BaseClass.getDriver(), orderconfirmation_page.class);
	

	@When("^I verify order procedure page and proceed$")
	public void I_verify_order_procedure_page_and_proceed() throws Throwable {
		
	
		OrderConfirmationpage.PayByCheck();
	}

	@Then("^I verify order confirmation page details and verify success message$")
	public void I_verify_order_confirmation_page_details_and_verify_success_message() throws Exception {
		
		
		
		OrderConfirmationpage.ConfirmOrder();

	}
}