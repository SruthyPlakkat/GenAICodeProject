Feature: Customer Profile Management

  Scenario: Cancel Adding New Customer Profile
    Given the User is on the customer management page
    When the User clicks on "Add New Customer" button
    Then the new customer form should be displayed
    When the User enters details in the form fields
    And the User clicks the "Cancel" button
    Then the new customer form should be closed without saving

  Scenario Outline: Add Customer Profile with Invalid Contact Information
    Given the User is on the customer management page
    When the User clicks on "Add New Customer" button
    Then the new customer form should be displayed
    When the User enters "<name>" in the "Name" field
    And the User enters "<contact>" in the "Contact Information" field
    And the User clicks the "Save" button
    Then an error message should be displayed for invalid contact information

    Examples:
      | name   | contact |
      | John   | abc     |

  Scenario Outline: Add Customer Profile with Missing Information
    Given the User is on the customer management page
    When the User clicks on "Add New Customer" button
    Then the new customer form should be displayed
    When the User leaves the "<field>" field empty and fills other fields
    And the User clicks the "Save" button
    Then an error message should be displayed for missing <field>

    Examples:
      | field              |
      | Name               |
      | Contact Information|

  Scenario: Add New Customer Profile
    Given the User is on the customer management page
    When the User clicks on "Add New Customer" button
    Then the new customer form should be displayed
    When the User enters a valid name in the "Name" field
    And the User enters valid contact information in the "Contact Information" field
    And the User enters notes in the "Notes" field
    And the User clicks the "Save" button
    Then the customer profile should be saved
    And the new customer profile should appear in the customer list

  Scenario: Verify Successful Addition of Customer Profile
    Given the User has added a new customer profile with valid data
    When the User navigates back to the customer list
    Then the newly added customer profile should be visible in the list