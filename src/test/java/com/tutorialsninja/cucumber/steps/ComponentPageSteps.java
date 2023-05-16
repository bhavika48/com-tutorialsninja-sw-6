package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ComponentPageSteps {
    @When("^I mouse hover on Components Tab and click$")
    public void iMouseHoverOnComponentsTabAndClick() {
        new ComponentsPage().mouseHoverOnComponentsAndClick();
    }

    @And("^I call selectMenu method and pass the menu = Show All Components$")
    public void iCallSelectMenuMethodAndPassTheMenuShowAllComponents() {
        new HomePage().selectMenuBar("Show All Components");
    }

    @Then("^I verify the text Components$")
    public void iVerifyTheTextComponents() {
        String expectedMessage = "Components";
        String actualMessage = new ComponentsPage().getTitleComponents();
        Assert.assertEquals(actualMessage, expectedMessage);
    }


}
