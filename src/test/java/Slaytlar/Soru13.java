package Slaytlar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Soru13 extends TestBase {
    @Test
    public void test(){
        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");

        //2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//*[@id='signin_button']")).click();

        //3. Login alanine "username" yazdirin
        driver.findElement(By.xpath("//*[@name='user_login']")).sendKeys("username");

        //4. Password alanine "password" yazdirin
        driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("password");

        //5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//*[@value='Sign in']")).click();
        driver.navigate().back();

        //6. Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//*[@id='onlineBankingMenu']")).click();
        driver.findElement(By.xpath("//*[@id='pay_bills_link']")).click();

        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        //8. tarih kismina "2020-09-10" yazdirin
        driver.findElement(By.xpath("//*[@id='sp_amount']")).sendKeys("500", Keys.TAB,"2020-09-10");

        //9. Pay buttonuna tiklayin
        driver.findElement(By.xpath("//*[@id='pay_saved_payees']")).click();

        //10. "The payment was successfully submitted." mesajinin ciktigini control edin
        WebElement sonucYazisi= driver.findElement(By.xpath("//*[text()='The payment was successfully submitted.']"));
        Assert.assertTrue(sonucYazisi.isDisplayed());

    }
}
