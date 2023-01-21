package homeWorks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.IOException;

public class JS_Executors extends TestBase {
    @Test
    public void test01() throws IOException {
        driver.get("https://www.techproeducation.com");
        WebElement weOffer= driver.findElement(By.xpath("//*[.='we offer']"));
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);",weOffer);
        waitFor(3);
        takeScreenShotOfPage();
        WebElement enrollFreeCourse= driver.findElement(By.xpath("//*[.='Enroll Free Course']"));
        scrollIntoViewJS(driver.findElement(By.xpath("//span[.='Enroll Free Course']")));
        waitFor(3);
        takeScreenShotOfPage();
        scrollIntoViewJS(driver.findElement(By.xpath("//h3[.='WHY US?']")));
        waitFor(3);
        takeScreenShotOfPage();
         clickByJS(driver.findElement(By.linkText("LMS LOGIN")));




    }
}
