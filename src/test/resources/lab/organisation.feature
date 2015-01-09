Feature: Organisation

Background:
Given I am logged into the english page

Scenario: Add a Club
When I select Clubs
And When I click the Add Button
And When I enter a name "Springfield Elementary School Karate Club"
And When I click the Save Button
Then The Club "Springfield Elementary School Karate Club" should be shown
