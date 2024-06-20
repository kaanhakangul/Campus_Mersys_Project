Feature: Profile Color

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button

    Scenario: User should be able to download documents
      When link to grading
     # Then User should be able to view course grade and click on download button
      Then User should be able to view student transcript and click on print button
      And User must see pdf document when clicking on print button
