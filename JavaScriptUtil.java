package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

	WebDriver driver;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public void jsforview(WebElement element) {

		js.executeScript("arguments[0].ScrollIntoView(true);", element);

	}

	public void jsforclick(WebElement element) {

		js.executeScript("arguments[0].click", element);

	}

	public void jsforwrite(WebElement element, String text) {

		js.executeScript("arguments[0].value='" + text + "'", element);

	}

	public void jsforremoveattribute(WebElement element) {

		js.executeScript("arguments[0].removeAttribute(disabled)", element);

	}
}
