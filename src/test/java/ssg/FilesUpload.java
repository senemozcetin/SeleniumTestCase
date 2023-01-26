package ssg;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class FilesUpload extends TestBase {
    // Exercise 3...

    // masaustunde bir deneme dosyası olusturun
    // 'https://the-internet.herokuapp.com/upload' adresine gidiniz
    // 'Dosya Seç' kısmına deneme dosyasını yükleyiniz
    // 'Upload' butonuna basın
    // 'File Uploaded!' yazısının goruntulendigini test edin
    @Test
    public void test01(){
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement dosyaSec= driver.findElement(By.id("file-upload"));
        //C:\Users\Lenovo\Desktop\deneme.txt
        String yuklenecekPath= System.getProperty("user.home")+"\\Desktop\\deneme.txt";
        dosyaSec.sendKeys(yuklenecekPath);
        waitFor(5);
        driver.findElement(By.id("file-submit")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());


    }
}
