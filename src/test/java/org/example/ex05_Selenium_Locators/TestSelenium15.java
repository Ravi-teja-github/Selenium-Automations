package org.example.ex05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium15 {
    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_VWO_login() throws InterruptedException {

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        // Step1: Find the email input box and enter the email

// <input --> open tag
// type="email"
// class="text-input W(100%)"
// name="username"
// id="login-username"
// data-qa="hocewoqisi"
// data-gtm-form-interact-field-id="0"
// > --> close tag

        // in that id="login-username"
        WebElement emailInputBox= driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        // step2: Find the password box and enter the email

        WebElement passwordInputBox= driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("123456789");

        //  step3: click on submit button

        WebElement buttonSubmit= driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        Thread.sleep(3000);

        //step4: Find the invalid error message and verify
        WebElement error_Message= driver.findElement(By.id("js-notification-box-msg"));
        Assert.assertEquals(error_Message.getText(),"Your email, password, IP address or location did not match");

        driver.close();


    }
}

