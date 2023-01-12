package AutomationPractice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class TestCase06 extends TestBase {
    @Test
    public void test01(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement anaSayfa= driver.findElement(By.xpath("//html"));
        Assert.assertTrue(anaSayfa.isDisplayed());

        //4. Click on 'Contact Us' button
        driver.findElement(By.xpath("//*[@class='fa fa-envelope']")).click();

        //5. Verify 'GET IN TOUCH' is visible
        WebElement getInTouchEl = driver.findElement(By.xpath("(//*[@class='title text-center'])[2]"));
        Assert.assertTrue(getInTouchEl.isDisplayed());

        //6. Enter name, email, subject and message
        driver.findElement(By.xpath("//*[@data-qa='name']")).sendKeys("Senem",
                Keys.TAB,"zxcvvbn@gmail.com",Keys.TAB,"Selenium",Keys.TAB,"hbadjhjshbjh");
        //7. Upload file
        WebElement uploadFile = driver.findElement(By.xpath("//input[@name='upload_file']"));
        uploadFile.sendKeys("C:/Users/Lenovo/Desktop/seleniummethodlar.pdf");

        //8. Click 'Submit' button
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        //9. Click OK button
        driver.switchTo().alert().accept();

        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='status alert alert-success']")).isDisplayed());

        //11. Click 'Home' button and verify that landed to home page successfully
        driver.findElement(By.xpath("//*[@class='btn btn-success']")).click();
        WebElement anaSayfaa= driver.findElement(By.xpath("//html"));
        Assert.assertTrue(anaSayfaa.isDisplayed());

    }
}
