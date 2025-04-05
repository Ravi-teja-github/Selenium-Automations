package org.example.ex03.SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestSelenium04 {
    @Description("Open the App.vwo.com and get the title")
    @Test
    public void test_selenium04(){

        // WebDriver hierarchy

        // SearchContext(I) (2) -> WebDriver(I)(10) -> RemoteWebDriver(C) (15)
        // -> ChromiumDriver(C) 25 -> EdgeDriver(C) (45)

        // SearchContext(I)
        // -> WebDriver(I)
        // -> RemoteWebDriver(C)
        // -> ChromiumDriver(C)
        // -> ChromeDriver(C)

        // SearchContext -> Interface - findElement and findElements -GGF
        // WebDriver -> Interface - some incomplete functions (abstract methods, nested interface) -GF
        // RemoteWebDriver -> Class - it also has some functions - F
        // ChromeDriver, EdgeDriver, FirefoxDriver, SafariDriver, InternetExplorerDriver -> Class

       // SearchContext driver = new ChromeDriver(); //-> it is possible (child with GGF)
      //  WebDriver driver = new ChromeDriver(); //-> it is possible (child with GF)
      //  RemoteWebDriver driver = new ChromeDriver(); //-> it is possible (child with F)
       // ChromeDriver driver = new ChromeDriver(); //-> it is possible (child itself)
        // above all 4 are possible, but in that which need to use and when

        // Scenario 1
        // we want to run chrome or edge?
        // ChromeDriver driver = new ChromeDriver(); or EdgeDriver driver= new EdgeDriver(); -1%

        // Scenario 2
        // We want to run on chrome then Change to edge
        // WebDriver driver = new ChromeDriver(); or  -97%
        // WebDriver driver = new EdgeDriver(); -97%

        // Scenario 3
        // We want to run on multiple browsers and parallel, aws machine, docker container .etc.
        // RemoteWebDriver driver (with GRID) = Advance (Last 2 sessions) - 2%









    }
}

