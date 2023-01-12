package AutomationPractice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class TestCase09 extends TestBase {
    @Test
    public void test01() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        Assert.assertTrue(driver.findElement(By.xpath("//body")).isDisplayed());

        //4. Click on 'Products' button
        driver.findElement(By.xpath("//*[@class='material-icons card_travel']")).click();

        //5. Verify user is navigated to ALL PRODUCTS page successfully
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='title text-center']")).isDisplayed());
        waitFor(2);
        driver.manage().deleteAllCookies();

        //6. Enter product name in search input and click search button
        driver.findElement(By.xpath("//*[@name='search']")).sendKeys("blue top");
        driver.findElement(By.xpath("//*[@id='submit_search']")).click();
        waitFor(2);

        //7. Verify 'SEARCHED PRODUCTS' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='title text-center']")).isDisplayed());
        waitFor(2);

        //8. Verify all the products related to search are visible
        List<WebElement> allProducts = driver.findElements(By.xpath("//*[@class='productinfo text-center']/p"));
          for (WebElement w:allProducts) {
            Assert.assertTrue(w.isDisplayed());
        }
        //allProducts.stream().forEach(WebElement::isDisplayed);
    }
}
