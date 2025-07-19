package org.example.ex01.SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class TestSelenium02 {
    @Description("Open the App.vwo.com and get the title")
    @Test
    public void test_selenium02(){
        EdgeDriver de=new EdgeDriver();
        // new EdgeDriver(); -> POST Request (localhost:65329), create session Endpoint
        // This will Start Edge real browser
        de.get("https://www.flipkart.com/");
        System.out.println(de.getTitle());
        de.close();
    }
}
