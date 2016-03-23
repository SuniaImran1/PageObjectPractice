package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProceedToCheckOut_page {

	@FindBy(how = How.XPATH, using = "//div/a[@title='Proceed to checkout']/span")
	public static WebElement ProceedtoCheckOut1;

	@FindBy(how = How.XPATH, using = "//p/a[@title='Proceed to checkout']")
	public static WebElement ProceedtoCheckOut2;

	@FindBy(how = How.XPATH, using = "//*[@id='center_column']/div[3]/div[1]/ul/li[1]/h3")
	public static WebElement VerifyMyaddressTextpresent;

	public void ProccedToCheckOut() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertTrue(VerifyMyaddressTextpresent.isDisplayed());
		ProceedtoCheckOut2.click();

	}

}
