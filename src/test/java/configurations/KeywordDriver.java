package configurations;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class KeywordDriver extends BaseModuleDriver {

	WebDriver kwDriver;
	WebElement sElement;

	public KeywordDriver() {
		this.kwDriver = super.intializeDriver();
	}

	public void get(String url) {
		kwDriver.get(url);
		Log.info("Navigated to '" + url + "' successfully");
	}

	public void sleep(int secs) {
		try {
			Thread.sleep(secs * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void type(By locator, String value) {
		kwDriver.findElement(locator).sendKeys(value);
		Log.info("Value '" + value + "' entered in element { " + locator + " } successfully");

	}

	public void click(By locator) {
		kwDriver.findElement(locator).click();
		Log.info("Element { " + locator + " } clicked successfully");

	}

	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isPresent(By locator)
	{
		try {
		WebElement element;
		element =kwDriver.findElement(locator);
		if(!element.equals(null))
			return element.isDisplayed();
		}catch(NoSuchElementException e) {
			Log.error(e.toString());
		}
		return false;
	}
	
	public String getTitle() {
		String title;
		title = kwDriver.getTitle();
		try {
			if (title.isEmpty())
				return "no title found";
		} catch (NullPointerException e) {
			Log.error(e.toString());
		}
		return title;
	}

	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	public void close() {
		kwDriver.close();
		Log.info("Current Browser instance closed successfully");

	}

	public void quit() {
		kwDriver.quit();
		Log.info("All open instances of browser closed successfully");

	}

	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	public Options manage() {
		// TODO Auto-generated method stub
		return null;
		
	}

}
