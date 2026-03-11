package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BrowserSetup {

public static WebDriver driver;
	
	
	@BeforeTest
	@Parameters({"Clientname", "webaddress"})
	public void browser(String browser, String url) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
			
		}else if(browser.equalsIgnoreCase("Firefox")) {
			
			driver=new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
		}else if(browser.equalsIgnoreCase("Edge")) {
			
			driver=new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
		}else {
			
			System.out.println("Please check Your browser or try to change the browser");
		}
			}
	

	
	@AfterTest
	public void closebrowser() {
		
		driver.quit();
	}
}
