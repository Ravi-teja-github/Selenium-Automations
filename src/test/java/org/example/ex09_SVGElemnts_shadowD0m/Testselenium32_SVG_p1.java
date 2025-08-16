package org.example.ex09_SVGElemnts_shadowD0m;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class Testselenium32_SVG_p1 {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser()  {
//        ChromeDriver options=new ChromeDriver();
//        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        options.addArguments("--guest");
        driver = new ChromeDriver();
    }


    @Description("Verify that the after search, results are visible")
    @Test
    public void test_flipkart_search() {
        driver.manage().window().maximize();
        String URL = "https://www.flipkart.com/";
        driver.get(URL);

        // step number 1: Enter the macmini
        driver.findElement(By.name("q")).sendKeys("macmini");

        //step number 2: Click on search button
        List<WebElement> svgElements = driver.findElements(By.xpath("//*[name()='svg']"));
        svgElements.get(0).click();

        List<WebElement> titlesResults = driver.findElements(By.xpath("//div[contains(@data-id,'CPU')]/div/a[2]"));
        for (WebElement title : titlesResults) {
            System.out.println(title.getText());
        }


    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
        }


}
