Feature: See recommendations based on browsing history

  Scenario: Display tailored recommendations on product page
    Given I am a logged-in user
    When I visit the product page
    Then I should see at least three recommendations tailored to my browsing history