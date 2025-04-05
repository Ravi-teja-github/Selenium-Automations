package org.example.ex04_Selenium_Options_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium14_Youtube {
    @Description("Open the App.vwo.com and get the title")
    @Test
    public void test_selenium13()  {

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
       // edgeOptions.addExtensions(new File("src/test/java/org/example/ex04_Selenium_Options_Locators/AdBlock-block-CRK.crx"));

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
        driver.get("https://youtube.com/");
        driver.findElement(By.name("search_query")).sendKeys("pramod testing academy");
        driver.findElement(By.xpath("(//button[@title='Search'])[1]")).click();
        driver.close();
    }
}
