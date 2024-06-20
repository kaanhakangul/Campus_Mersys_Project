Feature: Assignments

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button

    Scenario:User should reach out Assignment page
    When link to assignments
    Then clicks Course button and hover-over on show all to view all assignments
    Then clicks Course button and hover-over on show all to view his her assignments
