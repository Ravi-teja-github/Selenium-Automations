package org.example.ex09_waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.ex09_waits.WaitHelpers.checkVisibilityByFluentWait;

public class TestSelenium28_FluentWait_usingUtilities {


    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void testVwoLoginNegative() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("password@321");

        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        // Fluent_wait condition
        //        FluentWait<WebDriver> wait =new FluentWait<>(driver)
        //                .withTimeout(Duration.ofSeconds(10))
        //                        .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
        //
        //        WebElement error_message = wait.until(new Function<WebDriver, WebElement>() {
        //            public WebElement apply(WebDriver driver) {
        //                return driver.findElement(By.className("notification-box-description"));
        //            }
        //        });

        // or

        WebElement error_message = checkVisibilityByFluentWait(driver,By.className("notification-box-description"));

        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        driver.quit();

    }
}
