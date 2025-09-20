package com.thetestingacademy.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium17_LinkText_PartialLinkText {

    @Description("Verify the link in vwo")
    @Test
    public void testVerifyLink() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");

        // <a
        // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link"
        // data-qa="bericafeqo">
        // Start a free trial
        //
        //</a>


        //      // Link Text - Full Text Match
//        WebElement link_text =driver.findElement(By.linkText("Start a free trial"));
//        link_text.click();
////        // If the element locator is invalid - no such element: Unable to locate element: {"method":"link text","selector":"Start a free trial"}

        Thread.sleep(5000);
        WebElement partial_link_text=driver.findElement(By.partialLinkText("trial"));
        partial_link_text.click();

        driver.quit();

    }
}
