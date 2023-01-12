package Slaytlar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class Soru11 extends TestBase {
    @Test
    public void test01(){
       //1-C01_TekrarTesti isimli bir class olusturun
        //2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");

        //3- cookies uyarisini kabul ederek kapatin

        //4 Sayfa basliginin "Google" ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains("Google"));

        //5 Arama cubuguna "Nutella" yazip aratin
        driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Nutella"+ Keys.ENTER);

        //6 Bulunan sonuc sayisini yazdirin
        String sonucYazisi= driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        String sonucSayisiString=sonucYazisi.split(" ")[1].replaceAll("\\D","");
        int sonucSayisi= Integer.valueOf(sonucSayisiString);

        System.out.println(sonucSayisi);


    }
}
