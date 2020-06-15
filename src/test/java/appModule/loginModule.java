package appModule;

import configurations.KeywordDriver;
import pageObjects.*;

public class loginModule {
	KeywordDriver driver = new KeywordDriver();

	public void navigate() {
		driver.get("https://rahulshettyacademy.com/");
		driver.sleep(3);
	}

	public void login(String username, String password) {
		driver.click(LoginPage.lnkLoginHeader());
		driver.type(SignInPage.txtUsername(), username);
		driver.type(SignInPage.txtPassword(), password);
		driver.click(SignInPage.btnLogin());
		driver.sleep(1);
	}

	public void close() {
		driver.close();
	}
}
