package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AchTransferPage {
    private WebDriver driver;

    @FindBy(id = "achTransferSection")
    private WebElement achTransferSection;

    public AchTransferPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isAchTransferSectionDisplayed() {
        return achTransferSection.isDisplayed();
    }
}