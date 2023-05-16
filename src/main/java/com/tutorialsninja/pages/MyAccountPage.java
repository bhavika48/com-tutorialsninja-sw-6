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

public class MyAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accountCreatedText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueBtn;

    public String getAccountLogoutText() {
        Reporter.log("Get Account Logout text  " + accountLogoutText.toString());
       String message= getTextFromElement(accountLogoutText);
        return message;
    }

    public String getYourAccountHasBeenCreatedText() {
        Reporter.log("Get Account Has Been Created  text  " + accountCreatedText.toString());
        String message= getTextFromElement(accountCreatedText);
        return message;
    }
    public void clickOnContinueButton() {
        Reporter.log("Clicking on Continue Button " + continueBtn.toString());
        clickOnElement(continueBtn);
    }
}
