package com.tutorialsninja.cucumber.steps;


import com.aventstack.extentreports.Status;
import com.tutorialsninja.pages.AccountRegisterPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.MyAccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AccountLoginSteps {
   @Given("^I am on register page$")
   public void iAmOnRegisterPage() {
   }

   @When("^I click on My Account Link$")
   public void iClickOnMyAccountLink() {
      new HomePage().clickOnMyQAccountTab();

   }

   @And("^I select Register link$")
   public void iSelectRegisterLink() {
      new HomePage().selectMyAccountOptions("Register");
   }


   @And("^I verify the text Register account$")
   public void iVerifyTheTextRegisterAccount() {
      Assert.assertEquals(new AccountRegisterPage().getRegisterAccountText(),
              "Register Account", "Register page not displayed");

   }

   @And("^I should verify the text returning Customer$")
   public void iShouldVerifyTheTextReturningCustomer() {
   }

   @And("^I enter First Name$")
   public void iEnterFirstName() {
      new AccountRegisterPage().enterFirstName("Prime");
   }

   @And("^I enter Last Name$")
   public void iEnterLastName() {
      new AccountRegisterPage().enterLastName("testing");
   }

   @And("^I enter Email$")
   public void iEnterEmail() {
      new AccountRegisterPage().enterEmail("prime@gmail.com");
   }

   @And("^I enter Telephone$")
   public void iEnterTelephone() {
      new AccountRegisterPage().enterTelephone("07988112233");
   }

   @And("^I enter password$")
   public void iEnterPassword() {
      new AccountRegisterPage().enterPassword("test123");
   }

   @And("^I enter password confirm$")
   public void iEnterPasswordConfirm() {
      new AccountRegisterPage().enterConfirmPassword("test123");
   }

   @And("^I select subscribe Yes radio button$")
   public void iSelectSubscribeYesRadioButton() {
      new AccountRegisterPage().selectSubscription("Yes");
   }

   @And("^I click on Privacy Policy check box$")
   public void iClickOnPrivacyPolicyCheckBox() {
      new AccountRegisterPage().clickOnPrivacyPolicyCheckBox();
   }

   @And("^I click on continue button$")
   public void iClickOnContinueButton() {
      new AccountRegisterPage().clickOnContinueButton();
   }

   @And("^I Verify the message \"([^\"]*)\"$")
   public void iVerifyTheMessage(String arg0) {
      Assert.assertEquals(new MyAccountPage().getYourAccountHasBeenCreatedText(), "Your Account Has Been Created!",
              "Account not created");
   }


   @And("^I verify the text Account Logout$")
   public void iVerifyTheTextAccountLogout() {
      Assert.assertEquals(new MyAccountPage().getAccountLogoutText(), "Account Logout", "Not logged out");
   }
}










