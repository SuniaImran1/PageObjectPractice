package Stepdefinitions;

import org.openqa.selenium.support.PageFactory;

import PageObjects.BaseClass;
import PageObjects.SelectAndAddToCart_page;
import cucumber.api.java.en.When;

public class Checkout_Steps {

	SelectAndAddToCart_page addToCartPage = PageFactory.initElements(BaseClass.getDriver(),
			SelectAndAddToCart_page.class);

	@When("^I select a dress$")
	public void I_select_a_dress() throws Throwable {

		addToCartPage.selectDress();

	}

	@When("^I select colour as \"([^\"]*)\"$")
	public void I_select_colour_as(String Colour) throws Throwable {
		addToCartPage.selectColorAndAddToCart(Colour);
	}

	@When("^I select size as \"([^\"]*)\"$")
	public void I_select_size_as(String Size) throws Throwable {
		addToCartPage.selectSize(Size);
		
		
		Thread.sleep(2000);
	}

	@When("^I select quantity as \"([^\"]*)\"$")
	public void I_select_quantity_as(String Quantity) throws Throwable {
		addToCartPage.QuantityOfDresses(Quantity);
	}

}