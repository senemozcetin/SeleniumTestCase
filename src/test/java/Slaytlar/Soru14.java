package Slaytlar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Soru14 extends TestBase {
    @Test
    public void test01(){
        //1. "https://www.saucedemo.com" Adresine gidin
        driver.get("https://www.saucedemo.com");

        //2. Username kutusuna "standard_user" yazdirin
        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user"+ Keys.ENTER);

        //3. Password kutusuna "secret_sauce" yazdirin
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce"+Keys.ENTER);

        //4. Login tusuna basin
        driver.findElement(By.xpath("//*[@class='submit-button btn_action']")).click();

        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement ilkUrun= driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        System.out.println(ilkUrun.getText());
        ilkUrun.click();

        //6. Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        //7. Alisveris sepetine tiklayin
        driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();

        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement sepet= driver.findElement(By.xpath("//*[@class='cart_item_label']"));
        Assert.assertTrue(sepet.isDisplayed());


    }
}
