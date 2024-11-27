Feature: Receive product recommendations based on purchase history

  Scenario: Display recommendations based on user's purchase history
    Given I have made previous purchases
    When I visit the homepage
    Then I should see recommendations based on my purchase history
