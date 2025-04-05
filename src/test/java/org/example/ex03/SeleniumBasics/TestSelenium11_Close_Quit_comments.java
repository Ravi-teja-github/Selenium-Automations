package org.example.ex03.SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium11_Close_Quit_comments {
    @Description("Open the App.vwo.com and get the title")
    @Test
    public void test_selenium11() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);

        // Close - will close the current tab, not the session,
        //  Session id != null
       //driver.close();

        // it will close all the tabs.- session id ==null
        driver.quit();

    }
}
