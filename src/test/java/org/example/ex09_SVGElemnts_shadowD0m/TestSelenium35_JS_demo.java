package org.example.ex09_SVGElemnts_shadowD0m;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium35_JS_demo {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
    }


    @Description("click/send keys on shadowDom html code using javascript executor")
    @Test
    public void test_shadowDom() throws InterruptedException {
        driver.manage().window().maximize();
        String URL = "https://selectorshub.com/xpath-practice-page/";
        driver.get(URL);

//        documunet.querySelectorAll("login-username");- JS
//        WebElement pizza = driver.findElement(By.xpath("//input[@id='pizza']"));
//        pizza.sendKeys("farmhouse");

        JavascriptExecutor js= (JavascriptExecutor) driver;
        //js.executeScript("alert(1)");

        WebElement div_to_scroll= driver.findElement(By.xpath("//div[@id='userName']")); // until we this element scroll to view
        js.executeScript("arguments[0].scrollIntoView(true);", div_to_scroll);

        Thread.sleep(10000);

// explicit casting done below for webelement

        WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div\").shadowRoot.querySelector(\"input#pizza\");");
        inputboxPizza.sendKeys("PizzaHouse");


    }


    @AfterTest
    public void closeBrowser() {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        driver.quit();
    }
}
