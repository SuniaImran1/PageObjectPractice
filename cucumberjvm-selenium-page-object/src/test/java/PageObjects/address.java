package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class address {

	@FindBy(how = How.XPATH, using = "//button[@name='processAddress']")

	public static WebElement ProceedtoCheckOut3;

	@FindBy(how = How.XPATH, using = "//button[@name='processCarrier']")

	public static WebElement ProceedtoCheckOut4;

	@FindBy(how = How.XPATH, using = ".//input[@id='cgv']")
	public static WebElement clickOnCheckBox;

	public void Address() {

		ProceedtoCheckOut3.click();
		ProceedtoCheckOut4.click();

		clickOnCheckBox.click();

	}
}
