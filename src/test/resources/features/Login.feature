@login
Feature: Authorized users should be able to login

  Background:
    Given user in the login page

  Scenario:  login with authorized credentials
    When user enter valid credentials  "username" "password"
    Then Account summary page should be displayed

  Scenario Outline: login with unauthorized credentials
    When user enter invalid credentials "<userName>" "<passWord>"
    Then User should not login and error message should be displayed.
    Examples:
      | userName | passWord |
      | blank    | password |
      | username | blank    |
      | wrong    | password |
      | username | wrong    |
      | blank    | blank    |
      | wrong    | wrong    |
