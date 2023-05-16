package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNoteBooksPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HomePageSteps {
    @When("^I mouse hover on Desktops tab and click$")
    public void iMouseHoverOnDesktopsTabAndClick() {
        new HomePage().mouseHoverOnDesktopsLinkAndClick();
    }

    @And("^I call selectMenu method and pass the menu = \"([^\"]*)\"$")
    public void iCallSelectMenuMethodAndPassTheMenu(String menuBar) {
      new HomePage().selectMenuBar("Show AllDesktops");
    }

    @Then("^I Should verify the text Desktops$")
    public void iShouldVerifyTheTextDesktops() {
        String expectedMessage = "Desktops";
        String actualMessage = new DesktopsPage(). getTextDesktops();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @When("^I mouse hover on Laptops & Notebooks Tab and click$")
    public void iMouseHoverOnLaptopsNotebooksTabAndClick() {
        new LaptopsAndNoteBooksPage().mouseHoverOnLaptopsAndNoteBooksAndClick();

    }

    @And("^I verify the text Laptops & Notebooks$")
    public void iVerifyTheTextLaptopsNotebooks() {

    }


}
