package org.example.ex11_Actions_Windows_Iframe;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class TestSelenium50_actionp5_relative_Locators3 {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();
    }


    @Description("Relative Locator with table")
    @Test
    public void test3_Relative_Locators() throws InterruptedException {
        driver.manage().window().maximize();
        String url= "https://codepen.io/AbdullahSajjad/full/LYGVRgK";
        driver.get(url);

        Thread.sleep(3000);

        driver.switchTo().frame("result");

        WebElement submit= driver.findElement(By.xpath("//button[text()='Submit']"));
        submit.click();


        WebElement user_text_box= driver.findElement(By.xpath("//input[@id='username']"));
        WebElement errorElement= driver.findElement(with(By.tagName("small")).below(user_text_box));

        String error_text= errorElement.getText();
        System.out.println(error_text);
        Assert.assertTrue(errorElement.isDisplayed());
        Assert.assertEquals(error_text, "Username must be at least 3 characters");



    }


    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }
}
