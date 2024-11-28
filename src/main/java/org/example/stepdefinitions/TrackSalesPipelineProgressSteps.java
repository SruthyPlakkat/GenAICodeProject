package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrackSalesPipelineProgressSteps {
    WebDriver driver;

    @Given("I am on the sales pipeline dashboard")
    public void i_am_on_the_sales_pipeline_dashboard() {
        // Initialize WebDriver and navigate to the sales pipeline dashboard
        driver = new ChromeDriver();
        driver.get("http://example.com/sales-pipeline");
    }

    @When("I view the pipeline")
    public void i_view_the_pipeline() {
        // Code to view the sales pipeline
    }

    @Then("I should see deals categorized by stages with estimated close dates")
    public void i_should_see_deals_categorized_by_stages_with_estimated_close_dates() {
        // Code to verify deals are categorized by stages
    }
}