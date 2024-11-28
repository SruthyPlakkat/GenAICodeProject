Feature: Update Customer Information

  As a customer service agent,
  I want to update customer information
  So that I can keep records accurate and up-to-date.

  Scenario: Update contact details and save changes successfully
    Given I have access to a customer profile
    When I edit the profile
    Then I should be able to update contact details and save changes successfully