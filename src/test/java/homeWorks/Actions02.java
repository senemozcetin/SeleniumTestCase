package homeWorks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Actions02 extends TestBase {
    @Test
    public void test01(){
        //Yeni bir class olusturalim: MouseActions2
        //1 https://demoqa.com/droppable adresine gidelim
        driver.get("https://demoqa.com/droppable");

        //2 “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
        WebElement kaynak= driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement hedef= driver.findElement(By.xpath("(//*[@id='droppable'])[1]"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(kaynak,hedef).perform();

        //3 “Drop here” yazisi yerine “Dropped!” oldugunu test edin
        WebElement degisenText= driver.findElement(By.xpath("//*[text()='Dropped!']"));
        Assert.assertEquals("Dropped!",degisenText.getText());

    }
}
