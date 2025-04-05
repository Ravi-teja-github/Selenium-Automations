package org.example.ex03.SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium07_Get_comments {
    @Description("Open the App.vwo.com and get the title")
    @Test
    public void test_selenium07(){

        WebDriver driver=new EdgeDriver();
        driver.get("https://google.com/");
        // When we run this, it will open chrome and load the url
        // it will not close
        // Important Commands
        //1. getTitle() - titles
        //2. getCurrentURL() - current url page
        //3. getPageSource - source code(html) - text / html

        System.out.println(driver.getTitle()); // it will print the title of the url
        System.out.println(driver.getCurrentUrl()); // it will print the current url
        System.out.println(driver.getPageSource()); // it will print HTML source code of the page

        driver.manage().window().maximize(); // Used to maximize
        driver.manage().window().maximize(); // Used to minimize



    }
}

