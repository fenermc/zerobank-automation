@find
Feature: Find Transactions in Account Activity
Background: User logged in and navigated to Account Activity Page
  Given the user is logged in
  And the user goes to Account Activity

  Scenario Outline: Search date range
    Given the user accesses the Find Transactions tab
    When the user enters date range from "<from>" to "<to>"
    And clicks search
    Then results table should only show transactions dates between "<from>" to "<to>"
#    And the results should be sorted by most recent date
#    When the user enters date range from "<from>" to "<to>"
#    And clicks search
#    Then results table should only show transactions dates between "<from>" to "<to>"
#    And the results table should only not contain transactions dated "<exclude>"
    Examples:
      | from       | to         | exclude    |
      | 2012-09-01 | 2012-09-06 | 2012-09-02 |