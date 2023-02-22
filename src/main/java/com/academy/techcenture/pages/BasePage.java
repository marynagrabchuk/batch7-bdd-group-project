package com.academy.techcenture.pages;

import com.academy.techcenture.config.ConfigReader;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public  void navigateToHomePage(String url){
        driver.get(ConfigReader.getProperty("url")+url);
    }
}
