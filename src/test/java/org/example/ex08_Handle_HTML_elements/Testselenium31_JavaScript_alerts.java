package org.example.ex08_Handle_HTML_elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Testselenium31_JavaScript_alerts {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());

        // -1. This for only when we get ok-

        // WebElement element_jsAlert= driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        // element_jsAlert.click();

         // -now we need to alert class-
         //Alert alert=driver.switchTo().alert();
         // alert.accept();

         //String result = driver.findElement(By.id("result")).getText();
         // Assert.assertEquals(result, "You successfully clicked an alert");


        // -2. this alert when we get both ok and cancel-

        //WebElement element_jsConfirm= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
       // element_jsConfirm.click();

       // Alert alert=driver.switchTo().alert();
       // alert.accept();
       // alert.dismiss();

       // String result = driver.findElement(By.id("result")).getText();
       // Assert.assertEquals(result, "You clicked: Ok"); // this is for ok
       // Assert.assertEquals(result, "You clicked: Cancel");


        // -3. this alert when we need enter details in text box-

        WebElement element_jsPrompt= driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        element_jsPrompt.click();

        //Thread.sleep(3000);

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert=driver.switchTo().alert();
        alert.sendKeys("RaviTeja");
        alert.accept();

        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result, "You entered: RaviTeja");

        driver.quit();

    }
}
