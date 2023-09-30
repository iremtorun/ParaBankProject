Feature: Paying Bills

  Scenario: Electricity Bill
    Given Navigate to site
    When  SendKeys
      | username | kalem |
      | password | 12345 |
    Then Click
      | LogInButton |
    And Click
      | billpaybutton |
    Then SendKeys
      | payeename | EnerjiSA Elektrik Faturasi |
      | address   | Turkiye                    |
      | city      | Izmir                      |
      | state     | Izmir                      |
      | zipcode   | 35000                      |
      | phone     | 5555555555                 |
      | account   | 118128                     |
      | verifyacc | 118128                     |
      | amount    | 85                         |

    And Click
      | sendpayment |
    Then Confrim order message

    And Click Accountoverview

    Then Click Accountacc


    Then Price Comparison Electricity Bill

  Scenario: Water Bill
    And Click
      | billpaybutton |

    Then SendKeys
      | payeename | Su Faturasi Odeme |
      | address   | Turkiye           |
      | city      | Izmir             |
      | state     | Izmir             |
      | zipcode   | 35000             |
      | phone     | 5555555555        |
      | account   | 118128            |
      | verifyacc | 118128            |
      | amount    | 45                |
    And Click
      | sendpayment |
    Then Confrim order message
    And Click Accountoverview
    Then Click
      | accountacc |

    Then Price Comparison Water Bill


  Scenario: Natural Gas bill
    And Click
      | billpaybutton |

    Then SendKeys
      | payeename | Dogalgaz Faturasi Odeme |
      | address   | Turkiye                 |
      | city      | Izmir                   |
      | state     | Izmir                   |
      | zipcode   | 35000                   |
      | phone     | 5555555555              |
      | account   | 118128                  |
      | verifyacc | 118128                  |
      | amount    | 120                     |
    And Click
      | sendpayment |
    Then Confrim order message
    And Click Accountoverview
    Then Click
      | accountacc |
    Then Price Comparison Natural Gas Bill