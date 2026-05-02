package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    WebElement itemNameOnCart;

    @FindBy(id = "checkout")
    WebElement checkoutBtn;

    public String getItemNameOnCart(){
        System.out.println(itemNameOnCart.getText());
        return itemNameOnCart.getText();
    }

    public void clickOnCheckOutBtn(){
        checkoutBtn.click();
    }




}
