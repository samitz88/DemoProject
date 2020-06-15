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
	public void login(String username, String password) throws InterruptedException {
		Log.startTestCase("TC001");
		Log.info("Test case started");
		lm.navigate();
		lm.login(username, password);
		Log.info("Test case ended");
		Log.endTestCase("TC001");
	}

	@AfterTest
	public void closeDriver() {
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
