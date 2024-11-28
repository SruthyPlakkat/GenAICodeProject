Feature: Add New Customer Profiles

  As a sales representative,
  I want to add new customer profiles
  So that I can manage customer information efficiently.

  Scenario: Add a new customer profile with necessary fields
    Given I am logged in
    When I navigate to the customer management section
    Then I should be able to add a new customer profile with fields for name, contact information, and notes