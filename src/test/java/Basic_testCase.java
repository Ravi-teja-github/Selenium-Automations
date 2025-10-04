import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic_testCase {
    ChromeDriver driver;

    @BeforeTest // it is annotation TestNG, it will execute before test case
    public void openBrowser() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--guset");
        driver = new ChromeDriver(chromeOptions);
    }


    @Description("Actions class Testing")
    @Test
    public void test_actions() throws InterruptedException {
        driver.manage().window().maximize();
        String url = "https://awesomeqa.com/practice.html";
        driver.get(url);
        Thread.sleep(3000);

        WebElement text_box= driver.findElement(By.xpath("(//input[contains(@style, '-webkit-appearance: ')])[1]"));
        String arrtname = text_box.getAttribute("Style");
        System.out.println("Attribute value: "+ arrtname);



}

    @AfterTest()
    public void closeBrowser()  {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
