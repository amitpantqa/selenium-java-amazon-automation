package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.WaitsUtil;

public class ProceedtoBuy {

	WaitsUtil wait = new WaitsUtil();

	public ProceedtoBuy(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@value='Proceed to checkout']")
	private WebElement buy;

	public void clickonbuy(WebDriver driver) {

		wait.visibilitywait(driver, buy);
		wait.clickablewaits(driver, buy);

		buy.click();
	}
}
