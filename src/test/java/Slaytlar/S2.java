package Slaytlar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class S2 {
        /*  1. Yeni bir Class olusturalim.C05_NavigationMethods
          2. Youtube ana sayfasina gidelim . https://www.youtube.com/
          3. Amazon soyfasina gidelim. https://www.amazon.com/
          4. Tekrar YouTube’sayfasina donelim
          5. Yeniden Amazon sayfasina gidelim
          6. Sayfayi Refresh(yenile) yapalim
          7. Sayfayi kapatalim / Tum sayfalari kapatalim
          */
       WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @After
    public void tearDown(){
        driver.close();
    }
    @Test
    public void test01(){
        driver.get("https://www.youtube.com/");
        driver.get("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }

}
