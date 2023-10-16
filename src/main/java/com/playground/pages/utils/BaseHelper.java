package com.playground.pages.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class BaseHelper {

    WebDriver driver;

    public BaseHelper(WebDriver driver) {
        super();
    }


    public void takeScreenshot(String link) {
        File fileSrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File linkPath = new File(link);
        try {
            com.google.common.io.Files.copy(fileSrc, linkPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String makeScreenshot() {
        String path = ("screenshots/screen" + System.currentTimeMillis() / 1000 + ".png");
        takeScreenshot(path);
        return path;
    }

}
