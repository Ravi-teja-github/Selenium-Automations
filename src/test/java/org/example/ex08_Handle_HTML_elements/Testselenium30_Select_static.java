package org.example.ex08_Handle_HTML_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testselenium30_Select_static {
    public static void main(String[] args){

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getTitle());

        WebElement element_select= driver.findElement(By.id("dropdown"));
        Select select= new Select(element_select);
       // select.selectByVisibleText("Option 1");
        select.selectByIndex(2);



}

}
