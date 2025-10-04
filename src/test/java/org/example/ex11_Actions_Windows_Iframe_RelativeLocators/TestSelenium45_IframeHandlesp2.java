package org.example.ex11_Actions_Windows_Iframe_RelativeLocators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium45_IframeHandlesp2 {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();
    }


    @Description("Scroll down")
    @Test
    public void test3_actionsIframe_windows() throws InterruptedException {
        driver.manage().window().maximize();
        String url= "https://www.makemytrip.com/";
        driver.get(url);

        Thread.sleep(5000);


        driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();
        driver.findElement(By.xpath("//span[@data-cy=\"travel-card-close\"]")).click();

        Thread.sleep(5000);

        Actions actions= new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
        System.out.println("Scroll Down");




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
