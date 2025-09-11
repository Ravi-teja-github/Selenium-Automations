package org.example.ex11_Actions_Windows_Iframe;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium41_actionp2 {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
    }


    @Description("Verify actions")
    @Test
    public void test2_actions() throws InterruptedException {
        driver.manage().window().maximize();
        String  url= "https://www.spicejet.com/";
        driver.get(url);


        WebElement source=driver.findElement(By.xpath("(//input[@data-focusable=\"true\"])[1]"));
        Actions actions= new Actions(driver);
        //actions.sendKeys(source,"BLR").build().perform();
        actions.moveToElement(source).click().sendKeys("BLR").build().perform(); // this is the pretty safe method


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
