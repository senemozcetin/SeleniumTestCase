package Slaytlar;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import utilities.TestBase;

public class Soru4 extends TestBase {
    @Test
    public void test01(){
        //1. Yeni bir Class olusturalim.C07_ManageWindowSet
        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //3. Sayfanin konumunu ve boyutlarini yazdirin
        Point position = driver.manage().window().getPosition();
        System.out.println("position = " + position);

        Dimension boyut= driver.manage().window().getSize();
        System.out.println("boyut = " + boyut);

        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(600,600));
        driver.manage().window().setSize(new Dimension(50,50));

        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        Dimension actualNewSize = driver.manage().window().getSize(); //Dimension yerine String yazamayiz hata veriyor
        if (actualNewSize.getWidth()==600 && actualNewSize.getHeight()==600){
            System.out.println("Size passed the test");
        }else System.out.println("Size failed the test");

        Point actualYeniKonum = driver.manage().window().getPosition();
        if(actualYeniKonum.getX()==50 && actualYeniKonum.getY()==50){
            System.out.println("Konum TESTİ PASSED");
        }else System.out.println("Konum TESTİ FAILED");

        //8. Sayfayi kapatin
    }
}
