package at.ac.tuwien.inso.swtesten.lab;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class OrganisationStepDefinitions {
	
	private SportsIDSeleniumHelper sportsId = new SportsIDSeleniumHelper();
	
//	@Given("^I am logged into the english page$")
//	public void I_am_logged_into_the_english_page() throws Throwable {
//	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
//	}

	@When("^I select Clubs$")
	public void I_select_Clubs() throws Throwable {
	    sportsId.selectClubs();
	}

	@When("^When I click the Add Button$")
	public void When_I_click_the_Add_Button() throws Throwable {
	    sportsId.clickAddButton();
	}

	@When("^When I enter a name \"(.+)\"$")
	public void When_I_enter_a_name(String name) throws Throwable {
		sportsId.enterGroupName(name);
	}

	@When("^When I click the Save Button$")
	public void When_I_click_the_Save_Button() throws Throwable {
		sportsId.clickSaveButton();
	}

	@Then("^The Club \"(.+)\" should be shown$")
	public void The_Club_should_be_shown(String name) throws Throwable {
		sportsId.assertGroupShown(name);
	}

}
