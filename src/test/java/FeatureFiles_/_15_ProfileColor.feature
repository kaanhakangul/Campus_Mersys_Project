Feature: Profile Color

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button

    Scenario: User should be able to use multiple color options
      When link to profile setting
      Then must see theme menu
      And User should see multiple theme options
      And User should be able to set option first as default
      Then User clicks Save button and sees Success message