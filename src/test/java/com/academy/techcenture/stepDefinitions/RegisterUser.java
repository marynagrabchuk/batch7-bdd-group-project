package com.academy.techcenture.stepDefinitions;

import com.academy.techcenture.driver.Driver;
import com.academy.techcenture.pages.BasePage;
import com.academy.techcenture.pages.HomePage;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterUser {
    private WebDriver driver;
    private WebDriverWait wait;
    private HomePage homePage;

    @Given("browser is open")
    public void browser_is_open() {
       driver= Driver.getDriver();
    }
    @Given("the user is on a home page")
    public void the_user_is_on_a_home_page() {
        BasePage basePage = new BasePage(driver);
        basePage.navigateToHomePage("");
        wait=new WebDriverWait(driver, (long)(15));
        wait.until(ExpectedConditions.visibilityOfAllElements());

    }
    @Then("user clicks on sing up button log in button")
    public void user_clicks_on_sing_up_button_log_in_button() {
         homePage = new HomePage(driver);
         homePage.clickOnSingInBtn();

    }
    @Then("user is been navigated to login page")
    public void user_is_been_navigated_to_login_page() {

    }
    @Then("user enters name and email")
    public void user_enters_name_and_email() {

    }
    @Then("user clicks sing up")
    public void user_clicks_sing_up() {

    }
    @Then("user navigates to create an account page")
    public void user_navigates_to_create_an_account_page() {

    }
    @Then("user enters <Title>, <Name>, <Email>, <Password>, <Date of birth>")
    public void user_enters_title_name_email_password_date_of_birth() {

    }
    @Then("user  Select checkbox {string}")
    public void user_select_checkbox(String string) {

    }
    @Then("user Select checkbox 'Receive special offers from our partners!")
    public void user_select_checkbox_receive_special_offers_from_our_partners() {

    }
    @Then("user Fill details: <First name>, <Last name>, <Company>, <Address>, <Address2>, <Country>, <State>, <City>, <Zipcode>, <Mobile>")
    public void user_fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile() {

    }
    @Then("user Clicks {string}")
    public void user_clicks(String string) {

    }
    @Then("user navigated to account created successfully page")
    public void user_navigated_to_account_created_successfully_page() {

    }
    @Then("user clicks continue button")
    public void user_clicks_continue_button() {

    }
    @Then("user navigated to the home page")
    public void user_navigated_to_the_home_page() {

    }
}
