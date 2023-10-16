package com.playground.tests;

import com.playground.pages.pages.HiddenLayersPage;
import com.playground.pages.pages.HomePage;
import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.annotations.Test;

public class HiddenLayersTest extends TestBase{

    @Test(expectedExceptions = ElementClickInterceptedException.class)
    public void clickOnGreenButtonTwice(){
      new HomePage(driver).selectHiddenLayers();
      new HiddenLayersPage(driver)
              .clickOnGreenButton()
              .pause(200);

        new HiddenLayersPage(driver).clickOnGreenButton();
    }

    @Test
    public void clickGreenAndBlueButton(){
        new HomePage(driver).selectHiddenLayers();
        new HiddenLayersPage(driver)
                .clickOnGreenButton()
                .pause(200);

        new HiddenLayersPage(driver).clickOnBlueButton();
    }
}
