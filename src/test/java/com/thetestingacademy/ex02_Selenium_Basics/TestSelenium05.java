package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium05 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        driver.close();
    }
}
