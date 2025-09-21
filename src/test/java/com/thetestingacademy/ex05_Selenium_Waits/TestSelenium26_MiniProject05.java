package com.thetestingacademy.ex05_Selenium_Waits;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium26_MiniProject05 extends CommonToAll {
    @Description("Verify makemytrip opens with modal")
    @Test
    public void testCloseModal(){
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());

        waitForVisibility(driver, 3, "//span[@data-cy=\"closeModal\"]" );

        WebElement closeModal=driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closeModal.click();

        closeBrowser(driver);

    }
}
