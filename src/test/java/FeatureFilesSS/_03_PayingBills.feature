Feature: Paying Bills

  Scenario Outline: Paying a Bill
    Given Navigate to site
    When SendKeys
      | username | masal |
      | password | 12345 |
    Then Click
      | LogInButton |
    And Click
      | billpaybutton |
    Then SendKeys
      | payeename | <payeename> |
      | address   | <address>   |
      | city      | <city>      |
      | state     | <state>     |
      | zipcode   | <zipcode>   |
      | phone     | <phone>     |
      | account   | <account>   |
      | verifyacc | <verifyacc> |
      | amount    | <amount>    |

    And Click
      | sendpayment |
    Then Confrim order message
    And Click Accountoverview
    Then Click Accountacc
    And Price Comparison <billtype> Bill

    Examples:
      | payeename                  | address | city  | state | zipcode | phone      | account | verifyacc | amount | billtype    |
      | EnerjiSA Elektrik Faturasi | Turkiye | Izmir | Izmir | 35000   | 5555555555 | 118128  | 118128    | 85     | Electricity |
      | Su Faturasi Odeme          | Turkiye | Izmir | Izmir | 35000   | 5555555555 | 118128  | 118128    | 45     | Water       |
      | Dogalgaz Faturasi Odeme    | Turkiye | Izmir | Izmir | 35000   | 5555555555 | 118128  | 118128    | 120    | Natural Gas |
