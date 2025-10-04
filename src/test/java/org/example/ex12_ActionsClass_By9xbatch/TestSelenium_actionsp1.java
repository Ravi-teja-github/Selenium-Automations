package org.example.ex12_ActionsClass_By9xbatch;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium_actionsp1 {
    ChromeDriver driver;

    @BeforeTest // it is annotation TestNG, it will execute before test case
    public void openBrowser(){
        ChromeOptions chromeOptions= new ChromeOptions();
        chromeOptions.addArguments("--guset");
        driver = new ChromeDriver(chromeOptions);
    }


    @Description("Actions class Testing")
    @Test
    public void test_actions() throws InterruptedException {
        driver.manage().window().maximize();
        String url="https://awesomeqa.com/practice.html";
        driver.get(url);
        Thread.sleep(3000);

        WebElement firstname= driver.findElement(By.name("firstname"));

        Actions actions= new Actions(driver);
        actions
                .keyDown(Keys.SHIFT)
                .sendKeys(firstname, "the testing academy")
                .keyUp(Keys.SHIFT)
                .build()
                .perform();


    }


    @AfterTest()
    public void closeBrowser()  {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
