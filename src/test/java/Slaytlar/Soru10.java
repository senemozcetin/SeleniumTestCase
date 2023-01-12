package Slaytlar;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Soru10 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        //1 https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com/");

        //2 arama kutusunu locate edelim
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        //3 "Samsung headphones" ile arama yapalim
        aramaKutusu.sendKeys("Samsung headphones"+ Keys.ENTER);

        //4 Bulunan sonuc sayisini yazdiralim
        String sonucYazisi = driver.findElement(By.xpath("//*[text()='1-16 of 235 results for']")).getText();
        String sonucSayisi= sonucYazisi.split(" ")[3];
        System.out.println(sonucSayisi);
        Thread.sleep(3000);

        //5 Ilk urunu tiklayalim
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
        Thread.sleep(3000);

        //6 Sayfadaki tum basliklari yazdiralim
       List<WebElement> basliklar=  driver.findElements(By.xpath("//h1"));
       for (WebElement w:basliklar){
           System.out.println(w.getText());
       }
    }

}
