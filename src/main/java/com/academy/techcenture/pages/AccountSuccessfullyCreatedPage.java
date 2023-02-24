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
        // Set the implicit wait time for the driver
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String mainWindowHandle = driver.getWindowHandle();

// Define a new WebDriverWait instance with a timeout of 10 seconds
        WebDriverWait wait = new WebDriverWait(driver, 10);

// Wait for the pop-up window to appear
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

// Switch to the pop-up window
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        Alert alert = driver.switchTo().alert();
        alert.dismiss();



// Perform actions on the pop-up window
// ...

// Switch back to the main window
        driver.switchTo().window(mainWindowHandle);
    }


}
