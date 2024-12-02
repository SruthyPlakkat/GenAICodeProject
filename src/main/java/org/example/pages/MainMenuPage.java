package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMenuPage {
    private WebDriver driver;

    @FindBy(id = "achTransferMenu")
    private WebElement achTransferMenu;

    public MainMenuPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToAchTransferSection() {
        achTransferMenu.click();
    }
}