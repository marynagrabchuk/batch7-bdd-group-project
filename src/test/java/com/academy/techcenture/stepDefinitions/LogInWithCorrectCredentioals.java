package com.academy.techcenture.stepDefinitions;

import com.academy.techcenture.driver.Driver;
import com.academy.techcenture.pages.*;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInWithCorrectCredentioals  {
    protected WebDriver driver;
    private WebDriverWait wait;
    private HomePage homePage;
    private LogInPage logInPage;
    private UserInfopage userInfopage;
    private Select select;
    private AccountSuccessfullyCreatedPage accountSuccessfullyCreatedPage;

    @When("user clicking on Signup Login button")
    public void user_clicking_on_signup_login_button() {
        homePage = new HomePage(driver);
        homePage.clickOnSingInSignUpBtn();
    }
    @When("user Verifies Login to your account is visible")
    public void user_verifies_login_to_your_account_is_visible() {
        logInPage = new LogInPage(driver);
        logInPage.verifyLogInToAccountIsVisible();
    }
    @Then("user Enter correct email address and password")
    public void user_enter_correct_email_address_and_password() {

    }
    @Then("user  Clicks login button")
    public void user_clicks_login_button() {

    }
    @Then("user verify  log in success is visible")
    public void user_verify_log_in_success_is_visible() {

    }


}
