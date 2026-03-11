package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.WaitsUtil;

public class Addtocart {
	
	WaitsUtil wait=new WaitsUtil();
	
	public Addtocart(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="(//input[@id='add-to-cart-button'])[2]")
	private WebElement addtocart;
		
		
	public void clickonaddtocart(WebDriver driver) {
		
		for(String win: driver.getWindowHandles() ) {
			driver.switchTo().window(win);
			
		}
		wait.clickablewaits(driver, addtocart);
		addtocart.click();
	}
	}
