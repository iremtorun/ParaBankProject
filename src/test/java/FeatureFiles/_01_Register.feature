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
      | zipCode         | 001234577           |
      | phoneNumber     | 005511255           |
      | ssn             | 535270359722        |
      | userName        | michaelTheCorleone  |
      | password        | 12340               |
      | passwordConfirm | 12340               |

    Then Successful message is displayed
