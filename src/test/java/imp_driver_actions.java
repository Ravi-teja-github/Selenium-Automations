import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.lang.reflect.Array;

public class imp_driver_actions {
    @Test()
    public void basic() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.close();

        //.finElement() or .finElements()
//        driver.findElement(By.id(""));
//        driver.findElement(By.name(""));
//        driver.findElement(By.tagName(""));
//        driver.findElement(By.className(""));
//        driver.findElement(By.linkText(""));
//        driver.findElement(By.partialLinkText(""));
//        driver.findElement(By.cssSelector(""));
//        driver.findElement(By.xpath(""));
//
//        //.findElement(). or .findElements().
//        driver.findElement(By.id("")).click();
//        driver.findElement(By.id("")).clear();
//        driver.findElement(By.id("")).equals();
//        driver.findElement(By.id("")).findElement(By.id(""));//
//        driver.findElement(By.id("")).findElements(By.id(""));//
//        driver.findElement(By.id("")).getAttribute("");//
//        driver.findElement(By.id("")).getAccessibleName();//
//        driver.findElement(By.id("")).getAriaRole();//
//        driver.findElement(By.id("")).getClass();//
//        driver.findElement(By.id("")).getCssValue("");//
//        driver.findElement(By.id("")).getDomAttribute("");//
//        driver.findElement(By.id("")).getDomProperty('');//
//        driver.findElement(By.id("")).getLocation();//
//        driver.findElement(By.id("")).getRect();//
//        driver.findElement(By.id("")).getSize();//
//        driver.findElement(By.id("")).getShadowRoot();//
//        driver.findElement(By.id("")).getScreenshotAs("");
//        driver.findElement(By.id("")).getText();//
//        driver.findElement(By.id("")).getSize();//
//        driver.findElement(By.id("")).hashCode();
//        driver.findElement(By.id("")).isDisplayed();
//        driver.findElement(By.id("")).isEnabled();
//        driver.findElement(By.id("")).isSelected();
//        driver.findElement(By.id("")).notify();
//        driver.findElement(By.id("")).notifyAll();
//        driver.findElement(By.id("")).sendKeys("");
//        driver.findElement(By.id("")).submit();
//        driver.findElement(By.id("")).toString(); //
//        driver.findElement(By.id("")).wait();
//        driver.findElement(By.id("")).wait(22);
//        driver.findElement(By.id("")).wait(22, 34);
//
//        driver.get("");
//        driver.getClass();//
//        driver.getCurrentUrl();//
//        driver.getPageSource();//
//        driver.getTitle();//
//        driver.getWindowHandle();//
//        driver.getWindowHandles();//
//
//        driver.hashCode();
//
//        driver.manage().window().maximize();
//        driver.manage().window().maximize();
//        driver.manage().window();//
//        driver.manage();//
//
//        driver.navigate().to("");
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
//
//        driver.notify();
//        driver.notifyAll();
//
//        driver.quit();
//
//        driver.switchTo().frame("test",);
//        driver.switchTo().frame("");
//        driver.switchTo().frame(4);
//        driver.switchTo().frame("", );
//        driver.switchTo().window("1");
//        driver.switchTo().parentFrame();
//        driver.switchTo().alert();//
//        driver.switchTo().activeElement();
//        driver.switchTo().defaultContent();
//        driver.switchTo().newWindow("");
//
//        driver.toString();//
//
//
//        {
//            Assert.assertEquals();
//            Assert.assertEqualsDeep();
//            Assert.assertEqualsNoOrder();
//
//            Assert.assertFalse();
//
//            Assert.assertListContains();
//            Assert.assertListNotContains();
//            Assert.assertListContainsObject();
//            Assert.assertListNotContainsObject();
//
//            Assert.assertNotEquals();
//            Assert.assertNotEqualsDeep();
//            Assert.assertNotNull();
//            Assert.assertNotSame();
//
//            Assert.assertSame();
//
//            Assert.assertTrue();
//            Assert.assertThrows();
//
//        }
//
//
//        {
//            Actions actions = new Actions(driver);
//
//
//            actions.build();
//
//            actions.clickAndHold();
//            actions.click();
//            actions.contextClick();
//
//            actions.doubleClick();
//            actions.dragAndDrop(this);
//
//            actions.equals(this);
//
//            actions.getActionDuration();
//            actions.getActiveKeyboard();
//            actions.getSequences();
//            actions.getActivePointer();
//            actions.getActiveWheel();
//            actions.getClass();
//
//            actions.keyUp(Keys.CONTROL);
//            actions.keyDown(Keys.SHIFT);
//
//            actions.moveToElement("");
//            actions.moveToLocation("", "");
//            actions.moveByOffset("","");
//
//            actions.notify();
//            actions.notifyAll();
//
//            actions.perform();
//            actions.pause(210);
//
//            actions.release();
//
//            actions.sendKeys();
//            actions.scrollToElement();
//            actions.scrollByAmount();
//            actions.scrollFromOrigin();
//            actions.setActiveKeyboard();
//            actions.setActivePointer();
//            actions.setActiveWheel();
//
//            actions.tick();
//            actions.toString();
//
//            actions.wait();
//
//       }
//
//        {
//
//
//        }

  }
}
