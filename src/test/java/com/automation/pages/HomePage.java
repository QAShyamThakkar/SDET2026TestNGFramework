package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement filterDropdown;

    public boolean isHomePageDisplayed(){
        return filterDropdown.isDisplayed();
    }

    public void clickOnProductName(String productName){
        String productLinkXpath = "//div[@class='inventory_item_name ' and text()='" + productName + "']";
        WebElement productLink = driver.findElement(By.xpath(productLinkXpath));
        productLink.click();
    }


}
