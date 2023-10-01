Feature:Contact_Regression

  Background:
    Given Navigate to site
    When  SendKeys
      | username | masal |
      | password | 12345 |
    Then Click
      | LogInButton |

  Scenario:Contact_Regression
    When Should be click update button
    Then SendKeys
      | customername     | hamza      |
      | customerlastname | veli       |
      | customeraddress  | izmir      |
      | customercity     | bursa      |
      | customerstate    | uganda     |
      | customerzipcode  | 25612      |
      | customerphone    | 2451241232 |
    And Click
      | updatebutton |

    Then Should be see uptade message
    And Click
      | logout |
    When SendKeys
      | username | masal |
      | password | 12345 |
    Then Click
      | LogInButton |
    When Should be click update button
    Then Checking the entered information

  Scenario: Contact_Regression Negavite
    When Should be click update button
    Then Clear firstname,lastName,city
    And Click
      | updatebutton |
    Then Should be see errormessage
    And Click
      | logout |
    When SendKeys
      | username | masal |
      | password | 12345 |
    Then Click
      | LogInButton |
    When Should be click update button
    Then Checking the entered information