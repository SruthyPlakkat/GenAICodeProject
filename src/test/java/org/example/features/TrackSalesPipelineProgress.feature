Feature: Track Sales Pipeline Progress

  As a sales manager,
  I want to track the progress of deals in the sales pipeline
  So that I can forecast sales and strategize accordingly.

  Scenario: View deals categorized by stages with estimated close dates
    Given I am on the sales pipeline dashboard
    When I view the pipeline
    Then I should see deals categorized by stages with estimated close dates