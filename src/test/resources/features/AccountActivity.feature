Feature: Account Activity page

  Background:
    Given user in the login page
    And user enter valid credentials "username" "password"
    When the user navigates to "Account Activity"

  Scenario: Page title

    Then page should have the title "Zero - Account Activity"