package at.ac.tuwien.inso.swtesten.lab;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefinitions {

	private SportsIDSeleniumHelper sportsId = new SportsIDSeleniumHelper();
	
	@Given("^I want to log into the application$")
	public void I_want_to_log_into_the_application() throws Throwable {
	    sportsId.goToLogin();
	}

	@When("^I enter a correct user name$")
	public void I_enter_a_correct_user_name() throws Throwable {
	    sportsId.enterUserName( SportsIDSeleniumHelper.CORRECT_USERNAME );
	}

	@When("^When I enter an incorrect password$")
	public void When_I_enter_an_incorrect_password() throws Throwable {
	    sportsId.enterPassword( SportsIDSeleniumHelper.INCORRECT_PASSWORD );
	}
	
	@When("^When I press the login button$")
	public void When_I_press_the_login_button() throws Throwable {
		sportsId.pressLoginButton();
	}

	@Then("^The login should fail$")
	public void The_login_should_fail() throws Throwable {
		sportsId.assertUnauthorizedMessageShown();
	}
}
