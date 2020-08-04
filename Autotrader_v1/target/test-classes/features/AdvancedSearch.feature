@advancedSearch
Feature: Advanced Search link
I want to use this feature to test the Advanced Search link

Background:
Given User is on AutoTrader homepage

Scenario:
Given User clicks on Advanced Search button
Then User enters the zip code in the text box "30004"
Then User selects the "Certified" check box under Condition
Then User selects the "Convertible" check box under Style
Then User updates the from Year drop down menu as "2017"
Then User updates the to Year drop down menu as "2020"
Then User selects Make as "BMW" under make, Model & Trim section
Then User clicks on the Search button
