package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;


public class AccountRegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountRegisterPage.class.getName());

    public AccountRegisterPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerAccountText;

    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephoneField;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement passwordConfirmField;

    @CacheLookup
    @FindBy(xpath = "//fieldset[3]//input")
    WebElement subscribeRadios;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@name='agree']")
    WebElement privacyPolicyCheckBox;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@value='Continue']")
    WebElement continueBtn;

    @CacheLookup
    @FindBy(xpath = "//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginBtn;

    public String getRegisterAccountText() {
        log.info("Get Register Account Text  " + registerAccountText.toString());
        String message= getTextFromElement(registerAccountText);
        return message;
    }

    public void enterFirstName(String fName) {
        log.info("Enter FirstName " + "  first name field" + emailField.toString());
        sendTextToElement(firstNameField, fName);

    }

    public void enterLastName(String lName) {
       log.info("Enter LastName " + " to last name field" +lastNameField.toString());
        sendTextToElement(lastNameField, lName);

    }

    public void enterEmail(String email) {
        log.info("Enter email " + email + " to email field " + emailField.toString());
        sendTextToElement(emailField, email);


    }

    public void enterTelephone(String telephone) {
        log.info("Enter Telephone " +  " to telephone field " + telephoneField.toString());
        sendTextToElement(telephoneField, telephone);

    }

    public void enterPassword(String password) {
        log.info("Enter password " + password + " to password field " +passwordField.toString());
        sendTextToElement(passwordField, password);

    }

    public void enterConfirmPassword(String cPassword) {
        log.info("Enter Confirm password " +  " to  Confirm password field " + passwordConfirmField.toString());
        sendTextToElement(passwordConfirmField,cPassword);

    }

    public void selectSubscription(String option) {
        List<WebElement> radioButtons = getListOfElements(By.xpath("//fieldset[3]//input"));
        for (WebElement e : radioButtons) {
            if (e.getText().equals(option)) {
                e.click();
                break;
            }
        }
    }

    public void clickOnPrivacyPolicyCheckBox() {
        log.info("Clicking on Privacy CheckBox " + privacyPolicyCheckBox.toString());
        clickOnElement(privacyPolicyCheckBox);

    }

    public void clickOnContinueButton() {
        log.info("Clicking on Continue button " + continueBtn.toString());
        clickOnElement(continueBtn);

    }

}
