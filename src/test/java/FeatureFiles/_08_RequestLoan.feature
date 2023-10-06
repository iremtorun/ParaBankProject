Feature: Request Loan

  Background:
    Given Navigate to Para Bank
    When Enter username and password and click login button

  Scenario: Apply for Loan Request
    When User clicks on request loan
    Then User fills the necessary money data
    And User selects an account number
    Then User clicks on apply now
    And Loan request processed information is verified
    And Approved message is displayed
    And User clicks on new account number
    Then Account details information is verified
