package org.example.ex10_Webtable;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium37 {
    @Description("Web Table")
    @Test
    public void Print_the_Web_Table_details() throws InterruptedException {

WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://awesomeqa.com/webtable.html");

// xpath -> //table[@id="customers"]/tbody/tr[2]/td[1]


        //xpath - //table[@id="customers"]/tbody/tr[
        // i
        // ]/td[
        // j
        // ]

        String first_part= "//table[@id=\"customers\"]/tbody/tr[";
        String second_part= "]/td[";
        String third_part= "]";

        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        System.out.println(row);
        System.out.println(col);

        for (int i=2;i<=row;i++){
            //System.out.println("____________");
            for (int j=1;j<=col;j++){
                String dynamic_path= first_part+i+second_part+j+third_part;
               // System.out.println(dynamic_path);
                String data= driver.findElement(By.xpath(dynamic_path)).getText();
              //  System.out.println(data);
                if (data.contains("Helen Bennett")){
                    String country_path= dynamic_path+"/following-sibling::td";
                    String country_text= driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("----");
                    System.out.println("Helen Bennett is in - "+ country_text);
                }


            }
        }


    }
}

