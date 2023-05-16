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

public class ComponentsPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComponentsPage.class.getName());

    public ComponentsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]")
    WebElement components;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show AllComponents')]")
    WebElement showAllComponents;

    public void mouseHoverOnComponentsAndClick() {
        log.info("MouseHover on components link " + components.toString());
        clickOnElement(components);

    }

    public void clickOnShowAllComponents() {
        log.info("Clicking on Show All Components Link " + showAllComponents.toString());
        clickOnElement(showAllComponents);


    }
    public String getTitleComponents() {
        return getTextFromElement(By.xpath("//h2[normalize-space()='Components']"));
    }
}
