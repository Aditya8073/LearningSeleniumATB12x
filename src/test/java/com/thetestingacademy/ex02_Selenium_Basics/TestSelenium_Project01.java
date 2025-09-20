package com.thetestingacademy.ex02_Selenium_Basics;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_Project01 extends CommonToAll {

    @Description("TC#1- Verify that a particular text exists on Katalon website")
    @Owner("Aditya Verma")
    @Test
    public void test_verify_text(){
        // Open the URL
        // Get the source code
        // Verify the source Code

        WebDriver driver = new FirefoxDriver();
        openBrowser(driver, "https://katalon-demo-cura.herokuapp.com");

        if (driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Test case passed!!!");
            Assert.assertTrue(true);
        }
        else {
            System.out.println("Test Case failed!!!");
            Assert.assertFalse(false);
        }
        closeBrowser(driver);
    }
}
