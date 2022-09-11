@Anuja
Feature: Search Functionality

  Background: 
    Given Launch the browser
    When user Clicks on Login button
    And Enters Phone Number
    And Clicks on I have Passowrd
    And Enters the Password
    Then Click on the Continue button
    Given User is on Home Page
    When user selects a city
    And user selects a locality
    And user selects the options(pg/ flat/ house)
    And user selects tenant type
    And user selects room type
    Then user clicks on Search button.

  Scenario: Entering Search details on search page
    Given user is on Search Property Page
    When user selects apartment type
    And user selects availabiltity
    And user selects preferred tenants
    And user selects Furnishing type
    And user selects Floors
    And user selects matching property
    And user clicks on create agreement
    Then user clicks on know more
