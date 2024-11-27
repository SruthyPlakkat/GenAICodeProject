Feature: Enhance product recommendations using demographic information

  Scenario: Incorporate demographic data into recommendations
    Given a user has provided demographic information
    When generating product recommendations
    Then the system should incorporate demographic data to improve relevance