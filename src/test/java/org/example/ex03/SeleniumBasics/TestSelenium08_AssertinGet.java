package org.example.ex03.SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium08_AssertinGet {
    @Description("Open the App.vwo.com and get the title")
    @Test
    public void test_selenium08(){

        WebDriver driver=new EdgeDriver();
        driver.get("https://google.com/");

        Assert.assertEquals(driver.getTitle(), "Google");

        

    }
}

