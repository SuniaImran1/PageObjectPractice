package Stepdefinitions;

import org.openqa.selenium.support.PageFactory;

import PageObjects.BaseClass;
import PageObjects.AddressPage;
import cucumber.api.java.en.When;


public class Address_Steps extends BaseClass{
AddressPage shipping = PageFactory.initElements(BaseClass.getDriver(),AddressPage.class);
	

@When("^I verify address details and proceed$")
public  void I_verify_shipping_details_and_proceed()throws Exception {
	shipping.verifyAddressDetailsAndProceed();
}

}