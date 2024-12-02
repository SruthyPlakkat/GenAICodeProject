package com.example.steps;

import com.example.pages.AchTransferPage;
import com.example.pages.LoginPage;
import com.example.pages.MainMenuPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AchTransferSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    private MainMenuPage mainMenuPage;
    private AchTransferPage achTransferPage;

    public AchTransferSteps() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        mainMenuPage = new MainMenuPage(driver);
        achTransferPage = new AchTransferPage(driver);
    }

    @Step("The User is logged in")
    public void userIsLoggedIn() {
        driver.get("http://example.com/login");
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("password");
        loginPage.clickLoginButton();
    }

    @Step("The User navigates to the ACH transfer section from the main menu")
    public void userNavigatesToAchTransferSection() {
        mainMenuPage.navigateToAchTransferSection();
    }

    @Step("The ACH transfer section is displayed")
    public void achTransferSectionIsDisplayed() {
        Assert.assertTrue("ACH transfer section is not displayed", achTransferPage.isAchTransferSectionDisplayed());
    }
}