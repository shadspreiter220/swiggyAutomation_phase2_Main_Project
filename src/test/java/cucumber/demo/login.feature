Feature: Swiggy Automation

  Scenario: Automate Swiggy Web Application
    Given user is on homepage
    When user clicks on city name
    Then user clicks on sign in
    And user types in phone number
    And user clicks on login button
    Then close browser
