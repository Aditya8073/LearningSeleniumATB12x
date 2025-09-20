package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class TestSelenium14_Options {
    public static void main(String[] args) {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        // FirefoxOptions, ChromeOptions, SafariOptions

        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?
//        firefoxOptions.addArguments("--window-size=800,600");
//        firefoxOptions.addArguments("--start-maximized");
//        firefoxOptions.addArguments("--headless");
        firefoxOptions.addArguments("--incognito");

        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
       // driver.quit();
    }


}
