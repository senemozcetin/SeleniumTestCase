package Slaytlar;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Soru7 extends TestBase {
    @Test
    public void test01() {

        // 1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");

        // 2) sayfadaki iframe sayısını bulunuz.
        List<WebElement> iframes= driver.findElements(By.xpath("//iframe"));
        int iframeSize= iframes.size();
        System.out.println("Iframe sayisi : " + iframeSize);

        // 3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        WebElement play= driver.findElement(By.xpath("//*[@wmode='transparent']"));
        driver.switchTo().frame(play);
        driver.findElement(By.xpath("//button[@aria-label='Oynat']")).click();

        // 4) ilk iframe'den çıkıp ana sayfaya dönünüz
        driver.switchTo().defaultContent();

        //5) ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live-selenium-project.html) tıklayınız
        driver.switchTo().frame(driver.findElement(By.id("a077aa5e")));
        driver.findElement(By.xpath("//*[@src='Jmeter720.png']")).click();





            }
        }


