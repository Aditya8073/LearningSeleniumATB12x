package com.thetestingacademy.ex03_Selenium_Locators;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium18_MiniProject02 extends CommonToAll {

    @Owner("Aditya Verma")
    @Description("Verify that the error message comes with invalid email on signup page")
    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 1)
    public void test_vwo_free_trial(){

        WebDriver driver = new FirefoxDriver();
        openBrowser(driver, "https://app.vwo.com");

       WebElement link_text = driver.findElement(By.linkText("Start a free trial"));
       link_text.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email=driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement checkbox=driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox.click();

        WebElement button=driver.findElement(By.tagName("button"));
        button.click();

        // <div  idx,namex, tagNAMEX,pt,lt-ax,
        // class="C(--color-red) Fz(--font-size-12) Trsp(--Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
        // The email address you entered is incorrect.
        //
        // </div>

        WebElement error_message=driver.findElement(By.className("invalid-reason"));
        System.out.println(error_message.getText());
        Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");

        closeBrowser(driver);

    }
}
