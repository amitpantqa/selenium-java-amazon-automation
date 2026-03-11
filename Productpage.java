package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.WaitsUtil;

public class Productpage {

	WaitsUtil wait=new WaitsUtil();
	
public Productpage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
		
	@FindBy(xpath="//span[text()='Google Pixel 10 5G (Obsidian, 12GB RAM, 256GB Storage)']")
	private WebElement prod;
	
	
	public void prodtext() {
		
		String prodt= prod.getText();
	}
	public void clickonproduct(WebDriver driver) {
		
		wait.clickablewaits(driver, prod);
		prod.click();
	}
}
