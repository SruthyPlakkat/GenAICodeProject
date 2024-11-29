package com.example.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerManagementPage extends PageObject {

    @FindBy(id = "addNewCustomerButton")
    private WebElement addNewCustomerButton;

    @FindBy(id = "customerForm")
    private WebElement customerForm;

    @FindBy(id = "nameField")
    private WebElement nameField;

    @FindBy(id = "contactInformationField")
    private WebElement contactInformationField;

    @FindBy(id = "notesField")
    private WebElement notesField;

    @FindBy(id = "saveButton")
    private WebElement saveButton;

    @FindBy(id = "cancelButton")
    private WebElement cancelButton;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    @FindBy(id = "customerList")
    private WebElement customerList;

    public CustomerManagementPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void clickAddNewCustomerButton() {
        addNewCustomerButton.click();
    }

    public boolean isCustomerFormDisplayed() {
        return customerForm.isDisplayed();
    }

    public void enterName(String name) {
        nameField.clear();
        nameField.sendKeys(name);
    }

    public void enterContactInformation(String contact) {
        contactInformationField.clear();
        contactInformationField.sendKeys(contact);
    }

    public void enterNotes(String notes) {
        notesField.clear();
        notesField.sendKeys(notes);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickCancelButton() {
        cancelButton.click();
    }

    public boolean isErrorMessageDisplayed() {
        return errorMessage.isDisplayed();
    }

    public boolean isCustomerInList(String customerName) {
        return customerList.getText().contains(customerName);
    }
}
