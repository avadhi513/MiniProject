@asta
Feature: Setting details in the NoBroker website

  Background: 
    Given Launch the browser
    When user Clicks on Login button
    And Enters Phone Number
    And Clicks on I have Passowrd
    And Enters the Password
    Then Click on the Continue button

  Scenario: Entering details for searching on Home Page
    Given User is on Home Page
    When user selects a city
    And user selects a locality
    And user selects the options(pg/ flat/ house)
    And user selects tenant type
    And user selects room type
    Then user clicks on Search button.
