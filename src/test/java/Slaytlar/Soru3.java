package Slaytlar;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import utilities.TestBase;

import java.awt.*;

public class Soru3 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        //1. Yeni bir Class olusturalim.C06_ManageWindow
        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //3. Sayfanin konumunu ve boyutlarini yazdirin
        Point position = driver.manage().window().getPosition();
        System.out.println("position = " + position);

        Dimension boyut= driver.manage().window().getSize();
        System.out.println("boyut = " + boyut);

        //4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        Point position2 = driver.manage().window().getPosition();
        System.out.println("position2 = " + position2);

        Dimension boyut2= driver.manage().window().getSize();
        System.out.println("boyut2 = " + boyut2);

        //7. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

        //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        Point position3 = driver.manage().window().getPosition();
        System.out.println("position3 = " + position3);

        Dimension boyut3= driver.manage().window().getSize();
        System.out.println("boyut3 = " + boyut3);

        //9. Sayfayi kapatin
    }
}
