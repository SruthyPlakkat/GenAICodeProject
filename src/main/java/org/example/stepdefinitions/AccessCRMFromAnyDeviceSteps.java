package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessCRMFromAnyDeviceSteps {
    WebDriver driver;

    @Given("I have internet access")
    public void i_have_internet_access() {
        // Assume internet access is available
    }

    @When("I log into the CRM system")
    public void i_log_into_the_crm_system() {
        // Code to log into the CRM system
        driver = new ChromeDriver();
        driver.get("http://example.com/crm");
    }

    @Then("I should be able to access it from a desktop, tablet, or smartphone")
    public void i_should_be_able_to_access_it_from_a_desktop_tablet_or_smartphone() {
        // Code to verify access from various devices
    }
}