package com.playground.pages.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(linkText = "Dynamic ID")
    WebElement DynamicIdLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public DynamicIdPage selectDynamicId(){

        clickOnElement(DynamicIdLink);
        return new DynamicIdPage(driver);

    }

    @FindBy(linkText = "Class Attribute")
    WebElement ClassAttributeBtn;

    public ClassAttributePage selectClassAttibute() {
        clickOnElement(ClassAttributeBtn);

        return new ClassAttributePage(driver);
    }

    @FindBy(linkText = "Hidden Layers")
    WebElement HiddenLayersBtn;

    public HiddenLayersPage selectHiddenLayers() {
        clickOnElement(HiddenLayersBtn);

        return new HiddenLayersPage(driver);
    }
}
