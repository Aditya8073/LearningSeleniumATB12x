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

import java.util.List;

public class TestSelenium20_MiniProject04 extends CommonToAll {

    @Owner("Aditya Verma")
    @Description("Verify that wth valid username and password, make appointment page is loading")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void test_katalon_login() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com/");
       WebElement make_appointment_button= driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]"));// //a[@id="btn-make-appointment" and text()="Make Appointment"]
       make_appointment_button.click();

        List<WebElement> input_username=driver.findElements(By.xpath("//input[@placeholder=\"Username\"]"));
        input_username.get(1).sendKeys("John Doe");
        //For index based access in xpath
        //div[@class="first"]/span[1]

        List<WebElement> input_password=driver.findElements(By.xpath("//input[@placeholder=\"Password\"]"));
        input_password.get(1).sendKeys("ThisIsNotAPassword");

       WebElement login_button=driver.findElement(By.xpath("//button[text()=\"Login\"]"));
       login_button.click();

       Thread.sleep(3000);
       Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

       WebElement h2=driver.findElement(By.xpath("//h2[text()=\"Make Appointment\"]"));
        Assert.assertEquals(h2.getText(),"Make Appointment");
        Assert.assertTrue(h2.isDisplayed());

        closeBrowser(driver);
    }
}
