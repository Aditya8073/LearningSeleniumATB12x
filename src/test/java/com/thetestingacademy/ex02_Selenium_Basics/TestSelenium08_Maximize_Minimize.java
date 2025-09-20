package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium08_Maximize_Minimize   {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().minimize();
       try {
           Thread.sleep(3000);
       }
       catch (InterruptedException e){
           System.out.println("InterruptedException");
       }

       driver.manage().window().maximize();
       driver.quit();
    }
}
