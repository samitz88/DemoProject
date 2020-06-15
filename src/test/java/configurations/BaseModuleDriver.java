package configurations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hpsf.ClassID;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseModuleDriver {
	public WebDriver uiDriver;
	public Properties properties;
	String basePath = System.getProperty("user.dir");

	public WebDriver intializeDriver() {
		properties = new Properties();
		String browserName = null;

		try {
			FileInputStream fileInputStream = new FileInputStream(
					basePath + "\\src\\test\\java\\configurations\\data.properties");
			properties.load(fileInputStream);
			browserName = properties.getProperty("browser");
			 if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", basePath + "\\src\\test\\java\\lib\\chromedriver.exe");
				uiDriver = new ChromeDriver();
				
			} else if (browserName.equalsIgnoreCase("edge")) {
				uiDriver = new EdgeDriver();
			} else if (browserName.equalsIgnoreCase("safari")) {
				uiDriver = new SafariDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", basePath + "\\src\\test\\java\\lib\\geckodriver.exe");
				uiDriver = new FirefoxDriver();
			}
			uiDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File not found");
		}
		return uiDriver;
	}
	
	/*
	 * public BaseModuleDriver(WebDriver uiDriver) { properties = new Properties();
	 * String browserName = null; this.uiDriver=uiDriver; try { FileInputStream
	 * fileInputStream = new FileInputStream( basePath +
	 * "\\src\\test\\java\\configurations\\data.properties");
	 * properties.load(fileInputStream); browserName =
	 * properties.getProperty("browser"); if
	 * (browserName.equalsIgnoreCase("chrome")) {
	 * System.setProperty("webdriver.chrome.driver", basePath +
	 * "\\src\\test\\java\\lib\\chromedriver.exe"); uiDriver = new ChromeDriver(); }
	 * else if (browserName.equalsIgnoreCase("edge")) { uiDriver = new EdgeDriver();
	 * } else if (browserName.equalsIgnoreCase("safari")) { uiDriver = new
	 * SafariDriver(); } else if (browserName.equalsIgnoreCase("firefox")) {
	 * System.setProperty("webdriver.gecko.driver", basePath +
	 * "\\src\\test\\java\\lib\\geckodriver.exe"); uiDriver = new FirefoxDriver(); }
	 * uiDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 * 
	 * } catch (FileNotFoundException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); System.out.println("File not found"); } catch
	 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace();
	 * System.out.println("File not found"); } //return uiDriver; }
	 */




}
