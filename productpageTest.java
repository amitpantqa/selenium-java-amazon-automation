package amazonpom;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BrowserSetup;
import pages.Productpage;
import utility.Screenshotutil;

public class productpageTest extends BrowserSetup{

	Productpage pd;
	
	@Test(priority=2)
	public void clickonspecificprod() throws Exception {
		
		pd=new Productpage(driver);
		
		pd.clickonproduct(driver);
		
		Assert.assertTrue(driver.getTitle().toLowerCase().contains("google pixel 10"));
		


	}
	
}
