package com.playground.pages.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClassAttributePage extends BasePage{
    public ClassAttributePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(normalize-space(@class), ' btn-primary ')]")
    WebElement blueButton;

    public ClassAttributePage clickBlueButton(){
        clickOnElement(blueButton);
        acceptAlert();
        return this;

    }
}
