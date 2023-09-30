Feature: Request Loan

  Scenario: Apply for Loan Request
    Given Navigate to website
    When User clicks on request loan
    Then User fills the necessary money data
    And User selects an account number
    Then User clicks on apply now
    And Loan request processed information is verified
    And Approved message is displayed
    And User clicks on new account number
    Then Account details information is verified
