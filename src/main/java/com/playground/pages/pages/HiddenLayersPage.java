package com.playground.pages.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HiddenLayersPage extends BasePage{
    public HiddenLayersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#greenButton")
    WebElement greenBtn;

    @FindBy(css = "#blueButton")
    WebElement blueBtn;

    public HiddenLayersPage clickOnGreenButton(){
        clickOnElement(greenBtn);
        return this;

    }

    public HiddenLayersPage clickOnBlueButton(){
        clickOnElement(blueBtn);
        return this;

    }
}
