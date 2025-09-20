package com.thetestingacademy.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {

    @Description("Open the app.vwo.com url and verify the current url")
    @Test
    public void testSeleniumBasics(){
        // Open the url
        FirefoxDriver driver = new FirefoxDriver();

        // new EdgeDriver(); -> POST Request(Browser Driver) (localhost:XXXXX),
        // Create New Session Endpoint - 16 digit Unique ID is also created.


        // Navigate the URL -> HTTP GET the URL
        driver.get("https://app.vwo.com");

        // Assert the URL - Validation - TestNG Assertions
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        // POST request to close all the tabs in the browser
        driver.quit();
    }
}
