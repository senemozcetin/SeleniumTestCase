package homeWorks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.Set;

public class Actions01 extends TestBase {
    @Test
    public void test01(){
        //1Yeni bir class olusturalim: MouseActions1
        //2https://the-internet.herokuapp.com/context_menu sitesine gidelim
        driver.get("https://the-internet.herokuapp.com/context_menu");
        String window1 = driver.getWindowHandle();

        //3- Cizili alan uzerinde sag click yapalim
        Actions actions=new Actions(driver);
        WebElement cizgilialan= driver.findElement(By.id("hot-spot"));
        actions.contextClick(cizgilialan).perform();

        //4 Alert’te cikan yazinin “You selected a context menu” oldugunu
        //test edelim.
        String alertText=driver.switchTo().alert().getText();
        Assert.assertEquals("You selected a context menu",alertText);

        //5 Tamam diyerek alert’i kapatalim
        driver.switchTo().alert().accept();

        //6 Elemental Selenium linkine tiklayalim
        driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).click();
        Set<String> handles=driver.getWindowHandles();
        for (String w:handles){
            if (!w.equals(window1)){
                driver.switchTo().window(w);
            }
        }


        //7 Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim
        WebElement yaziElementi= driver.findElement(By.xpath("//h1"));
        Assert.assertTrue(yaziElementi.getText().contains("Elemental Selenium"));


    }
}
