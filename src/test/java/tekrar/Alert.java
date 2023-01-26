package tekrar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class Alert extends TestBase {

    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //Bir metod olusturun: acceptAlert
        //○1. butona tıklayın,
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        // uyarıdaki OK butonuna tıklayın
        driver.switchTo().alert().accept();

        //Result mesajının “You successfully clicked an alert” oldugunu test edin.
        Assert.assertEquals("You successfully clicked an alert",driver.findElement(By.id("result")).getText());

        //3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
        //tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.
        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
        driver.switchTo().alert().sendKeys("Senem");
        driver.switchTo().alert().accept();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='result']")).getText().contains("Senem"));

        //○ 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
        //“successfuly” icermedigini test edin.
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
        String uyariMsj= driver.switchTo().alert().getText();
        Assert.assertFalse(uyariMsj.contains("successfuly"));
    }
}
