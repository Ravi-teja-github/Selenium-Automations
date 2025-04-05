package org.example.ex04_Selenium_Options_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium13_Add_exetension {
    @Description("Open the App.vwo.com and get the title")
    @Test
    public void test_selenium13()  {

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--window-size=1280,720");
        edgeOptions.addExtensions(new File("src/test/java/org/example/ex04_Selenium_Options_Locators/AdBlock-block-CRK.crx"));


       // Proxy proxy=new Proxy();
       // proxy.setHttpProxy("188.255.245.205:1080");
       // edgeOptions.setCapability("proxy", proxy);

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://youtube.com/");
    }
}
