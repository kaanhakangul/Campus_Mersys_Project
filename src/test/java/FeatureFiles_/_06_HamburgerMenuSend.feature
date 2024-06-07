Feature:Login Functionally
  Scenario:Send and Delete Message

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Hover Over
    And click outbox and move to trash
    And see the confirm message and successfully


