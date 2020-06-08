Feature: Account Summary page

  Background:
    Given user in the login page
    And user enter valid credentials "username" "password"
    When the user navigates to "Account Summary"


  Scenario: Page title

    Then page should have the title "Zero – Account Summary"


  Scenario: Account types
    Then page should have to following account types:
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

  Scenario: Credit Account columns
    Then Credit Accounts table must have columns
      | Account     |
      | Credit Card |
      | Balance     |
