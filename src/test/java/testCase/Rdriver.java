package testCase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Rdriver {

	public static void main(String[] args) {
	
		RemoteWebDriver driver=new EdgeDriver();
		//EdgeDriver edgeDriver =new EdgeDriver();
		
		//ChromeDriver chromeDriver = new ChromeDriver();
		//RemoteWebDriver driver= edgeDriver;
		driver.get("https://www.softwaretestingmaterial.com/webdriver-driver-new-firefoxdriver/");
	}

}

