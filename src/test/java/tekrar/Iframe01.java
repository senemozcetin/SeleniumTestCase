package tekrar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Iframe01 extends TestBase {
    @Test
    public void test01() {
        // https://testcenter.techproeducation.com/index.php?page=iframe
        driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");

        //Ana sayfadaki An iframe with a thin black border: metin black border yazisinin oldugunu test edelim
        String anametin= driver.findElement(By.xpath("//*[text()='An iframe with a thin black border:']")).getText();
        Assert.assertTrue(anametin.contains("black border"));

        //Ayrica 'Applications lists' yazisinin oldugunu test edelim

        driver.switchTo().frame(0);
        String icMetin= driver.findElement(By.xpath("//*[.='Applications lists']")).getText();
        String expectedIcMetin= "Applications lists";
        Assert.assertEquals(expectedIcMetin,icMetin);

        //Ana sayfadaki 'Povered By' yazisinin varligini testedelim
        driver.switchTo().defaultContent();
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Povered By']")).getText().contains("Povered By"));
    }
}
