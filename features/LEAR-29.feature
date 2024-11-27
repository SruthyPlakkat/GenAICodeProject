Feature: Hide recommendation sidebar for a non-intrusive browsing experience

  Scenario: User hides the recommendation sidebar
    Given I am on any page with a recommendation sidebar
    When I click the hide button
    Then the sidebar should disappear until I choose to show it again