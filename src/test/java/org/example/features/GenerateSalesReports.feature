Feature: Generate Sales Reports

  As a business analyst,
  I want to generate sales reports
  So that I can analyze sales trends and performance.

  Scenario: Generate and download sales report in PDF format
    Given I am in the reporting section
    When I select a date range and report type
    Then I should be able to generate and download the report in PDF format