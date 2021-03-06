package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.lu.wann;

public class ShoppingCart_Page extends BaseClass {

	@FindBy(how = How.XPATH, using = "//*[@id='add_to_cart']/button")
	public static WebElement AddToCart;

	@FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[1]/h2[contains(.,'Product successfully added to your shopping cart')]")
	public static WebElement VerifyProductSuccessfullyAddedToCart;

	@FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[2]/div[1]/strong[contains(.,'Total products')]")

	public static WebElement VerifyTotalProductsAvailable;

	@FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[2]/div[2]/strong[@class='dark'][contains(.,'Total shipping')]")

	public static WebElement VerifyTotalShippingAvailable;

	@FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[2]/div[3]/strong[contains(.,'Total')]")

	public static WebElement VerifyTotalAvailable;

	@FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	public static WebElement ProceedtoCheckOut;

	public void proceedToCheckOut() throws InterruptedException {

				Thread.sleep(1500);
	

		Assert.assertTrue(VerifyProductSuccessfullyAddedToCart.isDisplayed());


		Assert.assertTrue(VerifyTotalProductsAvailable.isDisplayed());
		Assert.assertTrue(VerifyTotalShippingAvailable.isDisplayed());

		ProceedtoCheckOut.click();
	}
}