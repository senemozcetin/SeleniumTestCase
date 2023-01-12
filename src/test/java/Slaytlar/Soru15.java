package Slaytlar;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Soru15 extends TestBase {
    @Test
    public void test01(){
        //1. Bir class oluşturun : CheckBoxTest
        //2. Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
        //a. Verilen web sayfasına gidin.
        //https://the-internet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        //b. Checkbox1 ve checkbox2 elementlerini locate edin.
        WebElement checkbox1= driver.findElement(By.xpath("//*[@type='checkbox']"));
        WebElement checkbox2= driver.findElement(By.xpath("(//*[@type='checkbox'])[2]"));

        //c. Checkbox1 seçili değilse onay kutusunu tıklayın
       if (!checkbox1.isSelected()){
           checkbox1.click();
       }

        //d. Checkbox2 seçili değilse onay kutusunu tıklayın
        if (!checkbox2.isSelected()){
            checkbox2.click();
        }
    }
}
