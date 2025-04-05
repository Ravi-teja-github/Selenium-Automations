package org.example.ex05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium16 {
    @Description("Click on Start a free trial link in app.vwo.com")
    @Test
    public void Start_free_trial_link() throws InterruptedException {

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        //WebElement start_free_link= driver.findElement(By.linkText("Start a free trial"));
        WebElement start_free_link= driver.findElement(By.partialLinkText("Start"));
        start_free_link.click();

        driver.close();


    }
}

