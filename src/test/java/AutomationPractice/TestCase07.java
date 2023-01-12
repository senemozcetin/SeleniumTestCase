package AutomationPractice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class TestCase07 extends TestBase {
    @Test
    public void test01(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement anaSayfa= driver.findElement(By.xpath("//html"));
        Assert.assertTrue(anaSayfa.isDisplayed());

        //4. Click on 'Test Cases' button
        driver.findElement(By.xpath("(//*[@class='fa fa-list'])[1]")).click();

        //5. Verify user is navigated to test cases page successfully
        Assert.assertTrue(driver.findElement(By.xpath("//body")).isDisplayed());

    }
}
