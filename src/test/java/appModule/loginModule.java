package appModule;

import org.testng.Assert;

import configurations.KeywordDriver;
import configurations.Log;
import pageObjects.*;

public class loginModule {
	KeywordDriver driver;

	public void navigate() {
		driver = new KeywordDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.sleep(3);
	}

	public void clickHeaderLoginlink() {
		driver.click(LoginPage.lnkLoginHeader());
	}

	public void login(String username, String password) {

		driver.type(SignInPage.txtUsername(), username);
		driver.type(SignInPage.txtPassword(), password);
		driver.click(SignInPage.btnLogin());
		driver.sleep(1);
	}

	public void verifyLogin(String username) {

		if (driver.isPresent(UserPage.imgUserImage())) {
			String actualUserName = driver.findElement(UserPage.imgUserImage()).getAttribute("alt");
			if (actualUserName.contentEquals(username)) {
				Log.info("Test Case passed");
				Assert.assertTrue(true);
			} else {
				Log.info("Test Case failed");
				Assert.assertFalse(true);
			}
		} else {
			Log.info("Test Case failed");
			Assert.assertFalse(true);

		}

	}

	public void close() {
		driver.close();
	}

	public void closeAll() {
		driver.quit();
	}
}
