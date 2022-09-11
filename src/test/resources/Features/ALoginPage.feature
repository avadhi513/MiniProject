@Riya
Feature: Login to the NoBroker website

  Scenario: Login With valid credentials
    Given Launch the browser
    When user Clicks on Login button
    And Enters Phone Number
    And Clicks on I have Passowrd
    And Enters the Password
    Then Click on the Continue button
