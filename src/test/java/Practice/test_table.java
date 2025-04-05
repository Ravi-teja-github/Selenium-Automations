package Practice;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class test_table {

    @Description("Web Table test" )
    @Test
    public void web_table_test() throws InterruptedException {

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        Thread.sleep(3000);
        WebElement table= driver.findElement(By.xpath("//div[@role=\"table\"]/div[2]"));

        //row
        List<WebElement> rows_table= table.findElements(By.tagName("div"));

        for (int i=0;i<rows_table.size();i++){
            // col
            List<WebElement> col = rows_table.get(i).findElements(By.xpath("//div[@role='cell']"));
            for (WebElement c:col){
                System.out.println(c.getText());

            }

        }


    }
}
