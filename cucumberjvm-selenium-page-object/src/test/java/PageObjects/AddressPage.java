package PageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddressPage extends BaseClass {

	@FindBy(how = How.XPATH, using = ".//*[@name='processAddress']")
	public static WebElement ProceedtoCheckOut;

	public void verifyAddressDetailsAndProceed() {
		getDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		ProceedtoCheckOut.click();

	}

}