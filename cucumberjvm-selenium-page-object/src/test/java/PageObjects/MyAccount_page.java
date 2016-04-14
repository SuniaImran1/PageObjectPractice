package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.gargoylesoftware.htmlunit.javascript.host.media.rtc.webkitRTCPeerConnection;

public class MyAccount_page extends BaseClass {

	@FindBy(how = How.XPATH, using = "//*[@id='columns']/div[1]/a[2]")
	public static WebElement MyAccountTab;

	@FindBy(how = How.XPATH, using = "//a[@title='Orders']/span")
	public static WebElement OrderHistoryAndDetails_Button;
	@FindBy(how = How.XPATH, using = "//*[@title='Credit slips']")
	public static WebElement MyCreditSlips_Button;

	@FindBy(how = How.XPATH, using = "//*[@title='Addresses']")
	public static WebElement MyAddress_Button;

	@FindBy(how = How.XPATH, using = "//a[@title='My wishlists']/span")
	public static WebElement MyWishList_Button;

	public void MyAccountPage() {
		driver.getTitle().contains("My account - My Store");

	}

	public void OrderHistoryAndDetailsButton() {

		OrderHistoryAndDetails_Button.click();
		
	}
	public void VerifyOrderHistoryAndDetailsPage(){
		Assert.assertTrue(driver.getTitle().contains("Order history"));
	}

	public void MyAccountTab() {
		MyAccountTab.click();

	}

	public void MyCreditSlipsTab() {
		MyCreditSlips_Button.click();
	
	}
	public void VerifyOrderSlipsPage(){
		Assert.assertTrue(driver.getTitle().contains("Order slip"));
	}

	public void MyAddressTab() {
		MyAddress_Button.click();
		
	}
	public void VerifyAddressTabAvailable(){
		Assert.assertTrue(driver.getTitle().contains("Address"));
	}

	public void MyWishListTab() {
		MyWishList_Button.click();
		
	}
public void VerifyMyWishPageTitle(){
	Assert.assertTrue(driver.getTitle().contains("My Store"));
}
}