package Slaytlar;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

public class Soru5 extends TestBase {
    @Test
    public void test01(){
        //1.Yeni bir class olusturalim (Homework)
        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String actualTitle=  driver.getTitle();
        Assert.assertTrue(actualTitle.contains("facebook"));

        //3.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i
        //yazdirin.
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="facebook";
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Test PASSED");
        }else {
            driver.getCurrentUrl();
        }
        //4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");

        //5. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        Assert.assertTrue(driver.getTitle().contains("Walmart.com"));

        //6. Tekrar "facebook" sayfasina donun
        driver.navigate().back();

        //7. Sayfayi yenileyin
        driver.navigate().refresh();

        //8.Sayfayi tam sayfa (maximize) yapin
        //9.Browser'i kapatin
    }
}
