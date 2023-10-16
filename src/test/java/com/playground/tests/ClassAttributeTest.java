package com.playground.tests;


import com.playground.pages.pages.ClassAttributePage;
import com.playground.pages.pages.HomePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class ClassAttributeTest extends TestBase{



    @Test
    public void clickBlueBtnAndPopUp(){
        new HomePage(driver).selectClassAttibute();
        new ClassAttributePage(driver).clickBlueButton();

    }
}
