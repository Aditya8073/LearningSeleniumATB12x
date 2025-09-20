package com.thetestingacademy.ex03_Selenium_Locators;

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

public class TestSelenium16_Project_Locators {
   @Description("TC#1 - Verify that with invalid login, error message is displayed")
    @Owner("Aditya Verma")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_VWO_Invalid_Login(){

       WebDriver driver = new FirefoxDriver();
       driver.get("https://app.vwo.com");
       driver.manage().window().maximize();

       // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
       // Step 2 - Find the Password  and enter the 1234.
       // Step 3 - Find the Submit  and click on the button.
       // Step 4 - Wait some time.
       // Step 5 - Verify the message error message.


       // Step 1 - Find the EMAIL ID and enter the admin@admin.com.

       // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
       // <input open Tag
       // type="email"
       // class="text-input W(100%)"
       // name="username"
       // id="login-username"
       // data-qa="hocewoqisi"
       // data-gtm-form-interact-field-id="0"
       // > close Tag
       WebElement email_input_box =driver.findElement(By.id("login-username"));
       email_input_box.sendKeys("admin@admin.com");

       WebElement password_input_box=driver.findElement(By.name("password"));
       password_input_box.sendKeys("adfsgh");

       WebElement submit_button=driver.findElement(By.id("js-login-btn"));
       submit_button.click();

       try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }

       WebElement error_message=driver.findElement(By.className("notification-box-description"));
       System.out.println(error_message.getText());

       // Step 6, we have added the TestNG assertion to verify.
       Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");

       driver.quit();


   }
}
