package seleniumStudy;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Can08 extends TestBase {
    @Test
    public void test01() {
        //sahibinden.com a gidin
        driver.get("https://www.sahibinden.com");

        //anasayfada oldugunuzu dogrulayin
        WebElement anaSayfa= driver.findElement(By.xpath("//html"));
        Assert.assertTrue(anaSayfa.isDisplayed());
        driver.manage().deleteAllCookies();

        //detayli arama tiklayin
        WebElement detayliarama= driver.findElement(By.xpath("//*[@title='Detaylı Arama']"));
        detayliarama.click();

        //detayli arama sayfasina geldiginizi dogrulatin
        WebElement detayliaramaSayf= driver.findElement(By.xpath("(//h2)[1]"));
        Assert.assertEquals("Detayli Arama",detayliaramaSayf);

        //emlak-konut-satilik seceneklerini secip
        //altta cikan butun filtre seceneklerine en az bir filtre degeri girip en sonundaki arama yap tusuna tiklayin
        driver.findElement(By.xpath("//*[text()='Tüm Çerezleri Kabul Et']")).click();

        driver.findElement(By.xpath("//*[.='Emlak']")).click();
        waitFor(2);
        driver.findElement(By.xpath("//*[.='Konut']")).click();
        waitFor(2);
        driver.findElement(By.xpath("//*[.='Satılık']")).click();

        driver.findElement(By.xpath("//*[text()='Arama Yap']")).click();
        //filtreler için sağdakilere benzer methodlar oluşturun

        //detayli_Arama_Adres("izmir", "bayrakli", "adalet mah.");
        //detayli_Arama_Fiyat("4.000","4.000.000","USD");
        //detayli_Arama_Brut("180","400");
        //detayli_Arama_Oda_Sayisi("10 Üzeri");//0-43 arasi
        //cikan sonuc sayisini veya sonuc yoksa bunu bildiren yaziyi konsolda yazdirin
    }

}
