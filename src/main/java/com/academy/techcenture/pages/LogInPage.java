package com.academy.techcenture.pages;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage{
    public LogInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    private WebElement newUserSignup;

    public void verifyNewUserSignupIsVisible(){

    }
}
