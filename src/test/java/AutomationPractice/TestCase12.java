package AutomationPractice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TestCase12 extends TestBase {
    @Test
    public void test01() {
        //Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

//Verify that home page is visible successfully
        Assert.assertTrue(driver.findElement(By.xpath("//body")).isDisplayed());

//Click 'Products' button
        driver.findElement(By.xpath("//*[@class='material-icons card_travel']")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@class='material-icons card_travel']")).click();


//Hover over first product and click 'Add to cart'
        Actions actions= new Actions(driver);
        WebElement firstProduct= driver.findElement(By.xpath("(//*[@class='productinfo text-center'])[1]"));
        actions.sendKeys(Keys.PAGE_DOWN);
        actions.moveToElement(firstProduct).perform();
        waitFor(3);
       driver.findElement(By.xpath("(//*[@class='btn btn-default add-to-cart'])[1]")).click();
       waitFor(3);



//Click 'Continue Shopping' button
        driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();

//Hover over second product and click 'Add to cart'
        WebElement secondProduct= driver.findElement(By.xpath("(//*[@class='productinfo text-center'])[2]"));
        actions.moveToElement(secondProduct).perform();
        waitFor(3);
        driver.findElement(By.xpath("(//*[@class='btn btn-default add-to-cart'])[3]")).click();

//Click 'View Cart' button
        driver.findElement(By.xpath("//*[text()='View Cart']")).click();

        //      Verify both products are added to Cart
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='cart_description'])[1]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='cart_description'])[2]")).isDisplayed());
        //      Verify their prices, quantity and total price
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='cart_price'])[1]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='cart_price'])[2]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='cart_quantity'])[1]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='cart_quantity'])[2]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='cart_total'])[1]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='cart_total'])[2]")).isDisplayed());







    }
}
