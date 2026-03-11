package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsUtil {

	public void clickablewaits(WebDriver driver, WebElement ELE) {

		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));

		wt.until(ExpectedConditions.elementToBeClickable(ELE));
	}

	public void visibilitywait(WebDriver driver, WebElement ELE) {

		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));

		wt.until(ExpectedConditions.visibilityOf(ELE));
	}

}
