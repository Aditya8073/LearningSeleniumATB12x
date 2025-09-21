package com.thetestingacademy.ex04_Selenium_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium22_CssSelector {
    @Test
    public void test_css_selectors(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://katalon-demo-cura.herokuapp.com/");
        WebElement make_appointment_button =driver.findElement(By.cssSelector("a[id='btn-make-appointment']")); //tagname[attribute='value']
        make_appointment_button.click();
        driver.findElement(By.cssSelector("a#btn-make-appointment"));//tagname#id
//        driver.findElement(By.cssSelector("#btn-make-appointment"));//#id
//        driver.findElement(By.cssSelector("a[id*='make']")); //*=contains
//        driver.findElements(By.cssSelector("a[id^='btn']")); //^=starts-with
//        driver.findElement(By.cssSelector("a[id$='appointment']")); //$=ends-with
        //tagname.classname
        driver.quit();
    }
}
