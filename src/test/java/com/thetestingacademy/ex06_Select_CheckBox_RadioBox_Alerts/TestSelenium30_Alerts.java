package com.thetestingacademy.ex06_Select_CheckBox_RadioBox_Alerts;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium30_Alerts extends CommonToAll {
    @Test
    public void testAlerts(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       // WebElement normalJSAlert=driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]"));
        WebElement jsConfirmAlert=driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
        WebElement jsPromptAlert=driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]"));

       // normalJSAlert.click();
       // jsConfirmAlert.click();
        jsPromptAlert.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        //alert.accept();
       // alert.dismiss();
        alert.sendKeys("Aditya");
        //alert.accept();
        alert.dismiss();

        String result=driver.findElement(By.id("result")).getText();
       // Assert.assertEquals(result,"You successfully clicked an alert");
        //Assert.assertEquals(result,"You clicked: Ok");
        //Assert.assertEquals(result,"You clicked: Cancel");
       // Assert.assertEquals(result, "You entered: Aditya");
        Assert.assertEquals(result,"You entered: null");

        closeBrowser(driver);

    }
}
