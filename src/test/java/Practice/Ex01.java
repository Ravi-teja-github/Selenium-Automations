package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://example.com");

        // Get element with tag name 'div'
        WebElement element = driver.findElement(By.tagName("div"));

        // Get all the elements available with tag name 'p'
        List<WebElement> elements = element.findElements(By.tagName("p"));
        for (WebElement e : elements) {
            System.out.println(e.getText());
        }

    }
}
