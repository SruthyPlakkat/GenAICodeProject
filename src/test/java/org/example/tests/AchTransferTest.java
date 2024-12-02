package com.example.tests;

import com.example.steps.AchTransferSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class AchTransferTest {
    private AchTransferSteps achTransferSteps;

    @Before
    public void setUp() {
        achTransferSteps = new AchTransferSteps();
    }

    @Test
    public void testNavigateToAchTransferSection() {
        achTransferSteps.userIsLoggedIn();
        achTransferSteps.userNavigatesToAchTransferSection();
        achTransferSteps.achTransferSectionIsDisplayed();
    }

    @After
    public void tearDown() {
        achTransferSteps.driver.quit();
    }
}