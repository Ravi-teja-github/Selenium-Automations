package org.example.ex09_SVGElemnts_shadowD0m;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testselenium34_shadowDom_p1 {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
    }


    @Description("click/send keys on shadowDom html code using javascript executor")
    @Test
    public void test_shadowDom() {
        driver.manage().window().maximize();
        String URL = "https://selectorshub.com/xpath-practice-page/";
        driver.get(URL);

       // documunet.querySelectorAll("login-username");- JS
        WebElement pizza = driver.findElement(By.xpath("//input[@id='pizza']"));
        pizza.sendKeys("farmhouse");

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
