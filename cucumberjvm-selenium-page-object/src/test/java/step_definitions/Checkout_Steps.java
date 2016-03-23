package Stepdefinitions;

import org.openqa.selenium.support.PageFactory;

import PageObjects.BaseClass;
import PageObjects.SelectAndAddToCart_page;
import cucumber.api.java.en.When;

public class Checkout_Steps{
	
SelectAndAddToCart_page addToCartPage= PageFactory.initElements(BaseClass.getDriver(), SelectAndAddToCart_page.class);

@When("^I select a dress and add to cart$")
public void I_select_a_dress_and_proceed_to_checkout() throws Throwable {

	addToCartPage.selectDressAndAddToCart();
	
	
	
}
}