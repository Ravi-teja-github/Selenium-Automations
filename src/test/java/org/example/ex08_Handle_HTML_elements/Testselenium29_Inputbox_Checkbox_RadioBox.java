package org.example.ex08_Handle_HTML_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testselenium29_Inputbox_Checkbox_RadioBox {
    public static void main(String[] args){

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("Https://awesomeqa.com/practice.html");

        // text box
        driver.findElement(By.name("firstname")).sendKeys("The testing");

        // radio box/button
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("exp-6")).click();

        // check box
        driver.findElement(By.id("profession-1")).click();





    }
}
