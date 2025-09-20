package com.thetestingacademy;

import org.openqa.selenium.WebDriver;

public class CommonToAll {

    public void openBrowser(WebDriver driver, String url){
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void closeBrowser(WebDriver driver){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
