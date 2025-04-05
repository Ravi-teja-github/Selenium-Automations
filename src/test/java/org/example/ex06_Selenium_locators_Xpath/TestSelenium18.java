package org.example.ex06_Selenium_locators_Xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium18 {
    @Description("Click on Start a free trial link and verify invalid email id in app.vwo.com")
    @Test
    public void Start_free_trial_link() throws InterruptedException {

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        //WebElement start_free_link= driver.findElement(By.linkText("Start a free trial"));
        WebElement start_free_link= driver.findElement(By.partialLinkText("Start"));
        start_free_link.click();

        WebElement email= driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("raviteja");

        WebElement check_box= driver.findElement(By.name("gdpr_consent_checkbox"));
        check_box.click();

      List<WebElement> buttonList = driver.findElements(By.tagName("button"));
       buttonList.get(0).click();
        // another rule needs to avoid tagName, this not fix index value it may change

        //<div
        // class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
        // The email address you entered is incorrect.
        // </div>
        // we can use class which is unique

        WebElement error_invaild= driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_invaild.getText(),"The email address you entered is incorrect.");

        driver.close();


    }
}

