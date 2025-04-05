package org.example.ex01.SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {
    public static void main(String[] args) {

    }
    @Description("Open the App.vwo.com and get the title")
    @Test
    public void test_selenium01(){
        // open a url
        // print the title
        WebDriver dc=new ChromeDriver();
       // WebDriver de=new EdgeDriver();
      //  WebDriver df=new FirefoxDriver();
       // WebDriver ds=new SafariDriver();
      //  FirefoxDriver driver = new FirefoxDriver();
        dc.get("https://app.vwo.com");
        System.out.println(dc.getTitle());
    }

}
