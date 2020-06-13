package appModule;

import configurations.KeywordDriver;
import pageObjects.LoginPageObjects;
import pageObjects.signInPageObjects;

public class loginModule {
	KeywordDriver driver = new KeywordDriver();
	LoginPageObjects lp = new LoginPageObjects();
	signInPageObjects si = new signInPageObjects();

	public void navigate() {
		driver.getURL("https://rahulshettyacademy.com/");
		driver.sleep(3);
	}

	public void login(String username, String password) {
		driver.click(lp.lnkLoginHeader());
		driver.type(si.txtUsername(), username);
		driver.type(si.txtPassword(), password);
		driver.click(si.btnLogin());
		driver.sleep(1);
	}

	public void close() {
		driver.close();
	}
}
