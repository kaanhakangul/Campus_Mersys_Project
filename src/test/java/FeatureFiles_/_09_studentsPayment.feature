Feature:Login Functionally
  Scenario:Login with valid username and password

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Hover Over
    And Finance Hover Over
    Then My Finance Click
    And Click on Students Id and Payment Page Appear
    And Free Balance Detail and Installment
