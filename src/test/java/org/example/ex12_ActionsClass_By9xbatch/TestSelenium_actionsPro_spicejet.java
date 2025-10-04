package org.example.ex12_ActionsClass_By9xbatch;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium_actionsPro_spicejet {
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
        String url="https://www.spicejet.com/";
        driver.get(url);
        Thread.sleep(5000);

        WebElement Fromname= driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[1]"));
        WebElement Toname= driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[2]"));
        WebElement svge1= driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/div/*[name()='svg'])[1]"));
        WebElement svge2= driver.findElement(By.xpath("(//div[@data-testid='undefined-calendar-picker']/div/*[name()='svg'])[1]/*[name()='g']"));
       // WebElement svge2= driver.findElement(By.xpath("(//div[@data-testid=\"undefined-calendar-picker\"]/div/*[name()='svg'])[1]"));
      //  WebElement svge3= driver.findElement(By.xpath("(//div[@data-testid=\"undefined-calendar-picker\"]/div/*[name()='svg'])[2]"));


        Actions actions= new Actions(driver);
        Action blr = actions.moveToElement(Fromname).click().sendKeys("BLR").build();
        blr.perform();
        Thread.sleep(3000);

        Action dle = actions.moveToElement(Toname).click().sendKeys("DLE").build();
        dle.perform();
        Thread.sleep(3000);

        Action svg1= actions.moveToElement(svge1).click().build();
        svg1.perform();
        Thread.sleep(3000);

        actions.moveToElement(svge2).click().build().perform();



    }


//    @AfterTest()
//    public void closeBrowser()  {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.quit();
//    }

}
