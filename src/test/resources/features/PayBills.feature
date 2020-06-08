Feature: Pay Bills page

  Background:
    Given user in the login page
    And user enter valid credentials "username" "password"
    When the user navigates to "Pay Bills"
  @wip
  Scenario: Page title

    Then page should have the title "Zero - Pay Bills"