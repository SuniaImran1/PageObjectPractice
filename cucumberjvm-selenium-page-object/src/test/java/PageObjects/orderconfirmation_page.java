package PageObjects;

import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class orderconfirmation_page extends BaseClass {

	
	@FindBy(how = How.XPATH, using = "//*[@class='cheque']")
	public static WebElement CheckPayment;
		
	
	
	@FindBy(how = How.XPATH, using = "//button/span[text()='I confirm my order']")
	public static WebElement ConfirmOrder;

	
	
	
	
	@FindBy(how = How.XPATH, using = ".//*[@id='center_column']/p[1]")
	public static WebElement OrderSuccessMessage;
	
	
	
	public void PayByCheck() throws InterruptedException {
		
		CheckPayment.click();
	}

	public void ConfirmOrder() throws Exception {

		ConfirmOrder.click();
		Assert.assertTrue(OrderSuccessMessage.isDisplayed());
}}