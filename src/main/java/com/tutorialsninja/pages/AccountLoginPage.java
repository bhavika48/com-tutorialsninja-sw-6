package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AccountLoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[2]//h2")
    WebElement returningCustomerText;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[1]//h2")
    WebElement newCustomerText;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailAddressField;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginBtn;


    private static final Logger log = LogManager.getLogger(AccountLoginPage.class.getName());

    public AccountLoginPage() {
        PageFactory.initElements(driver, this);
    }

    public String getReturningCustomerText() {
        log.info("Get text from " + returningCustomerText.toString());
        String message= getTextFromElement(returningCustomerText);
        return message;

    }


    public String getNewCustomerText() {
        log.info("Get text from " + newCustomerText.toString());
        String message= getTextFromElement(newCustomerText);
        return message;

    }

    public void enterEmailAddress(String email) {
        log.info("Enter email " + email + " to email field " + emailAddressField.toString());
        sendTextToElement(emailAddressField, email);

    }

    public void enterPassword(String password) {
        log.info("Enter password " + password + " to password field " + passwordField.toString());
        sendTextToElement(passwordField, password);

    }

    public void clickOnLoginButton() {
        log.info("Clicking on Login Link " + loginBtn.toString());
        clickOnElement(loginBtn);

    }

}
