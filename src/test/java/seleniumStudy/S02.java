package seleniumStudy;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class S02 extends TestBase {
    @Test
    public void test01() {

        //Bir Class olusturalim KeyboardActions2
        //https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/");

        //video’yu gorecek kadar asagi inin

        Actions actions= new Actions(driver);
        WebElement youtube= driver.findElement(By.xpath("//iframe[1]"));
        actions.scrollToElement(youtube).perform();
        waitFor(3);

        //videoyu izlemek icin Play tusuna basin
        WebElement iframe= driver.findElement(By.xpath("//*[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
        driver.switchTo().frame(iframe);
        WebElement play= driver.findElement(By.xpath("//*[@aria-label='Oynat']"));
        play.click();
        waitFor(3);


        //videoyu calistirdiginizi test edin
        WebElement youtubeYazi= driver.findElement(By.xpath("//*[@aria-label='youtube.com sitesinde izle']"));
        Assert.assertTrue(youtubeYazi.isDisplayed());


    }
}
