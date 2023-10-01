Feature: Register

  Scenario: Create a new account
    Given Navigate to website
    When User clicks on register button
    And User fills the necessary data
      | firstName       | Michael             |
      | lastName        | Corleone            |
      | address         | Godfather's Mansion |
      | city            | Little Italy        |
      | state           | New York            |
      | zipCode         | 00123               |
      | phoneNumber     | 001212              |
      | ssn             | 009988              |
      | userName        | michaelTheCorleone9 |
      | password        | 12340               |
      | passwordConfirm | 12340               |

    Then Successful message is displayed
    