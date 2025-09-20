package com.thetestingacademy.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium15_MiniProject_AdBlock {

    @Description("Options class")
    @Test
    public void testSeleniumProject(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");
        File path=new File("com/thetestingacademy/ex02_Selenium_Basics/AdBlock.crx");
        chromeOptions.addExtensions(path);

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.youtube.com/@TheTestingAcademy");
    }
}
