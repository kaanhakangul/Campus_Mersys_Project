Feature: Hamburger Menu

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button

    Scenario:Make payment in finance section
      Then Click on the Finance and My Finance and choose online method and stripe

      When the student selects Stripe and makes a payment
