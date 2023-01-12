package AutomationPractice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class TestCase03 extends TestBase {
    @Test
    public void test(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement anaSayfa= driver.findElement(By.xpath("//html"));
        Assert.assertTrue(anaSayfa.isDisplayed());

        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();

        //5. Verify 'Login to your account' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Login to your account']")).isDisplayed());

        //6. Enter incorrect email address and password
        //7. Click 'login' button
        driver.findElement(By.xpath("//*[@data-qa='login-email']")).sendKeys("zxcvvbn@gmail.com",
                Keys.TAB,"123456",Keys.TAB,Keys.ENTER);

        //8. Verify error 'Your email or password is incorrect!' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Your email or password is incorrect!']")).isDisplayed());

    }
}
