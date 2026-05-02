package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage{

    @FindBy(xpath = "//div[@data-test=\"inventory-item-name\"]")
    WebElement productDetailsPageTitle;

    @FindBy(id= "add-to-cart")
    WebElement addToCartBtn;

    @FindBy(xpath="//span[@class='shopping_cart_badge']")
    WebElement shoppingCart;

    public ProductDetailPage(WebDriver driver){
        super(driver);
    }

    public String getProductDetailPageTitle(){
        return productDetailsPageTitle.getText();
    }

    public void clickOnAddToCartBtn(){
        addToCartBtn.click();
    }

    public String getShoppingCartText(){
        return shoppingCart.getText();
    }

    public void clickOnCartIcon(){
        shoppingCart.click();
    }









}
