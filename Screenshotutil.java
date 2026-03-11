package utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BrowserSetup;

public class Screenshotutil implements ITestListener{
	
@Override
public void onTestSuccess(ITestResult result) {

	ITestListener.super.onTestSuccess(result);
	
	try {
		
	TakesScreenshot ss=(TakesScreenshot) BrowserSetup.driver;
	
	File Source=ss.getScreenshotAs(OutputType.FILE);
	File Destination=new File("C:\\Users\\hp\\eclipse-workspace\\seleniumwebdriver\\src\\test\\java\\Screenshots\\Amazon"+System.currentTimeMillis()+".png");
	
	FileHandler.copy(Source, Destination);
	
	}catch(Exception e) {
		
		System.out.println("Not Able to take Screenshot Please check your Utility class");
	}
	
	
}

}
