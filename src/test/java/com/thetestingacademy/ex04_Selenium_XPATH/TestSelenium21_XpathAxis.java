package com.thetestingacademy.ex04_Selenium_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium21_XpathAxis {
    @Test
    public void test_xpathAxis(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/xpath/");
        WebElement mammal=driver.findElement(By.xpath("//div[@class='Mammal']"));
        WebElement following_Sibling_other=driver.findElement(By.xpath("//div[@class='Mammal']/following-sibling::div"));
        WebElement preceding_sibling_fish=driver.findElement(By.xpath("//div[@class='Mammal']/preceding-sibling::div"));
        WebElement parent_vertebrate=driver.findElement(By.xpath("//div[@class='Mammal']/parent::div"));
        List<WebElement> child_herbivore_carnivore=driver.findElements(By.xpath("//div[@class=\"Mammal\"]/child::div"));
        List<WebElement> ancestor_animal_vertebrate=driver.findElements(By.xpath("//div[@class=\"Mammal\"]/ancestor::div"));
        List<WebElement> descendant_herbivore_carnivore_lion_tiger=driver.findElements(By.xpath("//div[@class=\"Mammal\"]/descendant::div"));
        driver.quit();
    }
}
