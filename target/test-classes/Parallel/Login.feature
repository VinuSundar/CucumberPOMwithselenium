Feature: Login Page Feature

Scenario: Login page title
Given user is on login page
When user gets title of the page
Then page title should be "Swag Labs"


Scenario: Login with credentials
Given user is on login page
When user enters username "standard_user"
And user enters password "secret_sauce"
And user clicks login button
Then page title should be "Swag Labs"
