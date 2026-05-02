package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPage extends BasePage {

    public ReviewPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    WebElement itemNameOnCheckout;

    @FindBy(id = "finish")
    WebElement finishBtn;

    public String getItemNameOnReviewPage(){
        System.out.println(itemNameOnCheckout.getText());
        return itemNameOnCheckout.getText();
    }

    public  void clickOnFinishBtn(){
        finishBtn.click();

    }
}
