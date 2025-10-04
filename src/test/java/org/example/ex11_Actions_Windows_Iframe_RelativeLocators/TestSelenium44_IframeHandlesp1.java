package org.example.ex11_Actions_Windows_Iframe_RelativeLocators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class TestSelenium44_IframeHandlesp1 {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();
    }


    @Description("Iframe handle")
    @Test
    public void test3_actionsIframe_windows() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(5000);

        String mainWindowHandle= driver.getWindowHandle();
        System.out.println("Parent:"+ mainWindowHandle);
        System.out.println("Main window Title"+ driver.getTitle());

        driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();
        driver.findElement(By.xpath("//span[@data-cy=\"travel-card-close\"]")).click();

        WebElement webelement1=driver.findElement(By.xpath("//div[@data-cy=\"suUrl-0\"]"));

        Actions actions= new Actions(driver);
        //actions.scrollToElement(list).build().perform();
        actions.moveToElement(webelement1).click().build().perform();

       // List<WebElement> list= driver.findElements(By.xpath("//span[@class=\"primaryBtn\"]"));
       // List<WebElement> list= driver.findElements(By.xpath("[class=\"primaryBtn outlineBtn\"] "));
        // actions.moveToElement(list.get(1)).click().build().perform();
        // need to check

        Thread.sleep(5000);

        Set<String> allHandles= driver.getWindowHandles();
        System.out.println("all window Handles: "+ allHandles);

        for (String handle: allHandles) {
            if (!handle.equals(mainWindowHandle)){
                driver.switchTo().window(handle);
                System.out.println("Child Window Title: "+ driver.getTitle());
               WebElement ExploreStays= driver.findElement(By.xpath("(//span[@class=\"primaryBtn outlineBtn\"])[1]"));
               actions.moveToElement(ExploreStays).click().build().perform();

            }
        }

        driver.switchTo().window(mainWindowHandle);


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
