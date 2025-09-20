package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestSelenium09_Assertions {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");

        // TestbNG
        Assert.assertEquals(driver.getTitle(), "Google");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
        //AssertJ validation
        assertThat(driver.getTitle()).isNotBlank().isNotNull().isEqualTo("Google");
        driver.quit();
    }
}
