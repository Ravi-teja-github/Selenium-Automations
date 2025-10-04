package org.example.ex11_Actions_Windows_Iframe_RelativeLocators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.*;


public class TestSelenium48_relative_Locatorsp1 {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();
    }


    @Description("Relative Locator")
    @Test
    public void test1_Relative_Locators() throws InterruptedException {
        // toRightOf element
        // toLeftOf element
        // AboveOf element
        // BelowOf element
        // NearOf element

        driver.manage().window().maximize();
        String url= "https://awesomeqa.com/practice.html";
        driver.get(url);

        WebElement span_element = driver.findElement(By.xpath("//span[normalize-space()='Years of Experience']"));
       driver.findElement(with(By.id("exp-6")).toRightOf(span_element)).click();
       Thread.sleep(5000);

        WebElement left_of = driver.findElement(By.xpath("//label[normalize-space()=' Female']"));
        driver.findElement(with(By.id("sex-1")).toLeftOf(left_of)).click();




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
