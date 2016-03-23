package Stepdefinitions;


import org.openqa.selenium.support.PageFactory;

import PageObjects.BaseClass;
import PageObjects.SelectAndAddToCart_page;
import PageObjects.ShoppingCart_Page;
import cucumber.api.java.en.When;

public class shoppingcart_Steps{

	
	ShoppingCart_Page shoppingCart= PageFactory.initElements(BaseClass.getDriver(), ShoppingCart_Page.class);
	
	
@When("^I verify details on shoppingCart and proceed to checkout$")
public void I_verify_details_on_shoppingCart_summary_page() throws Throwable {

	
	shoppingCart.proceedToCheckOut();
	

	

}
}