package Slaytlar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Soru8 extends TestBase {
    @Test
    public void test01(){
        //1 https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2 Add Element butonuna basin
        driver.findElement(By.xpath("//*[.='Add Element']")).click();

        //3 Delete butonu'nun gorunur oldugunu test edin
        WebElement delete = driver.findElement(By.xpath("//*[@class='added-manually']"));
        Assert.assertTrue(delete.isDisplayed());

        //4 Delete tusuna basin
        delete.click();

        //5 "Add/Remove Elements" yazisinin gorunur oldugunu test edin
        String text= driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("Add/Remove Elements",text);
    }

}
