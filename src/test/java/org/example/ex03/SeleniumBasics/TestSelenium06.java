package org.example.ex03.SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium06 {
    @Description("Open the App.vwo.com and get the title")
    @Test
    public void test_selenium06(){

// If you are using selenium 3.14

        // System.setProperty("webdriver.edge.driver", "path/to/msedgedriver.exe");
//        // Firefox
//        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
//        // Chrome
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
//        // IE
//        System.setProperty("webdriver.ie.driver", "path/to/IEDriverServer.exe");
//        // Safari
//        System.setProperty("webdriver.safari.driver", "path/to/safaridriver");


// Selenium 4.x - Selenium Manager - will automatically download the Drivers all
        // when needed when you start the Selenium server.



    }
}

