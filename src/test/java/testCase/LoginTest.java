package testCase;

import java.io.IOException;
import java.text.ParseException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import appModule.loginModule;
import configurations.ExcelUtils;
import configurations.Log;

public class LoginTest {
	loginModule lm = new loginModule();
	ExcelUtils ex = new ExcelUtils();

	@Test(dataProvider = "getTestData")
	public void login(String username, String password) {
		Log.startTestCase("TC001");
		Log.info("Test case started");
		lm.navigate();
		lm.clickHeaderLoginlink();
		lm.login(username, password);
		lm.verifyLogin(username);
		Log.info("Test case ended");
		Log.endTestCase("TC001");
		lm.close();
	}

	@AfterTest
	public void closeDriver() {
		lm.closeAll();
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
		data = ex.getData("TC001", System.getProperty("user.dir")+"\\src\\test\\java\\data\\Testdata.xlsx");
		return data;

	}

}
