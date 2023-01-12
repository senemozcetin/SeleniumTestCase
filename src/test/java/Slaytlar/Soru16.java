package Slaytlar;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Soru16 extends TestBase {
    @Test
    public void test01(){
        //1. Bir class oluşturun : RadioButtonTest
        //2. Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
        //- https://www.facebook.com adresine gidin
        driver.get("https://www.facebook.com");

        //- Cookies'i kabul edin
        //- "Create an Account" button'una basin
       driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();

        //- "radio buttons" elementlerini locate edin
        WebElement kadin= driver.findElement(By.xpath("(//*[@name='sex'])[1]"));
        WebElement erkek= driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
        WebElement ozel= driver.findElement(By.xpath("(//*[@name='sex'])[3]"));

        //- Secili degilse cinsiyet butonundan size uygun olani secin
        if (!kadin.isSelected()){
            kadin.click();
        }

    }
}
