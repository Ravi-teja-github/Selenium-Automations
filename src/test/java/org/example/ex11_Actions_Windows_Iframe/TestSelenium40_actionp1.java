package org.example.ex11_Actions_Windows_Iframe;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium40_actionp1 {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
    }


    @Description("Verify actions by click on shift key")
    @Test
    public void test1_actions() {
        driver.manage().window().maximize();
        String  url= "https://awesomeqa.com/practice.html";
        driver.get(url);

        WebElement firstname= driver.findElement(By.name("firstname"));
        // Keyboards - > keyDown -> Shift -> send key -> key Up

        Actions actions= new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(firstname, "ravi teja k")
                .keyUp(Keys.SHIFT).build().perform();

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
