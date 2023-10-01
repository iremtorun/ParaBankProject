Feature: Negative Register

  Background:
    Given Navigate to website
    When User clicks on register button

  Scenario: Create a new account with an existing username
    When User fills the necessary data
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

    Then Username already exist message is displayed

  Scenario: Create a new account with different password
    When User fills the necessary data
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

    Then Password did not match message is displayed
