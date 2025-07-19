package Practice;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Pro1 {
    @Description("Flipkart")
    @Test
    public void Flipkart() throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
       // Thread.sleep(5000);
        driver.findElement(By.xpath("(//img[@loading='eager']/ancestor::picture)[2]")).click();

        driver.findElement(By.id("")).findElements(By.xpath(""));

        ////*[@id="product-0"]/div/div/div/a/div/img

    }
}
