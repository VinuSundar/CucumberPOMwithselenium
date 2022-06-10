Feature: Home Page Feature

Background:
Given user is already on login page
And user logins to application
|username|password|
|standard_user|secret_sauce|

Scenario: Home page title
Given user is in Home Page
Then user gets inventory names
|Sauce Labs Backpack|
|Sauce Labs Bike Light|
|Sauce Labs Bolt T-Shirt|
|Sauce Labs Fleece Jacket|
|Sauce Labs Onesie|
|Test.allTheThings() T-Shirt (Red)|

And section should be 6



