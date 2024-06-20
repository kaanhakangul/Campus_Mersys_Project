Feature: Profile Color

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button

    Scenario: User should be able to see his/her gradings
      When link to grading
      And makes sure buttons in the link work properly