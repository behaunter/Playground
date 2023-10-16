package com.playground.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    public EventFiringWebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.get("http://uitestingplayground.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



    }

    @AfterMethod
    public void tearDown(){driver.quit();}
}
