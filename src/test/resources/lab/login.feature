Feature: Login

Scenario: Log in with incorrect password
Given I want to log into the application
When I select english as language
And When I enter a correct user name
And When I enter an incorrect password
And When I press the login button
Then The login should fail

Scenario: Log in with incorrect username
Given I want to log into the application
When I select english as language
And When I enter an incorrect user name
And When I enter a correct password
And When I press the login button
Then The login should fail

Scenario: Log in with incorrect username and incorrect password
Given I want to log into the application
When I select english as language
And When I enter an incorrect user name
And When I enter an incorrect password
And When I press the login button
Then The login should fail

Scenario: Log in with correct credentials
Given I want to log into the application
When I select english as language
And When I enter a correct user name
And When I enter a correct password
And When I press the login button
And When I select english as language
Then The login should succeed

Scenario: Reset password with illegal e-Mail
Given I want to log into the application
When I have forgotten my password
And When I enter an illegal e-Mail address
And When I press send
Then An error message should be shown

Scenario: Reset password
Given I want to log into the application
When I have forgotten my password
And When I enter a correct email address
And When I press send
Then I should be back at the login page with a success message
