package ssg;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesDownload extends TestBase {
    // Exercise 2...

    //1. 'https://the-internet.herokuapp.com/download' adresine gidiniz
    //2. LambdaTest.txt dosyasini indirelim
    //3. dosyanin bilgisayarınızda downloads'a basariyla indirilip indirilmedigini test ediniz
    @Test
    public void test01(){
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//*[text()='LambdaTest.txt']")).click();
        // C:\Users\Lenovo\Downloads\LambdaTest.txt ==> indirilen dosyanin path i

        String path= System.getProperty("user.home")+"\\Downloads\\LambdaTest.txt";
       // Assert.assertTrue(Files.exists(Paths.get("C:\\Users\\Lenovo\\Downloads\\LambdaTest.txt")));
        Assert.assertTrue(Files.exists(Paths.get(path)));
        //Files.exists ==>dosyam mevcut mu? demek diyebiliriz


    }
}
