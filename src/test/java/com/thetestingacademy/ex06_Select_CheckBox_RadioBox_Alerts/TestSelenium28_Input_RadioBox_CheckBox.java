package com.thetestingacademy.ex06_Select_CheckBox_RadioBox_Alerts;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium28_Input_RadioBox_CheckBox extends CommonToAll {

    @Description("Example of Input, checkbox and radiobox elements")
    @Test
    public void testInputRadioBoxCheckBox(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");
        WebElement firstname=driver.findElement(By.cssSelector("input[name=\"firstname\"]"));
        firstname.sendKeys("Aditya");

        WebElement radiobox=driver.findElement(By.xpath("//input[@id=\"sex-0\"]"));
        radiobox.click();

        WebElement checkbox=driver.findElement(By.id("tool-2"));
        checkbox.click();

        closeBrowser(driver);

    }
}
