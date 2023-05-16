package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement deliveryDate;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement model;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement total;

    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement qtyField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement qtyUpdateBtn;

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement successModifiedMessage;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueTab;

    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement checkout;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Checkout']")
    WebElement guestCheckout;


    public String getShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    public String getProductName() {
        Reporter.log("Get Product Name  " + productName.toString());
        String message = getTextFromElement(productName);
        return message;
    }

    public String getDeliveryDate() {
        Reporter.log("Get Delivery Date  " + deliveryDate.toString());
        String message = getTextFromElement(deliveryDate);

        return message;
    }

    public String getModel() {
        Reporter.log("Get model  " + model.toString());
        String message = getTextFromElement(model);
        return message;
    }

    public String getTotal() {
        Reporter.log("Get Total  " + total.toString());
        String message = getTextFromElement(total);

        return message;
    }

    public void changeQuantity(String qty) {
        log.info("change Quantity " + qtyField.toString());
        sendTextToElement(qtyField, qty);

    }

    public void clickOnQtyUpdateButton() {
        log.info("Clicking on update Button " + qtyUpdateBtn.toString());
        clickOnElement(qtyUpdateBtn);

    }

    public String getSuccessModifiedMessage() {
        log.info("Get Success Modified Message  " + successModifiedMessage.toString());
        String message = getTextFromElement(successModifiedMessage);
        return message;
    }

    public void selectContinueTab() {
        log.info("Clicking on continue Button " + continueTab.toString());
        clickOnElement(continueTab);
    }

    public void selectGuestCheckOut() {
        log.info("Clicking on guest checkout Button " + checkout.toString());
        clickOnElement(checkout);
    }

    public String getTextCheckOut() {
        log.info("Get check out guest text  " + guestCheckout.toString());
        String message = getTextFromElement(guestCheckout);
        return getTextFromElement(guestCheckout);
    }
    public String getTextWarningPaymentMethodRequired() {
        return getTextFromElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
    }
}


