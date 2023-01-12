package seleniumStudy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Can04 extends TestBase {
    @Test
    public void test01(){

  /*
   #url'ye gidin: http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
  #Ülkeye göre başkentleri doldurun
 */
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");


//        Actions actions = new Actions(driver);
//        WebElement kaynak1 = driver.findElement(By.id("box6"));
//        WebElement hedef1 = driver.findElement(By.id("box106"));
//        actions.dragAndDrop(kaynak1,hedef1).perform();
//        WebElement kaynak2 = driver.findElement(By.id("box7"));
//        WebElement hedef2 = driver.findElement(By.id("box107"));
//        actions.dragAndDrop(kaynak2,hedef2).perform();
//        WebElement kaynak3 = driver.findElement(By.id("box1"));
//        WebElement hedef3 = driver.findElement(By.id("box101"));
//        actions.dragAndDrop(kaynak3,hedef3).perform();
//        WebElement kaynak4 = driver.findElement(By.id("box4"));
//        WebElement hedef4= driver.findElement(By.id("box104"));
//        actions.dragAndDrop(kaynak4,hedef4).perform();
//        WebElement kaynak5 = driver.findElement(By.id("box5"));
//        WebElement hedef5 = driver.findElement(By.id("box105"));
//        actions.dragAndDrop(kaynak5,hedef5).perform();
//        WebElement kaynak6 = driver.findElement(By.id("box2"));
//        WebElement hedef6= driver.findElement(By.id("box102"));
//        actions.dragAndDrop(kaynak6,hedef6).perform();
//        WebElement kaynak7 = driver.findElement(By.id("box3"));
//        WebElement hedef7= driver.findElement(By.id("box103"));
//        actions.clickAndHold(kaynak7).moveToElement(hedef7).release().build().perform();


        Actions actions=new Actions(driver);
        for (int i = 1; i < 8; i++) {
            WebElement kaynak= driver.findElement(By.id("box"+i));
            WebElement hedef= driver.findElement(By.id("box10"+i));
            actions.dragAndDrop(kaynak,hedef).perform();
            waitFor(3);

        }

    }
}
