Feature: Option to hide the recommendation sidebar

  Scenario: Hide the recommendation sidebar for a non-intrusive browsing experience
    Given I am on any page with a recommendation sidebar
    When I click the hide button
    Then the sidebar should disappear until I choose to show it again
