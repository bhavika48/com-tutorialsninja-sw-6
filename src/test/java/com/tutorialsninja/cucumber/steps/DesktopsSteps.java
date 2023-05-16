package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class DesktopsSteps {
    @And("^I  click on Show All Desktops$")
    public void iClickOnShowAllDesktops() {
        new DesktopsPage().clickOnShowAllDeskTops();

    }

    @And("^I select Sort By position Name: Z to A$")
    public void iSelectSortByPositionNameZToA() {
        new DesktopsPage().sortingDesktopsFromZtoA("Z To A");

    }

    @Then("^I should Verify the Product will arrange in Descending order$")
    public void iShouldVerifyTheProductWillArrangeInDescendingOrder() {
        new DesktopsPage().getProductsNameList();
    }


    @And("^I select Sort By position Name: A to Z$")
    public void iSelectSortByPositionNameAToZ() {
        new DesktopsPage().selectSortByOption("A To Z");
    }

    @And("^I select product HP LP(\\d+)$")
    public void iSelectProductHPLP(int arg0) {
        new HomePage().selectCurrency("£ Pound Sterling");
    }

    @And("^I verify the Text HP LP(\\d+)$")
    public void iVerifyTheTextHPLP(int arg0) {
        Assert.assertEquals(new ProductPage().getProductText(), "HP LP3065", "HP LP3065 Product not display");
    }

    @And("^I select Delivery Date (\\d+)-(\\d+)-(\\d+)$")
    public void iSelectDeliveryDate(int arg0, int arg1, int arg2) {
        new ProductPage().selectDeliveryDate("30", "November", "2023");
    }

    @And("^I enter Qty (\\d+) using Select class$")
    public void iEnterQtyUsingSelectClass(int arg0) {
        new ProductPage().enterQuantity("1");
    }

    @And("^I click on Add to Cart button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @And("^I verify the Message Success: You have added HP LP(\\d+) to your shopping cart!$")
    public void iVerifyTheMessageSuccessYouHaveAddedHPLPToYourShoppingCart(int arg0) {
        String expectedMessage = "Success: You have added HP LP3065 to your shopping cart!";
        String ActualMessage = new ProductPage().getTextYouHaveAddedHpToCart();
        Assert.assertEquals(ActualMessage, expectedMessage);
    }

    @And("^I click on link shopping cart display into success message$")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {

    }

    @And("^I verify the text Shopping Cart$")
    public void iVerifyTheTextShoppingCart() {
        new ProductPage().clickOnShoppingCartLinkIntoMessage();
    }

    @And("^I verify the Product name HP LP(\\d+)$")
    public void iVerifyTheProductNameHPLP(int arg0) {
        Assert.assertEquals(new ShoppingCartPage().getProductName(), "HP LP3065", "Product name not matched");
    }

    @And("^I select Delivery Date \"([^\"]*)\"$")
    public void iSelectDeliveryDate(String arg0) {
        Assert.assertTrue(new ShoppingCartPage().getDeliveryDate().contains("2023-11-30"), "Delivery date not matched");
    }

    @And("^I verify the Model Product(\\d+)$")
    public void iVerifyTheModelProduct(int arg0) {
        Assert.assertEquals(new ShoppingCartPage().getModel(), "Product 21", "Model not matched");

    }

    @Then("^I verify the Todat £(\\d+)\\.(\\d+)$")
    public void iVerifyTheTodat£(int arg0, int arg1) {
        Assert.assertEquals(new ShoppingCartPage().getTotal(), "£74.73", "Total not matched");
    }


}


