package pageObjects;

import javax.management.loading.PrivateClassLoader;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configurations.BaseModuleDriver;

public class signInPageObjects {

	private By txtUsername = By.xpath("//input[@id='user_email']");
	private By txtPassword = By.xpath("//input[@id='user_password']");
	private By btnLogin = By.xpath("//input[@name='commit']");
	
	public By txtUsername() {
		return txtUsername;
	}
	public By txtPassword() {
		return txtPassword;
	}	
	public By btnLogin() {
		return btnLogin;
	}
}

