package org.example.ex11_Actions_Windows_Iframe_RelativeLocators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium46_upload {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();
    }


    @Description("upload file")
    @Test
    public void test3_actionsIframe_windows() throws InterruptedException {
        driver.manage().window().maximize();
        String url= "https://awesomeqa.com/selenium/upload.html";
        driver.get(url);
        Thread.sleep(5000);

        WebElement uploadFile= driver.findElement(By.id("fileToUpload"));

        String dir = System.getProperty("user.dir");
        System.out.println(dir);
        //C:\Users\aipl1\IdeaProjects\Selenium-Automations/src/test/java/org/example/ex11_Actions_Windows_Iframe/Hello.txt
        uploadFile.sendKeys(dir+"/src/test/java/org/example/ex11_Actions_Windows_Iframe/Hello.txt");
        driver.findElement(By.name("submit")).click();


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
