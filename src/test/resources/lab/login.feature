Feature: Login

Scenario: Log in with incorrect password
Given I want to log into the application
When I enter a correct user name
And When I enter an incorrect password
And When I press the login button
Then The login should fail