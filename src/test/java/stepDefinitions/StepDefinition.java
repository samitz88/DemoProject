package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import io.cucumber.java.en.Then;
import appModule.loginModule;
import io.cucumber.java.PendingException;

public class StepDefinition {
	loginModule lm = new loginModule();

	@Given("I already have an user account")
	public void i_already_have_an_user_account() {

		lm.navigate();

	}
	
	@When("^I enter invalid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_invalid_something_and_something(String strArg1, String strArg2) throws Throwable {
		 lm.login(strArg1, strArg2);
	    }

	@Then("^Invalid user name password should be displayed$")
	public void invalid_user_name_password_should_be_displayed() throws Throwable {
		lm.close();
		System.out.println("Invalid Login");

	}

}
