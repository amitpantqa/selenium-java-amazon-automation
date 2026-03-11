package amazonpom;

import org.testng.ITestResult;
import org.testng.annotations.Test;

import base.BrowserSetup;
import pages.ProceedtoBuy;
import utility.Screenshotutil;

public class BuyTestClass extends BrowserSetup {

	ProceedtoBuy buy;

	@Test(priority=4)
	public void Buyingtest() throws Exception {
		
		buy=new ProceedtoBuy(driver);
		buy.clickonbuy(driver);

	}
	
	
	
	
}
