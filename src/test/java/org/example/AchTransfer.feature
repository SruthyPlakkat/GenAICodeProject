Feature: ACH Transfer Navigation

  Scenario: User navigates to the ACH transfer section
    Given the user is logged in
    When the user navigates to the ACH transfer section from the main menu
    Then the ACH transfer section is displayed