package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPage extends BasePage{


    public OrderConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//h2[@class='complete-header']")
    WebElement successMsg;

    public String getSuccessMsg (){
        System.out.println(successMsg.getText());
        return  successMsg.getText();
    }


}
