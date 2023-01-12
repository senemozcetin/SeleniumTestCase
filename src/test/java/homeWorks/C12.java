package homeWorks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C12 extends TestBase {
    @Test
    public void test01() {

        //1 Bir Class olusturalim KeyboardActions1
        //2 https://www.amazon.com sayfasina gidelim
        driver.get("https://www.amazon.com");

        //3 Arama kutusuna actions method’larini kullanarak samsung A71 yazdirin
        // ve Enter’a basarak arama yaptirin

        WebElement aramaKutusu= driver.findElement(By.xpath("//*[@class='nav-search-field ']"));
        Actions actions= new Actions(driver);

        actions.click(aramaKutusu).sendKeys("samsung A71").sendKeys(Keys.ENTER).perform();
        waitFor(3);

        //4 aramanin gerceklestigini test edin
        WebElement sonucYazisi= driver.findElement(By.xpath("//*[text()='1-16 of 55 results for']"));
        Assert.assertTrue(sonucYazisi.isDisplayed());

    }
}
