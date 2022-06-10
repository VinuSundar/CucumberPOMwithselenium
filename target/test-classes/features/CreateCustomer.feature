
Feature: NewCustomer tab validation

Background:
Given user logs in to url 
Then user gives username  and password 
And user clicks Login

Scenario: verify if below fields are displayed
Given user able to navigate to "New Customer" tab
Then user should be able to view below fields
|Customer Name*|
|Gender*|
|Date of Birth*|
|Address*|
|City*|
|State*|
|PIN*|
|Telephone Number|
|E-mail*|
|*mandatory fields|
|Submit|
|Reset|
