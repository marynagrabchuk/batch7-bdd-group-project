package com.academy.techcenture.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserInfopage extends BasePage{
    public UserInfopage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//b[text()='Enter Account Information']")
    private WebElement enterAccountInfoText;

    public void verifyEnterAccountInfoTextIsVisible(){
        Assert.assertTrue("account info text is not visible",enterAccountInfoText.isDisplayed());
    }


}
