package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyProductsSortedByPriceLowToHigh extends BaseTest {

    @Test
    public void verifyProductsSortedByPriceLowToHigh() {

        loginPage.doLogin();
        Assert.assertTrue(homePage.isHomePageDisplayed());

        homePage.selectFilterOption("Price (low to high)");
        Assert.assertTrue(homePage.isProductSortedByPriceLowToHigh());



    }


}
