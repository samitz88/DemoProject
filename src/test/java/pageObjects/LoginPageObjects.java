package pageObjects;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;


import com.google.errorprone.annotations.Var;

import configurations.BaseModuleDriver;
import configurations.KeywordDriver;

public class LoginPageObjects {

	//private WebDriver driver;

	//@FindBy(xpath = "//a[contains(text(),'Login')]")
	//public WebElement lnkLoginHeader;
    By lnkLoginHeader1 = By.xpath("//a[contains(text(),'Login')]");
    By lnkCourseCypressImg= By.xpath("//img[contains(@src,'cypress.')]"); 
	 
	public By lnkLoginHeader() {
		return lnkLoginHeader1;
	}

	public By lnkCourseCypressImg() {
		return lnkCourseCypressImg;
	}

	
}
