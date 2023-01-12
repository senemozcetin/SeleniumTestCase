package seleniumStudy;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Can05 extends TestBase {
    @Test
    public void test01(){
        //1. "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");

        //2. "Hover over Me First" kutusunun ustune gelin
        Actions actions=new Actions(driver);
        WebElement meFirst= driver.findElement(By.xpath("//*[text()='Hover Over Me First!']"));
        actions.moveToElement(meFirst).perform();

        //3. "Link 1" e tiklayin
        driver.findElement(By.xpath("(//*[@class='list-alert'])[1]")).click();


        //4. Popup mesajini yazdirin
        System.out.println("Popup mesaji : " + driver.switchTo().alert().getText());

        //5. Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();

        //6. "Click and hold" kutusuna basili tutun
        WebElement clickAndHold= driver.findElement(By.xpath("//*[@id='click-box']"));
        actions.clickAndHold(clickAndHold).perform();

        //7. "Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(clickAndHold.getText());

        //8. "Double click me" butonunu cift tiklayin
        WebElement ciftTikla= driver.findElement(By.xpath("//*[@id='double-click']"));
        actions.doubleClick(ciftTikla).perform();

        //9. "Double click me" butonunun renk değiştridiğini doğrulayın
        WebElement yeniCiftTikla= driver.findElement(By.xpath("//*[@class='div-double-click double']"));
        Assert.assertTrue(yeniCiftTikla.getAttribute("class").equals("div-double-click double"));


    }
}
