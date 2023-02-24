package com.academy.techcenture.pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AccountSuccessfullyCreatedPage extends BasePage {

    public AccountSuccessfullyCreatedPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(tagName = "b")
    private WebElement accountCreatedText;
    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement continueBtn;

    public void verifyNavigatedToAccountCreatedSuccessfullyPage(){
        Assert.assertTrue("Text account created is not visible",accountCreatedText.isDisplayed());
    }
    public void clickOnContinueBtn(){
        continueBtn.click();
    }

    public void closePopUp(){

    }



}
