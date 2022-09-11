@Rent
Feature: Entering Details in Rent Agreeement Page

  Background: 
    Given Launch the browser
    When user Clicks on Login button
    And Enters Phone Number
    And Clicks on I have Passowrd
    And Enters the Password
    Then Click on the Continue button

  Scenario: Entering details on Rent Agreement page
    Given User is on Rent Agreement Page
    When User clicks on Rent Agreement
    And user selects city
    And user Clicks on rent agreement Select button
    And User selects agreement duration
    And User Enters Montly rent amount
    And user enters Refundable Deposit Amount
    And User clicks on owner button
    And User Clicks On Save and Continue button
    And User Clicks On Paynow button
    Then User Clicks on continue button
