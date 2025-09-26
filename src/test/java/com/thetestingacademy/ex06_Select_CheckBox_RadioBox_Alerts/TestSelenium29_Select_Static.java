package com.thetestingacademy.ex06_Select_CheckBox_RadioBox_Alerts;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSelenium29_Select_Static extends CommonToAll {

    @Test
    public void testSelectStatic(){
        WebDriver driver = new FirefoxDriver();
        openBrowser(driver, "https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getTitle());

        WebElement select_dropdown=driver.findElement(By.id("dropdown"));
        Select select = new Select(select_dropdown);
        //select.selectByIndex(1);
        //select.selectByVisibleText("Option 2");
        select.selectByValue("1");

        closeBrowser(driver);
    }
}
