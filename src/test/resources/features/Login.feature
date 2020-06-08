@login
Feature: Authorized users should be able to login

  Background:
    Given user in the login page

  Scenario: login with authorized credentials
    When user enter valid credentials "username" "password"
    Then Account summary page should be displayed

  Scenario: login with wrong/blank username
    When user enter valid credentials "" "password"
    Then Error message "Login and/or password are wrong" should be displayed.

  Scenario: login with wrong/blank password
    When user enter valid credentials "username" ""
    Then Error message "Login and/or password are wrong" should be displayed.

  Scenario: login with blank username/password
    When user enter valid credentials "" ""
    Then Error message "Login and/or password are wrong" should be displayed.