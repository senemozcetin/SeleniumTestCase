package seleniumStudy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class S03 extends TestBase {
    @Test
    public void test01() {

        //1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");

        // 2- Hover over Me First" kutusunun ustune gelin
        Actions actions= new Actions(driver);
        WebElement button1= driver.findElement(By.xpath("//*[text()='Hover Over Me First!']"));
        actions.moveToElement(button1).perform();
        waitFor(2);

        //Link 1" e tiklayin
        driver.findElement(By.xpath("(//*[@class='list-alert'])[1]")).click();
        waitFor(2);

        //Popup mesajini yazdirin
        System.out.println("Popup mesaji : " + driver.switchTo().alert().getText());

        //Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();

        //“Click and hold" kutusuna basili tutun
        WebElement clickAndHold= driver.findElement(By.xpath("//*[@id='click-box']"));
        actions.clickAndHold(clickAndHold).perform();

        //7-“Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(clickAndHold.getText());

        //8- “Double click me" butonunu cift tiklayin
        WebElement doubleClick= driver.findElement(By.id("double-click"));
        actions.doubleClick(doubleClick).perform();
    }
}
