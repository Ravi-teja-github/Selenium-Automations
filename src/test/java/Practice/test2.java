package Practice;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class test2 {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();
    }


    @Description("Relative Locator with table")
    @Test
    public void test3_actionsIframe_windows() throws InterruptedException {
        driver.manage().window().maximize();
        String url= "https://www.aqi.in/real-time-most-polluted-city-ranking";
        driver.get(url);

        WebElement search_element = driver.findElement(By.xpath("(//input[@type='search'])[2]"));
        search_element.sendKeys("india"+ Keys.ENTER);

        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[contains(@class, 'close-button ')]")).click();


        Actions actions= new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();

        //div[contains(@class,'content grow')]
        //div[contains(@class,'content grow')]/div/a[1]/div[1]
        List<WebElement> list_of_states= driver.findElements(By.xpath("//div[contains(@class,'content grow')]/div/a/div[1]"));
        for (WebElement l: list_of_states){
            //System.out.println(l.getText());
            String s1= driver.findElement(with(By.tagName("p")).toRightOf(l)).getText();
            String s2= driver.findElement(with(By.tagName("p")).toLeftOf(l)).getText();
            String s3= driver.findElement(with(By.tagName("p")).below(l)).getText();
            String s4= driver.findElement(with(By.tagName("p")).above(l)).getText();
            System.out.println(l.getText()+" | "+s1+ " | "+ s2);
            System.out.println(l.getText()+" | "+s3+ " | "+ s4);
        }


    }

}
