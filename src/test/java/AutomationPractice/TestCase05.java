package AutomationPractice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class TestCase05 extends TestBase {
    @Test
    public void test01(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement anaSayfa= driver.findElement(By.xpath("//html"));
        Assert.assertTrue(anaSayfa.isDisplayed());

        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();

        //5. Verify 'New User Signup!' is visible
        WebElement signUpText = driver.findElement(By.xpath("//*[text()='New User Signup!']"));
        Assert.assertTrue(signUpText.isDisplayed());

        //6. Enter name and already registered email address
        //7. Click 'Signup' button
        driver.findElement(By.xpath("//*[@data-qa='signup-name']")).
                sendKeys("Senem", Keys.TAB,"zxcvvbn@gmail.com",Keys.TAB,Keys.ENTER);

        //8. Verify error 'Email Address already exist!' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Email Address already exist!']")).isDisplayed());

    }
}
