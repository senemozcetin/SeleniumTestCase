package homeWorks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class WebTables extends TestBase {
    @Test
    public void test01() {
        girisYap();

        //login methodu olusturun ve oturum acin
        //https://www.hotelmycamp.com adresine gidin
        //username: manager      password:Manager1!

        //table methodu olusturun
        //tum table boddy sinin boyutunu(sutun sayisi) bulun./tbody
        //BIRDEN FAZLA WEBELEMENT DONDURECEGI ICIN LIST OLUSTURDUK
        List<WebElement> sutunlar= driver.findElements(By.xpath("//thead//tr[1]//th"));
        int sutunSayisi= sutunlar.size();
        System.out.println("sutunSayisi = " + sutunSayisi);

        //table daki tum boddy i ve basliklari(headers) konsolda yazdirin
        WebElement tumBody= driver.findElement(By.xpath("//body"));
        System.out.println("tumBody = " + tumBody.getText());
        //TUM BODY I BIR STRING OLARAK YAZDIRMAK ISTERSENIZ BODY WEBELEMENTINI LOCATE EDIP GETTEXT METHODUYLA YAZDIRABILIRSINIZ


        //table body sinde bulunan toplam satir sayisini bulun
        List<WebElement> allRow= driver.findElements(By.xpath(" //tbody//tr"));
        int rowSize= allRow.size();
        System.out.println("rowSize = " + rowSize);

        //table body sinde bulunan satirlari konsolda yazdirin
        for (WebElement w:allRow){
            System.out.println(w.getText());
        }

        //4.satirdaki elementleri konsolda yazdirin
        List<WebElement> dorduncuSatir= driver.findElements(By.xpath("//tbody//tr[4]//td"));
        for (WebElement each: dorduncuSatir){
            System.out.println(each.getText());
        }


        //email basligindaki tum elementleri(sutun) konsolda yazdirin
        List<WebElement> emailSutunLists= driver.findElements(By.xpath("//tbody//td[3]"));
        for (WebElement e: emailSutunLists){
            System.out.println(e.getText());
        }


    }
    public void girisYap(){
        driver.get("https://www.hotelmycamp.com");
        driver.findElement(By.xpath("//*[text()='Log in']")).click();
        driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys("manager"+
                Keys.TAB,"Manager1!",Keys.TAB,Keys.ENTER);


    }

}