package Slaytlar;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

public class Soru1 extends TestBase {
    @Test
    public void test01(){
        //1. Yeni bir package olusturalim : day01
        //2. Yeni bir class olusturalim : C03_GetMethods
        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //4. Sayfa basligini(title) yazdirin
        String actualTitle= driver.getTitle();

        //5. Sayfa basliginin "Amazon" icerdigini test edin
        Assert.assertTrue(actualTitle.contains("Amazon"));

        //6. Sayfa adresini(url) yazdirin
        String actualUrl = driver.getCurrentUrl();

        //7. Sayfa url'inin "amazon" icerdigini test edin.
        Assert.assertTrue(actualUrl.contains("amazon"));

        //8. Sayfa handle degerini yazdirin
        System.out.println("Handle degeri : " + driver.getWindowHandle());

        //9. Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        Assert.assertTrue(driver.getPageSource().contains("Gateway"));


    }
}
