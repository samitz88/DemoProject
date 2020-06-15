package pageObjects;



import org.openqa.selenium.By;


public class LoginPage{

    private static By lnkLoginHeader1 = By.xpath("//a[contains(text(),'Login')]");
    private static By lnkCourseCypressImg= By.xpath("//img[contains(@src,'cypress.')]"); 
	 
	public static By lnkLoginHeader() {
		return lnkLoginHeader1;
	}

	public static By lnkCourseCypressImg() {
		return lnkCourseCypressImg;
	}

	
}
