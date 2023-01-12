package AutomationPractice;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TestCase10 extends TestBase {
    @Test
    public void test01() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        Assert.assertTrue(driver.findElement(By.xpath("//body")).isDisplayed());

        //4. Scroll down to footer
        Actions actions= new Actions(driver);
        WebElement sonYazi= driver.findElement(By.xpath("//*[text()='Get the most recent updates from ']"));
        actions.scrollToElement(sonYazi).perform();
        waitFor(3);

        //5. Verify text ‘SUBSCRIPTION’
        //6. Enter email address in input and click arrow button
        Faker faker= new Faker();
        WebElement text= driver.findElement(By.xpath("//*[@id='susbscribe_email']"));
        text.sendKeys( faker.internet().emailAddress()+ Keys.ENTER);
        waitFor(3);

        //7. Verify success message ‘You have been successfully subscribed!’ is visible
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='You have been successfully subscribed!']")).isDisplayed());

    }
}
