package org.example.ex07_waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.ex07_waits.WaitHelpers.checkVisibilityOfAndTextToBePresentInElement;

public class TestSelenium27_ExplicitWait_usingUtilities {
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


        WebElement error_message = driver.findElement(By.className("notification-box-description"));

//        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));
//        wait.until(ExceptionConditions.visibilityOf(error_message));
//        wait.until(ExceptionConditions.textToBePresentInElement(error_message, "Your email, password, IP address or location did not match"));
//         or

        checkVisibilityOfAndTextToBePresentInElement(driver, error_message);

        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        driver.quit();


    }
}
