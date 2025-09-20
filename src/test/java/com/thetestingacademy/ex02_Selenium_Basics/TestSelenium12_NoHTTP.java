package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium12_NoHTTP {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
       // driver.get("bing.com");
        driver.get("https://bing.com"); // HTTPs is important.
        driver.quit();
    }
}
