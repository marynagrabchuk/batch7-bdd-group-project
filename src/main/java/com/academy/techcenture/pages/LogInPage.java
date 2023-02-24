package com.academy.techcenture.pages;

import com.academy.techcenture.config.ConfigReader;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
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
    @FindBy(xpath = "//h2[text()='Login to your account']")
    private WebElement logInToAccountText;
    @FindBy(xpath = "//button[text()='Signup']")
    private WebElement singUpBtn;
    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement nameInput;
    @FindBy(xpath = "//h2[text()='New User Signup!']//following-sibling::form/input[@placeholder='Email Address']")
    private WebElement emailInput;
    @FindBy(xpath = "//h2[text()='New User Signup!']//following-sibling::form/button[@type='submit']")
    private WebElement submitBtnForSignUp;
    @FindBy(xpath = "//input[@name='email' and @data-qa='login-email']")
    private WebElement signInEmail;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passwordInput;
    @FindBy(xpath = "//button[text()='Login']")
    private WebElement logInBtn;
    public void verifyNewUserSignupIsVisible(){
        Assert.assertTrue("The message new user sing up is not displayed",newUserSignup.isDisplayed());

    }
    public void enterNameAndEmail(){
        nameInput.sendKeys(ConfigReader.getProperty("name"));
        emailInput.sendKeys(getRandomEmail());

    }
    public void verifyLogInToAccountIsVisible(){
        Assert.assertTrue("Log In to account is not visible",logInToAccountText.isDisplayed());
    }

    public void clickSignInBtn(){
        singUpBtn.click();
    }
    public void  clickOnSubmitSignUpBtn(){
        submitBtnForSignUp.click();
    }
    private String getRandomEmail(){
        String saurse = "qwertyuioplkjhgfdsazxcvbnm567412309";
        String email = "";
        for (int i = 0; i <5; i++) {
            int v = (int)(Math.random() * saurse.length());
            email+=saurse.charAt(v);
        }
        email+="@gmail.com";
        return email;
    }

    public void enterEmainOnlogInLine(){
        signInEmail.sendKeys(ConfigReader.getProperty("email1"));
        passwordInput.sendKeys(ConfigReader.getProperty("userPassword"));
    }
    public void clickLogInBtn(){
        logInBtn.click();
    }
}
