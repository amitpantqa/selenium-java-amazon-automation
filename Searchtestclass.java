package amazonpom;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BrowserSetup;
import pages.ProductSearch;
import utility.Screenshotutil;

public class Searchtestclass extends BrowserSetup {

	ProductSearch sc;

	@Test(priority = 1)
	public void run() throws Exception {

		sc = new ProductSearch(driver);

		sc.clickonsearch(driver);
		
		Assert.assertTrue(driver.getTitle().toLowerCase().contains("google pixel 10"));
				

	}

}
