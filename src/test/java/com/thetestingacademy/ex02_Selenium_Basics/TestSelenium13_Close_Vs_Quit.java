package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium13_Close_Vs_Quit {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //driver.close();
        // Close - will close the current tab, not the session (not the all tabs)
        // session id != null

        driver.quit();
        // It will close all the tabs. - session id == null

    }
}
