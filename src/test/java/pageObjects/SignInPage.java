package pageObjects;
import org.openqa.selenium.By;

public class SignInPage {

	private static By txtUsername = By.xpath("//input[@id='user_email']");
	private static By txtPassword = By.xpath("//input[@id='user_password']");
	private static By btnLogin = By.xpath("//input[@name='commit']");
	
	public static By txtUsername() {
		return txtUsername;
	}
	public static By txtPassword() {
		return txtPassword;
	}	
	public static By btnLogin() {
		return btnLogin;
	}
}

