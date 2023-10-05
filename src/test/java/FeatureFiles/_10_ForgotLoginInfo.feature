Feature: Forgot Login Info

  Background:
    Given Navigate to website

  Scenario: User forget their data
    When User clicks on forgot login info
    And User fills the necessary info
      | forgotName     | Michael             |
      | forgotLastName | Corleone            |
      | forgotAddress  | Godfather's Mansion |
      | forgotCity     | Little Italy        |
      | forgotState    | New York            |
      | forgotZipCode  | 00123               |
      | forgotSsn      | 009988              |

    And User clicks on find my login info button
    Then Logged in message is displayed
    