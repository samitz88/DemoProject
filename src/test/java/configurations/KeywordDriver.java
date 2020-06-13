package configurations;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
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
		//super(kwDriver);
		this.kwDriver=super.intializeDriver();
		//PageFactory.initElements(kwDriver, this);
	}
	public void getURL(String url) {
		kwDriver.get(url);
	}
	
	public void sleep(int secs) {
		try {
			Thread.sleep(secs*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void type(By locator,String value) {
		kwDriver.findElement(locator).sendKeys(value);
		kwDriver.findElement(locator).getTagName();
	}

	public void click(By locator) {
		kwDriver.findElement(locator).click();

	}
	public void get(String url) {
		// TODO Auto-generated method stub
		
	}

	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
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

		
	}

	public void quit() {
		// TODO Auto-generated method stub
		
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
