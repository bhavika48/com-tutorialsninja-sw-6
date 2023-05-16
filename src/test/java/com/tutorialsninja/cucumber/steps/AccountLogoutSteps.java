package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.pages.AccountRegisterPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import cucumber.api.java.en.And;

public class AccountLogoutSteps {

    @And("^I  enter Email address$")
    public void iEnterEmailAddress() {
        new AccountRegisterPage().enterEmail("ann132@gmail.com");

    }

    @And("^I enter password$")
    public void iEnterPassword() {
        new AccountRegisterPage().enterPassword("test123");
    }


    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("^I  verify text My Account$")
    public void iVerifyTextMyAccount() {

    }

    @And("^I  vlick on My Account Link$")
    public void iVlickOnMyAccountLink() {
        new HomePage().clickOnMyQAccountTab();

    }

    @And("^I  call the method selectMyAccountOptions method and pass the parameter Logout$")
    public void iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameterLogout() {
    }

}
