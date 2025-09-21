package com.thetestingacademy.ex04_Selenium_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium23_CssSelector {
    @Test
    public void test_cssSelector(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://awesomeqa.com/css/");
        driver.findElement(By.cssSelector("div[class=\"first\"]")); //  div[class="first"]
        List<WebElement> spans=driver.findElements(By.cssSelector("div[class=\"first\"] span")); //div[class="first"] span
        //For index based accessing in css selector
//        div[class="first"] span:nth-child(1)
//        div[class="first"] span:nth-child(2n+1) = For odd
        //        div[class="first"] span:nth-child(2n) = For even


    }
}
