Feature: Defining New Bank Account
  Scenario: User Defines New Bank Account
    Given Navigate to website
    When User clicked on the menu to create a current or current account
    Then Options were offered to the user when creating an account(savings,checking)
    And User selected a bank account
    Then User saw minimum starting balance message
    And User selected the desired account for the starting balance
    Then User entered the information and clicked on the open new account button
    And User saw confirmation message and new account number