package com.automation.test;

import com.automation.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class OrderPlacementTestClass extends BaseTest {

    @Test
    public void orderPlacementTest() {

        loginPage.doLogin();
        Assert.assertTrue(homePage.isHomePageDisplayed());

        String name = "Sauce Labs Backpack";
        homePage.clickOnProductName(name);

        Assert.assertEquals(productDetailPage.getProductDetailPageTitle(), name);
        productDetailPage.clickOnAddToCartBtn();

        Assert.assertEquals(productDetailPage.getShoppingCartText(), "1");
        productDetailPage.clickOnCartIcon();

        Assert.assertEquals(cartPage.getItemNameOnCart(), name);
        cartPage.clickOnCheckOutBtn();

        checkoutPage.checkOutInfo("The Great", "Arslan", "1234");
        checkoutPage.clickOnContinue();

        Assert.assertEquals(reviewPage.getItemNameOnReviewPage(), name);
        reviewPage.clickOnFinishBtn();

        Assert.assertEquals(orderConfirmationPage.getSuccessMsg(), "Thank you for your order!");

    }

}
