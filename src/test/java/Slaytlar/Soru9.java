package Slaytlar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Soru9 extends TestBase {
    @Test
    public void test01(){
        //1-C01_TekrarTesti isimli bir class olusturun
        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //3- Browseri tam sayfa yapin
        driver.manage().window().fullscreen();

        //4- Sayfayi "refresh" yapin
        driver.navigate().refresh();

        //5 Sayfa basliginin "Spend less" ifadesi icerdigini test edin
        String actualTitle= driver.getTitle();
        Assert.assertTrue(actualTitle.contains("Spend less"));

        //6 Gift Cards sekmesine basin
        driver.findElement(By.xpath("//*[text()='Gift Cards']")).click();

        //7 Birthday butonuna basin
        driver.findElement(By.xpath("//*[@alt='Birthday']")).click();

        //8 Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("//div[@id='acs-product-block-0']//img[@alt='Amazon.com eGift Card']")).click();

        //9- Gift card details'den 25 $'i secin
        driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]")).click();

        //10-Urun ucretinin 25$ oldugunu test edin
        String urunUcret= driver.findElement(By.xpath("//span[@id='gc-live-preview-amount']")).getText();
        Assert.assertEquals("$25.00",urunUcret);
        //10-Sayfayi kapatin
    }
}
