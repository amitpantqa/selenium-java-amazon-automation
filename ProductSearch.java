package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.WaitsUtil;

public class ProductSearch {
	
	WaitsUtil wait=new WaitsUtil();

	public ProductSearch(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement search;
	
	
	public void clickonsearch(WebDriver driver) {
		
		
		wait.clickablewaits(driver, search);

		wait.visibilitywait(driver, search);
		search.sendKeys("Google Pixel 10");
		
		search.sendKeys(Keys.ENTER);
		
	}

}
