import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
       // driver.get("https://www.tcsion.com/hub/national-qualifier-test/");

        // driver.get("https://www.flipkart.com/");
       // driver.findElement(By.name("q")).sendKeys("Macmini");

        driver.get("https://www.amcharts.com/svg-maps/?map=india");

        driver.findElement(By.xpath("//button[contains(text(), 'understand ')]")).click();

        driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='g'][7]//*[local-name()='g']/*[local-name()='g'][1]/*[local-name()='path'][20]")).click();
        Thread.sleep(3000);

         driver.close();




    }
}
