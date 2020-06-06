Feature: Authorized users should be able to login
  @login
  Scenario: login
    Given user in the login page
    When user enter valid credentials "username" "password"
    Then Account summary page should be displayed