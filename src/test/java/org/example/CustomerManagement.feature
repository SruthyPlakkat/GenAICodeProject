Feature: Customer Management

  Scenario: Cancel adding a new customer
    Given User is logged in
    And User is in the customer management section
    When User clicks on "Add New Customer" button
    Then New customer form is displayed
    When User enters details in the form fields
    And User clicks "Cancel" button
    Then New customer form is closed without saving

  Scenario: Display error for invalid contact information
    Given User is logged in
    And User is in the customer management section
    When User clicks on "Add New Customer" button
    Then New customer form is displayed
    When User enters a valid name and invalid contact information "abc"
    And User clicks "Save" button
    Then Error message is displayed for invalid contact information

  Scenario: Display error for missing required fields
    Given User is logged in
    And User is in the customer management section
    When User clicks on "Add New Customer" button
    Then New customer form is displayed
    When User leaves the "Name" field empty and fills other fields
    And User clicks "Save" button
    Then Error message is displayed for missing name
    When User enters a valid name and leaves "Contact Information" field empty
    And User clicks "Save" button
    Then Error message is displayed for missing contact information

  Scenario: Successfully add a new customer profile
    Given User is logged in
    And User is in the customer management section
    When User clicks on "Add New Customer" button
    Then New customer form is displayed
    When User enters a valid name in the "Name" field
    And User enters valid contact information in the "Contact Information" field
    And User enters notes in the "Notes" field
    And User clicks "Save" button
    Then Customer profile is saved
    And Verify the new customer profile appears in the customer list

  Scenario: Verify successful addition of customer profile
    Given User is logged in
    And User is in the customer management section
    When User adds a new customer profile with valid data
    And User navigates back to customer list
    Then Newly added customer profile is visible in the list