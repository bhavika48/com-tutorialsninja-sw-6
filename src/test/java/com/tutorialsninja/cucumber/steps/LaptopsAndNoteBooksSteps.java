package com.tutorialsninja.cucumber.steps;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class LaptopsAndNoteBooksSteps {

    SoftAssert softAssert = new SoftAssert();

    @And("^I click on Show All Laptops & Notebooks$")
    public void iClickOnShowAllLaptopsNotebooks() {
        new DesktopsSteps().iClickOnShowAllDesktops();
    }
    @And("^I select sort By \"([^\"]*)\"$")
    public void iSelectSortBy(String highToLoePrice) {
        new LaptopsAndNoteBooksPage().selectSortByOption("Price (High > Low)");

    }

    @And("^IVerify the product price will arrange in High to Low order$")
    public void iverifyTheProductPriceWillArrangeInHighToLowOrder() {
        List<Double> originalProductsPrice =new LaptopsAndNoteBooksPage() .getProductsPriceList();
    }

    @When("^I mouse hover on Laptops & Notebooks tab and click$")
    public void iMouseHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();

    }

    @And("^I  select Sort By Price \\(High > Low\\)$")
    public void iSelectSortByPriceHighLow() {
        new LaptopsAndNoteBooksPage().selectSortByOption("Price (High > Low)");
    }

    @And("^I  select Product MacBook$")
    public void iSelectProductMacBook() {
        new LaptopsAndNoteBooksPage().selectProductByName("MacBook");
    }

    @And("^I  verify the text MacBook$")
    public void iVerifyTheTextMacBook() {
        Assert.assertEquals(new ProductPage().getProductText(), "MacBook", "MacBook Product not display");
    }

    @And("^I  click on Add To Cart button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @And("^I  verify the message Success: You have added MacBook to your shopping cart!$")
    public void iVerifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        Assert.assertTrue(new ProductPage().getProductAddedSuccessMessage().contains("Success: You have added MacBook to your shopping cart!"),
                "Product not added to cart");
    }

    @And("^I  click on link shopping cart display into success message$")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new ProductPage().clickOnShoppingCartLinkIntoMessage();
    }

    @And("^I verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String arg0){
        Assert.assertTrue(new ShoppingCartPage().getShoppingCartText().contains("Shopping Cart"));
    }

    @And("^I  verify the Product name MacBook$")
    public void iVerifyTheProductNameMacBook() {
        Assert.assertEquals(new ShoppingCartPage().getProductName(), "MacBook", "Product name not matched");
    }

    @And("^I change Quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String arg0){
        new ShoppingCartPage().changeQuantity("2");
    }

    @And("^I click on Update tab$")
    public void iClickOnUpdateTab() {
        new ShoppingCartPage().clickOnQtyUpdateButton();
    }

    @And("^I  verify the message Success: You have modified your shopping cart!$")
    public void iVerifyTheMessageSuccessYouHaveModifiedYourShoppingCart() {
        Assert.assertTrue(new ShoppingCartPage().getSuccessModifiedMessage().contains("Success: You have modified your shopping cart!"));
    }

    @And("^I  verify the total \"([^\"]*)\"$")
    public void iVerifyTheTotal(String arg0){
        softAssert.assertEquals(new ShoppingCartPage().getTotal(), "£737.45", "Total not matched");
        softAssert.assertAll();
    }

    @And("^I  click on checkout button$")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().selectContinueTab();
    }

    @And("^I verify the text Checkout$")
    public void iVerifyTheTextCheckout() {
        String textCheckOut = new ShoppingCartPage().getTextCheckOut();
    }

    @And("^I verify the text New Customer$")
    public void iVerifyTheTextNewCustomer() {
        String message= new AccountLoginPage().getNewCustomerText();


    }

    @And("^I click on guest Checkout radio button$")
    public void iClickOnGuestCheckoutRadioButton() {
        new ShoppingCartPage().getTextCheckOut();
    }

    @And("^I click on Continue tab$")
    public void iClickOnContinueTab() {
        new ShoppingCartPage().selectContinueTab();
    }

    @And("^I  fill the mandatory fields$")
    public void iFillTheMandatoryFields() {
        new AccountRegisterPage().enterFirstName("Ann");
        new AccountRegisterPage().enterLastName("Olins");
        new AccountRegisterPage().enterEmail("ann123@gmail.com");
        new AccountRegisterPage().enterPassword("ann123");
        new AccountRegisterPage().enterConfirmPassword("ann123");
        new AccountRegisterPage().enterTelephone("0784134567");

    }
    @And("^I  add Comments about your order into text area$")
    public void iAddCommentsAboutYourOrderIntoTextArea() {

    }
    @And("^I  check the Terms & Conditions check box$")
    public void iCheckTheTermsConditionsCheckBox() {

    }

    @And("^I click on Continue button$")
    public void iClickOnContinueButton() {
        new ShoppingCartPage().selectContinueTab();
    }

    @Then("^I should verify the message Warning: Payment method required!$")
    public void iShouldVerifyTheMessageWarningPaymentMethodRequired() {
        String expectedMessage7 = "Warning: Payment method required!";
        String actualMessage7 = new ShoppingCartPage().getTextWarningPaymentMethodRequired();
        Assert.assertEquals(expectedMessage7, actualMessage7);
    }


}
