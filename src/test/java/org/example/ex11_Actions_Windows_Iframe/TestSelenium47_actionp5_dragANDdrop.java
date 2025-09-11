package org.example.ex11_Actions_Windows_Iframe;

import com.beust.ah.A;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium47_actionp5_dragANDdrop {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();
    }


    @Description("Drag and drop")
    @Test
    public void test3_actionsIframe_windows() throws InterruptedException {
        driver.manage().window().maximize();
        String url= "https://the-internet.herokuapp.com/drag_and_drop";
        driver.get(url);


        Actions actions= new Actions(driver);

        WebElement from= driver.findElement(By.id("column-a"));
        WebElement to= driver.findElement(By.id("column-b"));

        //actions.dragAndDrop(from, to).build().perform();

        actions.clickAndHold().moveToElement(to).release(to).build().perform();

        Thread.sleep(5000);


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
