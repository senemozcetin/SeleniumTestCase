package homeWorks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class FileUpload extends TestBase {
    @Test
    public void test01(){
        //https://the-internet.herokuapp.com/upload adresine gidin.
        driver.get("https://the-internet.herokuapp.com/upload");
        //chooseFile (dosya sec) butonuna basalim
        //yuklemek istedigimiz dosyayi secelim
        WebElement chooseFile= driver.findElement(By.id("file-upload"));
        String farkliKisim= System.getProperty("user.home");
        String ortakKisim= "\\Desktop\\text.txt";
        String yuklenecekDosya= farkliKisim+ortakKisim;
        chooseFile.sendKeys(yuklenecekDosya);
        waitFor(3);


        //upload butonuna basalim
        driver.findElement(By.id("file-submit")).click();
        //"File Uploaded!" textinin goruntulendigini test edelim
        WebElement uploadedText= driver.findElement(By.xpath("//*[.='File Uploaded!']"));
        Assert.assertTrue(uploadedText.isDisplayed());


    }
}
