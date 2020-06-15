package pageObjects;

import org.openqa.selenium.By;

public class UserPage {

	private static By imgUserImage = By.xpath("//img[@class='gravatar']");

	public static By imgUserImage() {
		return imgUserImage;
	}
}