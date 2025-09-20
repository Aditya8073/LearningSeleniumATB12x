package com.thetestingacademy.ex04_Selenium_XPATH;

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

public class TestSelenium19_MiniProject03 extends CommonToAll {

    @Description("Verify that the login is working")
    @Owner("Aditya Verma")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void test_OHRM_login() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        openBrowser(driver,"https://awesomeqa.com/hr/web/index.php/auth/login");
        Thread.sleep(3000);

        WebElement input_username=driver.findElement(By.xpath("//input[@name='username']"));
        WebElement input_password=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        WebElement button=driver.findElement(By.xpath("//button[text()=' Login ']"));
        //driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]"));
        input_username.sendKeys("admin");
        input_password.sendKeys("Hacker@4321");
        button.click();
        Thread.sleep(3000);

        WebElement text=driver.findElement(By.xpath("//span[text()='PIM']"));
        Assert.assertEquals(text.getText(),"PIM");

        closeBrowser(driver);
    }
}