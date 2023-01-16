package homeWorks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownload extends TestBase {
    //https://the-internet.herokuapp.com/download adresine gidin.
    //dummy.txt dosyasini indirelim
    //Dosyanin basariyla indrilip indirilmesigini test edelim


    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/download");
        WebElement dummyLinki= driver.findElement(By.xpath("//*[text()='dummy.txt']"));
        dummyLinki.click();
        waitFor(5);
        //Dosya download a indirilecektir.O yuzden bize downloads un path i lazim
        String farkliKisim= System.getProperty("user.home");
        String ortakKisim= "\\Downloads\\dummy.txt";
        String path= farkliKisim+ortakKisim;
        Assert.assertTrue((Files.exists(Paths.get(path))));


    }
}
