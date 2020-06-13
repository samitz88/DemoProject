package testCase;

import java.io.IOException;
import java.sql.Driver;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import appModule.loginModule;
import configurations.BaseModuleDriver;
import configurations.ExcelReader;
import configurations.ExcelUtils;
import configurations.KeywordDriver;
import configurations.Log;
import pageObjects.LoginPageObjects;
import pageObjects.signInPageObjects;

public class LoginTest  {
	loginModule lm = new loginModule();
	ExcelUtils ex = new ExcelUtils();

	// ExcelReader er= new ExcelReader();

	@Test(dataProvider = "getTestData")
	public void login(String username, String password) throws InterruptedException {
		Log.startTestCase("TC001");
		Log.error("Test case started");
		// String urlString = "https://rahulshettyacademy.com/";
		lm.navigate();
		lm.login(username, password);
	}
	
	@AfterTest
	public void closeDriver() {
		Log.endTestCase("TC002");
		Log.error("test case ended");
		lm.close();
	}

	/*
	 * @DataProvider public Object[][] getTestData() throws IOException,
	 * ParseException { Object[][] data;
	 * //System.out.println(properties.getProperty("testdatapath")); //data =
	 * 
	 * er.getDataObjectArray(properties.getProperty("testdatapath"), "testdata");
	 * return data;
	 * 
	 * }
	 */
	@DataProvider
	public Object[][] getTestData() throws IOException, ParseException {
		Object[][] data;
		data = ex.getData("TC001", "C:\\Users\\samit\\work\\Testdata.xlsx");
		return data;

	}

}
