package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium10_ChangeDriver {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver = new EdgeDriver();
    }
}
