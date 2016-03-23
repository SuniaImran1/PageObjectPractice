package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectAndAddToCart_page {

	@FindBy(how = How.LINK_TEXT, using = "WOMEN")
	public static WebElement women;

	@FindBy(how = How.LINK_TEXT, using = "DRESSES")
	public static WebElement DRESSES;

	@FindBy(how = How.XPATH, using = "//*[@id='center_column']/ul/li[1]/div/div[2]/h5/a")
	public static WebElement PrintedDresses;

	@FindBy(how = How.ID, using = "color_13")
	public static WebElement DressOrangeColour;

	  @FindBy(how = How.XPATH, using = "//p[@id='add_to_cart']/button/span")
	  public static WebElement AddToCart;

	public void selectDressAndAddToCart() throws InterruptedException {
		women.click();
		DRESSES.click();
		PrintedDresses.click();
		DressOrangeColour.click();
		Thread.sleep(2000);
		// selectSize.click();
		 AddToCart.click();
		
	}

}