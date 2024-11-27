Feature: Enhance product recommendations using demographic information

  Scenario: Incorporate demographic data to improve recommendation relevance
    Given a user has provided demographic information
    When generating product recommendations
    Then the system should incorporate this demographic data to improve the relevance of the recommendations
