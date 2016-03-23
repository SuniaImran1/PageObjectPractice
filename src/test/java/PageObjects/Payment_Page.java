package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Payment_Page {
	
	@FindBy(how = How.XPATH, using = "//*[@name='processCarrier']")
	public static WebElement ProceedToCheckOut3;


	@FindBy(how = How.XPATH, using = "//label[@for='cgv']")
	public static WebElement clickOnCheckBox;



public void shippingProceedToCheckOut() {
	

	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	clickOnCheckBox.click();

	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ProceedToCheckOut3.click();
	
}}
