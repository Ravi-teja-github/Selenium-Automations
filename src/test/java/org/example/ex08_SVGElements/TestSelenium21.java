package org.example.ex08_SVGElements;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium21 {
    @Description("Dynamic Web Table")
    @Test
    public void Print_the_Web_Table_details() throws InterruptedException {

WebDriver driver= new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://awesomeqa.com/webtable1.html");

// Fine the xpath for the Webtable
        // -> //table[@summary="Sample Table"]/tbody

        WebElement table= driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));

        //row
        List<WebElement> rows_table= table.findElements(By.tagName("tr"));

        for (int i=0;i<rows_table.size();i++){
           // col
           List<WebElement> col = rows_table.get(i).findElements(By.tagName("td"));
           for (WebElement c:col){
               System.out.println(c.getText());

           }

        }

    }
}

