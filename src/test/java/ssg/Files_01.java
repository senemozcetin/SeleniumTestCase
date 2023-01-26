package ssg;

import org.junit.Assert;
import org.junit.Test;
import java.nio.file.Files;

import java.nio.file.Paths;

public class Files_01 {
    // Exercise 1...
    // masaustunde bir text dosyası olusturun
    // masaustundeki text dosyasının varlıgını test edin
    @Test
    public void test01(){
        //C:\Users\Lenovo\Desktop\text.txt
       //Assert.assertTrue(Files.exists(Paths.get("//C:\\Users\\Lenovo\\Desktop\\text.txt")));
        String farkliKisim= System.getProperty("user.home");
        String ortakKisim= "\\Desktop\\text.txt";
        String path=farkliKisim+ortakKisim;
        Assert.assertTrue(Files.exists(Paths.get(path)));


    }


}
