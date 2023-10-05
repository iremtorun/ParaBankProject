Feature: Defining New Bank Account

  Background:
    Given Navigate to website

  Scenario: User Defines New Bank Account
    When User clicked on the menu to create a current or current account

    Then User saw minimum starting balance message

    Then User entered the information and clicked on the open new account button
    And User saw confirmation message and new account number