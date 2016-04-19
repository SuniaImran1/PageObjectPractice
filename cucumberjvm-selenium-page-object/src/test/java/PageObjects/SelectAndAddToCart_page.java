package PageObjects;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectAndAddToCart_page {

	@FindBy(how = How.LINK_TEXT, using = "WOMEN")
	public static WebElement women;

	@FindBy(how = How.LINK_TEXT, using = "DRESSES")
	public static WebElement DRESSES;

	@FindBy(how = How.XPATH, using = "//*[@id='center_column']/ul/li[3]/div/div[1]/div/a[1]/img")
	public static WebElement PrintedSummerDresses;

	@FindBy(how = How.ID, using = "color_13")
	public static WebElement DressOrangeColour;

	@FindBy(how = How.ID, using = "color_11")
	public static WebElement DressBlackColour;

	@FindBy(how = How.ID, using = "color_14")
	public static WebElement DressBlueColour;

	@FindBy(how = How.ID, using = "color_16")
	public static WebElement DressYellowColour;

	@FindBy(how = How.XPATH, using = ".//input[@id='quantity_wanted']")
	public static WebElement QuantityOfDresses;

	@FindBy(how = How.XPATH, using = "//p[@id='add_to_cart']/button/span")
	public static WebElement AddToCart;

	public void selectDress() {
		women.click();
		DRESSES.click();
		PrintedSummerDresses.click();

	}

	public void selectSize(String Size) {
		// selectDresssize.click();
		Select dropdown = new Select(BaseClass.getDriver().findElement(By.id("group_1")));
		dropdown.selectByVisibleText(Size);

	}

	public void selectColorAndAddToCart(String Colour) throws InterruptedException {

		switch (Colour) {
		case "Black":
			DressBlackColour.click();
			break;
		case "Blue":
			DressBlueColour.click();
			break;
		case "Orange":
			DressOrangeColour.click();
			break;
		case "Yellow":
			DressYellowColour.click();
			break;

		default:
			Thread.sleep(1000);
			DressOrangeColour.click();
			Thread.sleep(3000);
			break;
		}

	}

	public void QuantityOfDresses(String Quantity) {
		QuantityOfDresses.clear();
		QuantityOfDresses.sendKeys(Quantity);
		SelectAndAddToCart_page.AddToCart.click();
	
	}

}