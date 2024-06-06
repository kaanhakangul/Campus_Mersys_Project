Feature:Login Functionally
  Scenario:Login with valid username and password

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Click New Message and see receivers
    And Select receivers and put subject
    And Get text
