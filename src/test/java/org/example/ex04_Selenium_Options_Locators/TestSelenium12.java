package org.example.ex04_Selenium_Options_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium12 {
    @Description("Open the App.vwo.com and get the title")
    @Test
    public void test_selenium13()  {

       // EdgeOptions, ChromeOptions, FirefoxOptions, SafariOptions
        EdgeOptions edgeOptions=new EdgeOptions();

        // EdgeOptions -> it will help you set the browser
        // options to browser
        // window - size
        // headless mode-there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        //

      //edgeOptions.addArguments("--window-size=1280,720");
      //edgeOptions.addArguments("--start-maximized");
       edgeOptions.addArguments("--headless");


        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://www.flipkart.com/");
    }
}
