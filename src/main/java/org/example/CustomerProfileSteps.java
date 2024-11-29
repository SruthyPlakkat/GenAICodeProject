package com.example.steps;

import com.example.pages.CustomerManagementPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CustomerProfileSteps {

    private CustomerManagementPage customerManagementPage;

    @Step("Given the User is on the customer management page")
    public void userIsOnCustomerManagementPage() {
        customerManagementPage.open();
    }

    @Step("When the User clicks on 'Add New Customer' button")
    public void userClicksAddNewCustomerButton() {
        customerManagementPage.clickAddNewCustomerButton();
    }

    @Step("Then the new customer form should be displayed")
    public void newCustomerFormShouldBeDisplayed() {
        Assert.assertTrue("Customer form should be displayed", customerManagementPage.isCustomerFormDisplayed());
    }

    @Step("When the User enters details in the form fields")
    public void userEntersDetailsInFormFields(String name, String contact, String notes) {
        customerManagementPage.enterName(name);
        customerManagementPage.enterContactInformation(contact);
        customerManagementPage.enterNotes(notes);
    }

    @Step("And the User clicks the 'Cancel' button")
    public void userClicksCancelButton() {
        customerManagementPage.clickCancelButton();
    }

    @Step("Then the new customer form should be closed without saving")
    public void newCustomerFormShouldBeClosedWithoutSaving() {
        Assert.assertFalse("Customer form should not be displayed", customerManagementPage.isCustomerFormDisplayed());
    }

    @Step("And the User clicks the 'Save' button")
    public void userClicksSaveButton() {
        customerManagementPage.clickSaveButton();
    }

    @Step("Then an error message should be displayed for invalid contact information")
    public void errorMessageShouldBeDisplayedForInvalidContactInformation() {
        Assert.assertTrue("Error message should be displayed", customerManagementPage.isErrorMessageDisplayed());
    }

    @Step("Then an error message should be displayed for missing {0}")
    public void errorMessageShouldBeDisplayedForMissingField(String field) {
        Assert.assertTrue("Error message should be displayed for missing " + field, customerManagementPage.isErrorMessageDisplayed());
    }

    @Step("Then the customer profile should be saved")
    public void customerProfileShouldBeSaved() {
        // Assuming some logic to verify the profile is saved
    }

    @Step("And the new customer profile should appear in the customer list")
    public void newCustomerProfileShouldAppearInCustomerList(String customerName) {
        Assert.assertTrue("Customer should appear in the list", customerManagementPage.isCustomerInList(customerName));
    }

    @Step("Given the User has added a new customer profile with valid data")
    public void userHasAddedNewCustomerProfileWithValidData() {
        userIsOnCustomerManagementPage();
        userClicksAddNewCustomerButton();
        newCustomerFormShouldBeDisplayed();
        userEntersDetailsInFormFields("Valid Name", "Valid Contact", "Some notes");
        userClicksSaveButton();
        customerProfileShouldBeSaved();
    }

    @Step("When the User navigates back to the customer list")
    public void userNavigatesBackToCustomerList() {
        // Assuming some logic to navigate back to the customer list
    }

    @Step("Then the newly added customer profile should be visible in the list")
    public void newlyAddedCustomerProfileShouldBeVisibleInList(String customerName) {
        Assert.assertTrue("Newly added customer should be visible in the list", customerManagementPage.isCustomerInList(customerName));
    }
}
