package com.academy.techcenture.pages;
import com.academy.techcenture.config.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//a[text()=' Signup / Login']")
    private WebElement singInButton;
    @FindBy(xpath = "//div[@id='dismiss-button']/div/span")
    private WebElement dismissBtn;
    @FindBy(xpath = "//iframe[@title='Advertisement']")
    private WebElement iframe;
    @FindBy(xpath = "//a[text()=' Logged in as ']")
    private WebElement loginAsUserText;

    public void clickOnSingInBtn(){
        singInButton.click();
    }

    public void closePopUpWindowAd()  {
        driver.switchTo().frame(iframe);
        Actions actions=new Actions(driver);
        actions.contextClick();

//        driver.switchTo().frame(17);
//        dismissBtn.click();
//        driver.switchTo().defaultContent();

    }

    public void verifyVisibilityOfHomePage(){
        Assert.assertEquals("Page is not loaded",driver.getTitle().trim(),"Automation Exercise");
    }

    public void  verifyLogInAsUserIsVisible(){
        Assert.assertEquals("log in as user is not visible", "Logged in as "+ ConfigReader.getProperty("name"),loginAsUserText.getText().trim());
        System.out.println(loginAsUserText.getText().trim());
    }

}
