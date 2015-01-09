package at.ac.tuwien.inso.swtesten.lab;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefinitions {

	public static final String CORRECT_PASSWORD = "1234";
	public static final String INCORRECT_USERNAME = "asdf";
	public static final String INCORRECT_PASSWORD = "asdf";
	public static final String CORRECT_USERNAME = "gruppe23d";
	private static final String LANGUAGE_ENGLISH = "en";
	
	private SportsIDSeleniumHelper sportsId = new SportsIDSeleniumHelper();
	
	@Given("^I want to log into the application$")
	public void I_want_to_log_into_the_application() throws Throwable {
		sportsId.setUp();
		sportsId.goToLogin();
	}
	
	@Given("^I am logged into the english page")
	public void I_am_logged_into_the_english_page() throws Throwable {
		sportsId.setUp();
		sportsId.goToLogin();
		sportsId.enterUserName( LoginStepDefinitions.CORRECT_USERNAME );
		sportsId.enterPassword( LoginStepDefinitions.CORRECT_PASSWORD );
		
		sportsId.selectLanguage( LoginStepDefinitions.LANGUAGE_ENGLISH );
		sportsId.pressLoginButton();
		sportsId.assertWelcomeMessageShown();
	}
	
	@When("^I select english as language$")
	public void I_select_english_as_language() throws Throwable {
		sportsId.selectLanguage( LoginStepDefinitions.LANGUAGE_ENGLISH );
	}

	@When("^I enter a correct user name$")
	public void I_enter_a_correct_user_name() throws Throwable {
	    sportsId.enterUserName( LoginStepDefinitions.CORRECT_USERNAME );
	}

	@When("^When I enter an incorrect password$")
	public void When_I_enter_an_incorrect_password() throws Throwable {
	    sportsId.enterPassword( LoginStepDefinitions.INCORRECT_PASSWORD );
	}
	
	@When("^When I enter a correct user name$")
	public void When_I_enter_a_correct_user_name() throws Throwable {
	    sportsId.enterUserName( LoginStepDefinitions.CORRECT_USERNAME );
	}

	@When("^When I enter an incorrect user name$")
	public void When_I_enter_an_incorrect_user_name() throws Throwable {
	    sportsId.enterUserName( LoginStepDefinitions.INCORRECT_USERNAME );
	}
	
	@When("^When I press the login button$")
	public void When_I_press_the_login_button() throws Throwable {
		sportsId.pressLoginButton();
	}

	@Then("^The login should fail$")
	public void The_login_should_fail() throws Throwable {
		sportsId.assertUnauthorizedMessageShown();
	}
	
	@When("^I enter an incorrect user name$")
	public void I_enter_an_incorrect_user_name() throws Throwable {
	    sportsId.enterUserName( LoginStepDefinitions.INCORRECT_USERNAME );
	}

	@When("^When I enter a correct password$")
	public void When_I_enter_a_correct_password() throws Throwable {
	    sportsId.enterPassword( LoginStepDefinitions.CORRECT_PASSWORD );
	}
	
	@Then("^The login should succeed$")
	public void The_login_should_succeed() throws Throwable {
	    sportsId.assertWelcomeMessageShown();
	}
	
}
