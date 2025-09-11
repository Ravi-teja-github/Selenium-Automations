package org.example.ex11_Actions_Windows_Iframe;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium42_actionp3_method2 {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
    }

    @Description("Verify actions")
    @Test
    public void test2_actions() throws InterruptedException {
        driver.manage().window().maximize();
        String  url= "https://www.makemytrip.com/";
        driver.get(url);

        // wait to popup come to  click in x icon
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
        //wait until the element is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));
        driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();

        // closing second popup
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"travel-card-close\"]")));
        driver.findElement(By.xpath("//span[@data-cy=\"travel-card-close\"]")).click();


        WebElement fromCity= driver.findElement(By.id("fromCity"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions=  new Actions(driver);
        actions.moveToElement(fromCity).click().perform();

        List<WebElement> list_of_cities = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (WebElement e: list_of_cities){

            System.out.println(e.getText());

            if (e.getText().contains("Bengaluru, India")){
                e.click();
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
