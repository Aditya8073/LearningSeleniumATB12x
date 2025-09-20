package com.thetestingacademy.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium11_Navigation {
    @Test
    @Description("Navigate to the URL")
    public void testNavigate(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

        //  Use Navigation Commands
        // driver.get("url") -> Navigate to a URL

        // Use navigation methods
        driver.navigate().to("https:amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.quit();
    }
}
