@homepage
Feature: Autotrader homepage
  I want to use this feature to verify the webelements are present

Background: 
Given User is on Autotrader homepage
  
  Scenario: Homepage elements
    Given Verify first button is present "Browse by Make"
    Then Verify second button is present "Browse by Style"
    Then Verify third button is present "Advanced Search"
    Then Verify Search button is present
    Then Verify drop down menu Make is present
    Then Verify drop down menu Model is present
