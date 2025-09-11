package org.example.ex11_Actions_Windows_Iframe;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class TestSelenium43_actionp3_windowHandles {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
    }


    @Description("Window handle")
    @Test
    public void test2_actions_windows() throws InterruptedException {
        driver.manage().window().maximize();
        String  url= "https://the-internet.herokuapp.com/windows";
        driver.get(url);

        String parentWindow = driver.getWindowHandle();
       System.out.println("Parent Window Handle: "+ parentWindow);
        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandles= driver.getWindowHandles();
        System.out.println("Window Handles:"+ windowHandles);

        // switch to window

        for( String handle:windowHandles){
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test Case is Passed");
                break;

            }
        }


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