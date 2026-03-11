package amazonpom;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BrowserSetup;
import pages.Addtocart;
import utility.Screenshotutil;

public class Cart extends BrowserSetup {

	Addtocart ad;
	
	
	@Test(priority=3)
	public void runcarttest() throws Exception {
		
		ad=new Addtocart(driver);

		ad.clickonaddtocart(driver);
		
		Assert.assertTrue(driver.getCurrentUrl().contains("cart"));
		
		

	}
}
