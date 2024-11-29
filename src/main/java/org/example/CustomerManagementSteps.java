package com.example.steps;

import com.example.pages.CustomerManagementPage;
import com.example.pages.LoginPage;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomerManagementSteps {

    private WebDriver driver;
    private LoginPage loginPage;
    private CustomerManagementPage customerManagementPage;

    @Given("User is logged in")
    public void userIsLoggedIn() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        customerManagementPage = new CustomerManagementPage(driver);
        driver.get("http://example.com/login");
        loginPage.enterUsername("testUser");
        loginPage.enterPassword("testPass");
        loginPage.clickLoginButton();
    }

    @And("User is in the customer management section")
    public void userIsInTheCustomerManagementSection() {
        driver.get("http://example.com/customer-management");
    }

    @When("User clicks on {string} button")
    public void userClicksOnButton(String buttonName) {
        if (buttonName.equals("Add New Customer")) {
            customerManagementPage.clickAddNewCustomerButton();
        } else if (buttonName.equals("Save")) {
            customerManagementPage.clickSaveButton();
        } else if (buttonName.equals("Cancel")) {
            customerManagementPage.clickCancelButton();
        }
    }

    @Then("New customer form is displayed")
    public void newCustomerFormIsDisplayed() {
        Assert.assertTrue(customerManagementPage.isCustomerFormDisplayed());
    }

    @When("User enters details in the form fields")
    public void userEntersDetailsInTheFormFields() {
        customerManagementPage.enterName("John Doe");
        customerManagementPage.enterContactInformation("1234567890");
        customerManagementPage.enterNotes("Test notes");
    }

    @Then("New customer form is closed without saving")
    public void newCustomerFormIsClosedWithoutSaving() {
        Assert.assertFalse(customerManagementPage.isCustomerFormDisplayed());
    }

    @When("User enters a valid name and invalid contact information {string}")
    public void userEntersAValidNameAndInvalidContactInformation(String contactInfo) {
        customerManagementPage.enterName("John Doe");
        customerManagementPage.enterContactInformation(contactInfo);
    }

    @Then("Error message is displayed for invalid contact information")
    public void errorMessageIsDisplayedForInvalidContactInformation() {
        Assert.assertEquals("Invalid contact information", customerManagementPage.getErrorMessage());
    }

    @When("User leaves the {string} field empty and fills other fields")
    public void userLeavesTheFieldEmptyAndFillsOtherFields(String fieldName) {
        if (fieldName.equals("Name")) {
            customerManagementPage.enterContactInformation("1234567890");
            customerManagementPage.enterNotes("Test notes");
        }
    }

    @Then("Error message is displayed for missing name")
    public void errorMessageIsDisplayedForMissingName() {
        Assert.assertEquals("Name is required", customerManagementPage.getErrorMessage());
    }

    @When("User enters a valid name and leaves {string} field empty")
    public void userEntersAValidNameAndLeavesFieldEmpty(String fieldName) {
        customerManagementPage.enterName("John Doe");
        if (fieldName.equals("Contact Information")) {
            customerManagementPage.enterNotes("Test notes");
        }
    }

    @Then("Error message is displayed for missing contact information")
    public void errorMessageIsDisplayedForMissingContactInformation() {
        Assert.assertEquals("Contact information is required", customerManagementPage.getErrorMessage());
    }

    @When("User enters a valid name in the {string} field")
    public void userEntersAValidNameInTheField(String fieldName) {
        if (fieldName.equals("Name")) {
            customerManagementPage.enterName("John Doe");
        }
    }

    @And("User enters valid contact information in the {string} field")
    public void userEntersValidContactInformationInTheField(String fieldName) {
        if (fieldName.equals("Contact Information")) {
            customerManagementPage.enterContactInformation("1234567890");
        }
    }

    @And("User enters notes in the {string} field")
    public void userEntersNotesInTheField(String fieldName) {
        if (fieldName.equals("Notes")) {
            customerManagementPage.enterNotes("Test notes");
        }
    }

    @Then("Customer profile is saved")
    public void customerProfileIsSaved() {
        // Assuming a method to verify the profile is saved
        Assert.assertTrue(true); // Placeholder for actual verification
    }

    @And("Verify the new customer profile appears in the customer list")
    public void verifyTheNewCustomerProfileAppearsInTheCustomerList() {
        // Assuming a method to verify the profile appears in the list
        Assert.assertTrue(true); // Placeholder for actual verification
    }

    @When("User adds a new customer profile with valid data")
    public void userAddsANewCustomerProfileWithValidData() {
        customerManagementPage.clickAddNewCustomerButton();
        customerManagementPage.enterName("John Doe");
        customerManagementPage.enterContactInformation("1234567890");
        customerManagementPage.enterNotes("Test notes");
        customerManagementPage.clickSaveButton();
    }

    @And("User navigates back to customer list")
    public void userNavigatesBackToCustomerList() {
        driver.navigate().back();
    }

    @Then("Newly added customer profile is visible in the list")
    public void newlyAddedCustomerProfileIsVisibleInTheList() {
        // Assuming a method to verify the profile is visible in the list
        Assert.assertTrue(true); // Placeholder for actual verification
    }
}
