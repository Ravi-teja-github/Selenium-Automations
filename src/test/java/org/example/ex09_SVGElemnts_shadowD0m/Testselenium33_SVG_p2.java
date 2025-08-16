package org.example.ex09_SVGElemnts_shadowD0m;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Testselenium33_SVG_p2
{
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser()
    {
//        ChromeDriver options=new ChromeDriver();
//        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        options.addArguments("--guest");
        driver = new ChromeDriver();
    }


    @Description("Verify that the tripura is in india and click on it")
    @Test
    public void test_svg_india_search_click()
    {
        driver.manage().window().maximize();
        String URL = "https://www.amcharts.com/svg-maps/?map=india";
        driver.get(URL);

        driver.findElement(By.xpath("//button[contains(text(), 'understand ')]")).click();

        List<WebElement> states = driver.findElements(By.xpath("//*[local-name()='svg']//*[local-name()='g'][7]//*[local-name()='g']/*[local-name()='g'][1]/*[local-name()='path']"));
        for (WebElement state : states) {
            System.out.println(state.getAttribute("aria-label"));
            if (state.getAttribute("aria-label").contains("Karnataka")) {
                state.click();
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
