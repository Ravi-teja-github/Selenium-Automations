package org.example.ex03.SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {
    @Description("Open the App.vwo.com and get the title")
    @Test
    public void test_selenium03(){

        // selenium 3
        // you need to set up the Driver (browser)
        // System.getProperty ("webDriver.gecko.driver","/path/geckdriver");

        // selenium 4
        // selenium Manager - utility - which can download the driver automatically
        // start and stop itself

       // EdgeDriver driver= new EdgeDriver();  // need to create instance
       // driver.get("url");





    }
}

