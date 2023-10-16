package com.playground.tests;

import com.playground.pages.pages.DynamicIdPage;
import com.playground.pages.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicIdTest extends TestBase{


    @Test
    public void clickWithDynamicId(){
        new HomePage(driver).selectDynamicId();
        String first_id = new DynamicIdPage(driver).clickOnDynamicIdButtonAndGetId();
        driver.navigate().refresh();
        String second_id = new DynamicIdPage(driver).clickOnDynamicIdButtonAndGetId();
        Assert.assertNotEquals(first_id,second_id);

    }

}
