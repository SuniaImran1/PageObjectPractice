package Stepdefinitions;

import org.openqa.selenium.support.PageFactory;

import PageObjects.BaseClass;
import PageObjects.MyAccount_page;
import cucumber.api.java.en.When;

public class MyAccount_Steps extends BaseClass {
	MyAccount_page accountPage = PageFactory.initElements(BaseClass.getDriver(), MyAccount_page.class);

	@When("^I verify that I land on the MY ACCOUNT page$")
	public void I_verify_that_I_land_on_the_MY_ACCOUNT_page() throws Throwable {

		accountPage.MyAccountPage();
	}

	@When("^I click on the ORDER HISTORY AND DETAILS button$")
	public void I_click_on_the_ORDER_HISTORY_AND_DETAILS_button() throws Throwable {
		accountPage.OrderHistoryAndDetailsButton();
	}

	@When("^I verify that I land on Order history page$")
	public void I_verify_that_I_land_on_Order_history_page() throws Throwable {
		accountPage.VerifyOrderHistoryAndDetailsPage();
	}

	@When("^I click on My account tab$")
	public void I_click_on_My_account_tab() throws Throwable {
		accountPage.MyAccountTab();
	}

	@When("^I click on the MY CREDIT SLIPS button$")
	public void I_click_on_the_MY_CREDIT_SLIPS_button() throws Throwable {
accountPage.MyCreditSlipsTab();
	}

	@When("^I verify that I land on Order slip page$")
	public void I_verify_that_I_land_on_Order_slip_page() throws Throwable {
		accountPage.VerifyOrderSlipsPage();
	}

	@When("^I click on the MY ADDRESS button$")
	public void I_click_on_the_MY_ADDRESS_button() throws Throwable {
accountPage.MyAddressTab();
	}

	@When("^I verify that I land on My ADDRESS page$")
	public void I_verify_that_I_land_on_My_ADDRESS_page() throws Throwable {
		accountPage.VerifyAddressTabAvailable();
	}

	@When("^I click on the MY WISHLIST button$")
	public void I_click_on_the_MY_WISHLIST_button() throws Throwable {
accountPage.MyWishListTab();
	}

	@When("^I verify that I land on My WISHLIST page$")
	public void I_verify_that_I_land_on_My_WISHLIST_page() throws Throwable {
accountPage.VerifyMyWishPageTitle();
	}

}
