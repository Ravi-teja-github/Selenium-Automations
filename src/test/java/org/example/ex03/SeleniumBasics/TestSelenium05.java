package org.example.ex03.SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium05 {
    @Description("Open the App.vwo.com and get the title")
    @Test
    public void test_selenium05(){
        // we will use Scenario 2-> 97%
        // We want to run on chrome then Change to edge
        // WebDriver driver = new ChromeDriver(); or
        // WebDriver driver = new EdgeDriver();

        WebDriver driver=new EdgeDriver();
        // new EdgeDriver(); -> POST Request (localhost:65329), create session Endpoint
        // This will Start Edge real browser
        driver.get("https://www.flipkart.com/");


    }
}

