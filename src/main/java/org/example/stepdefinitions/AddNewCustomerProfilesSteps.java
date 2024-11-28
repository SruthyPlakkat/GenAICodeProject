package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddNewCustomerProfilesSteps {
    WebDriver driver;

    @Given("I am logged in")
    public void i_am_logged_in() {
        // Initialize WebDriver and log in
        driver = new ChromeDriver();
        driver.get("http://example.com/login");
    }

    @When("I navigate to the customer management section")
    public void i_navigate_to_the_customer_management_section() {
        // Code to navigate to the customer management section
    }

    @Then("I should be able to add a new customer profile with fields for name, contact information, and notes")
    public void i_should_be_able_to_add_a_new_customer_profile_with_fields_for_name_contact_information_and_notes() {
        // Code to verify adding a new customer profile
    }
}