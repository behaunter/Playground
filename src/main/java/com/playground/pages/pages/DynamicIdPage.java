package com.playground.pages.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicIdPage extends BasePage{
    public DynamicIdPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Button with Dynamic ID']")
    WebElement DynamicIdBtn;

    public String clickOnDynamicIdButtonAndGetId() {
        clickOnElement(DynamicIdBtn);
        String BtnId = DynamicIdBtn.getAttribute("id");
        System.out.println(BtnId);
        return BtnId;

    }

}
