package PageObjects;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectAndAddToCart_page extends BaseClass {

	@FindBy(how = How.LINK_TEXT, using = "WOMEN")
	public static WebElement Select_Women;

	@FindBy(how = How.LINK_TEXT, using = "DRESSES")
	public static WebElement DRESSES;
	@FindBy(how = How.XPATH, using = "//*[@id='ul_layered_category_0']/li[2]/label/a[contains(.,'Dresses')]")
	public static WebElement SelectDressesFromCategories;

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
		Select_Women.click();
		DRESSES.click();
		PrintedSummerDresses.click();

	}

	public void SelectDressOption_WOMEN() {
		Select_Women.click();

	}

	public void selectCategories_DRESSES() {
		SelectDressesFromCategories.click();
	}

	public void selectSize(String Size) {

		Select dropdown = new Select(BaseClass.getDriver().findElement(By.id("group_1")));
		dropdown.selectByVisibleText(Size);

	}

	public void SelectYellowDress_20PERCENToff() {
		List<WebElement> ListOfDresses = driver.findElements(By.xpath("//ul[@class='product_list grid row']/li"));

		String percentage = "";
		for (int i = 1; i <= ListOfDresses.size(); i++) {

			List<WebElement> localObject = driver.findElements(
					By.xpath("//ul[@class='product_list grid row']/li[" + i + "]/div/div/div/div[2]/span[3]"));
			if (localObject.size() > 0) {

				percentage = driver
						.findElement(By
								.xpath("//ul[@class='product_list grid row']/li[" + i + "]//span[3]")).getAttribute("innerHTML");
				System.out.println(percentage);

				percentage = percentage.replace("-", "");
				percentage = percentage.replace("%", "");
				if (Integer.parseInt(percentage) <= 20) {
					driver.findElement(By.xpath("//ul[@class='product_list grid row']/li[" + i + "]//a[@title='Add to cart']")).click();
							break;
				} else {

				}
			}

		}

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