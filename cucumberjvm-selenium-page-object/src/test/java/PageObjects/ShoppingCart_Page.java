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

	@FindBy(how = How.XPATH, using = ".//*[@id='layer_cart']/div[1]/div[1]/h2")
	public static WebElement VerifyProductSuccessfullyAddedToCart;

	@FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[2]/div[1]/strong")

	public static WebElement VerifyTotalProductsAvailable;

	@FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[2]/div[2]/strong")

	public static WebElement VerifyTotalShippingAvailable;

	@FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[2]/div[3]/strong")

	public static WebElement VerifyTotalAvailable;

	@FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	public static WebElement ProceedtoCheckOut;

	public void proceedToCheckOut() throws InterruptedException {



		Assert.assertTrue(VerifyProductSuccessfullyAddedToCart.isDisplayed());

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		Assert.assertTrue(VerifyTotalProductsAvailable.isDisplayed());
		Assert.assertTrue(VerifyTotalShippingAvailable.isDisplayed());

		ProceedtoCheckOut.click();
	}
}