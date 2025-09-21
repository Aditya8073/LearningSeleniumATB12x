package com.thetestingacademy.ex05_Selenium_Waits;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.function.Function;

public class TestSelenium_FluentWait extends CommonToAll {
    public static void main(String[] args) throws InterruptedException {

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--incognito");
        firefoxOptions.addArguments("--start-maximized");

        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.navigate().to("https://app.vwo.com");
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        // 1. Find the email inputbox and enter the email
        WebElement email_input =driver.findElement(By.xpath("//input[@id=\"login-username\"]"));
        email_input.sendKeys("admin@admin.com");

        WebElement password_input=driver.findElement(By.xpath("//input[@id=\"login-password\"]"));
        password_input.sendKeys("password@321");

        WebElement signInButton=driver.findElement(By.id("js-login-btn"));
        signInButton.click();

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

        WebElement error_message=wait.until(new Function<WebDriver, WebElement>(){
            @Override
            public WebElement apply(WebDriver driver){
                return driver.findElement((By.className("notification-box-description")));
            }
        });

        //waitFluentVisibility(driver,10,5,"//div[@id=\"js-notification-box-msg\"]");

        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");
        driver.quit();
    }
}
