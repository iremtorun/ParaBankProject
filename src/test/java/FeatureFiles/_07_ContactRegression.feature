Feature:Contact_Regression

  Background:
    Given Navigate to site
    When  SendKeys
      | username | tokyo |
      | password | 1234  |
    Then Click
      | logInButton |

  Scenario:Contact_Regression
    When Should be click update button
    Then SendKeys
      | customerName     | bursa      |
      | customerLastname | veli       |
      | customerAddress  | izmir      |
      | customerCity     | bursa      |
      | customerState    | uganda     |
      | customerZipcode  | 25612      |
      | customerPhone    | 2451241232 |
    And Click
      | updateButton |

    Then Should be see uptade message
    And Click
      | logout |
    When SendKeys
      | username | tokyo |
      | password | 1234  |
    Then Click
      | logInButton |
    When Should be click update button
    Then Checking the entered information

  Scenario: Contact_Regression Negavite
    When Should be click update button
    Then Clear firstname,lastName,city
    And Click
      | updateButton |
    Then Should be see errormessage
    And Click
      | logout |
    When SendKeys
      | username | tokyo |
      | password | 1234  |
    Then Click
      | logInButton |
    When Should be click update button
    Then Checking the entered information