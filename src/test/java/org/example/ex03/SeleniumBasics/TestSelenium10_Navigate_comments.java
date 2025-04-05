package org.example.ex03.SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium10_Navigate_comments {
    @Description("Open the App.vwo.com and get the title")
    @Test
    public void test_selenium10() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.flipkart.com/");

        Thread.sleep(3000);

        // Use navigation methods
        driver.navigate().to("https://bing.com");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        // http is important

    }
}
