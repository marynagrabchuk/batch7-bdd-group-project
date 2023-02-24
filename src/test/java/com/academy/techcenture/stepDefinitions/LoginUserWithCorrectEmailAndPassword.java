package com.academy.techcenture.stepDefinitions;

import com.academy.techcenture.driver.Driver;
import com.academy.techcenture.pages.BasePage;
import com.academy.techcenture.pages.HomePage;
import com.academy.techcenture.pages.LogInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginUserWithCorrectEmailAndPassword extends Background{


    @When("user on home page, home page is visible")
    public void user_on_home_page_home_page_is_visible() {

       homePage = new HomePage(driver);
       homePage.verifyVisibilityOfHomePage();

    }
    @Then("user clicks on Signup Login button")
    public void userClicksOnSignupLoginButton() {
        homePage=new HomePage(driver);
        homePage.clickOnSingInBtn();
    }
    @And("user Verifies Login to your account is visible")
    public void userVerifiesLoginToYourAccountIsVisible() {
        logInPage = new LogInPage(driver);
        logInPage.verifyNewUserSignupIsVisible();
    }
    @Then("user Enter correct email address and password")
    public void user_enter_correct_email_address_and_password() {
        logInPage = new LogInPage(driver);
        logInPage.enterEmainOnlogInLine();
    }
    @And("user  Clicks login button")
    public void userClicksLoginButton() {
        logInPage = new LogInPage(driver);
        logInPage.clickLogInBtn();
    }
    @Then("user verify  log in success is visible")
    public void userVerifyLogInSuccessIsVisible() {
        homePage = new HomePage(driver);
        homePage.verifyLogInAsUserIsVisible();
    }



}

class Background {

    protected HomePage homePage;
    protected static WebDriver driver;
    protected LogInPage logInPage;
    private WebDriverWait wait;

    @Given("browser is open")
    public void browser_is_open() {
        driver= Driver.getDriver();
    }
    @Given("the user is on a home page")
    public void the_user_is_on_a_home_page() {
        BasePage basePage = new BasePage(driver);
        basePage.navigateToHomePage("");
        wait=new WebDriverWait(driver, (long)(15));
        //  wait.until(ExpectedConditions.visibilityOfAllElements());

    }
}