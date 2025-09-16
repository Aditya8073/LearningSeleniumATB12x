package com.thetestingacademy.ex01_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    public void testCode(){
        Assert.assertEquals("Aditya", "aditya");
    }

    @Test
    public void test_OpenLoginPage(){

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        driver.quit();
    }
}
