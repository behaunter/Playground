package com.playground.pages.pages;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BasePage {


    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillField(String text, WebElement selector) {
        selector.click();
        selector.clear();
        selector.sendKeys(text);
    }

    public boolean isElementDisplayed(String cssLocator) {
        pause(50);
        return getSizeElementsOnPage(cssLocator) > 0;
    }

    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isElementNotDisplayed(List<WebElement> selector) {
//        return getSizeElementsOnPage(cssLocator) == 0;
        return  selector.size() == 0;
    }

    public boolean countElementsOnPage(String cssSelector, int expectedCount) {
        return getSizeElementsOnPage(cssSelector) == expectedCount;
    }

    public int getSizeElementsOnPage(String cssSelector) {
        return driver.findElements(By.cssSelector(cssSelector)).size();
    }



    public String getTextFromElement(String xpath) {
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public void clickOnElementByXpath(String xpathExpression) {
        driver.findElement(By.xpath(xpathExpression)).click();
    }

    public void clickOnElement(WebElement cssSelector) {
//        driver.findElement((By) cssSelector).click();
        cssSelector.click();
    }

    public void takeScreenshot(String link) {
        File fileSrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File linkPath = new File(link);
        try {
            Files.copy(fileSrc, linkPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String makeScreenshot() {
        String path = ("screenshots/screen" + System.currentTimeMillis() / 1000 + ".png");
        takeScreenshot(path);
        return path;
    }

    public void clickOnElementWithJSE(WebElement selector, int x , int y ){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy( " + x + " , " + y + ")");
        clickOnElement(selector);
    }

    public void clickEnter(){
        pause(500);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void acceptAlert(){
        pause(500);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
