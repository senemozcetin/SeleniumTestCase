package seleniumStudy;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class S04 extends TestBase {
    @Test
    public void test01() throws InterruptedException {

        //Faker Kutuphanesi HOMEWORK
        //Faker class’i testlerimizi yaparken ihtiyav duydugumuz isim, soyisim, adres vb bilgiler icin fake
        //degerler uretmemize imkan tanir.
        //Faker degerler uretmek icin Faker class’indan bir obje uretir ve var olan method’lari kullaniriz.


        //"https://facebook.com"  Adresine gidin
        driver.get("https://facebook.com");

        //“create new account”  butonuna basin
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

        //“firstName” giris kutusuna bir isim yazin, “surname” giris kutusuna bir soyisim yazin
        //“email” giris kutusuna bir email yazin,

        Faker faker= new Faker();
        String firstName= faker.name().firstName();
        String fakeEmail = faker.internet().emailAddress();
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(firstName,Keys.TAB,
                faker.name().lastName(),Keys.TAB,fakeEmail);

        //“email” onay kutusuna emaili tekrar yazin, Bir sifre girin
        WebElement emaildogrulama = driver.findElement(By.xpath("//input[@aria-label='E-posta adresini tekrar gir']"));
        emaildogrulama.sendKeys(fakeEmail,Keys.TAB,faker.internet().password());

        //Tarih icin gun secin
        WebElement day= driver.findElement(By.xpath("//*[@id='day']"));
        Select select= new Select(day);
        int fakeDay = faker.number().numberBetween(0,30);
        select.selectByIndex(fakeDay);

        //Tarih icin ay secin
        WebElement month= driver.findElement(By.id("month"));
        Select select1= new Select(month);
        select1.selectByVisibleText("May");

        //Tarih icin yil secin
        WebElement year= driver.findElement(By.id("year"));
        Select select2= new Select(year);
        int fakeYear = faker.number().numberBetween(1905,2023);
        String yearFake= String.valueOf(fakeYear);
        select2.selectByVisibleText(yearFake);

        //Cinsiyeti secin
        WebElement kadin= driver.findElement(By.xpath("(//*[@type='radio'])[1]"));
        kadin.click();

        //Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
        WebElement erkek= driver.findElement(By.xpath("(//*[@type='radio'])[2]"));
        WebElement ozel= driver.findElement(By.xpath("(//*[@type='radio'])[3]"));
        Assert.assertTrue(kadin.isSelected());
        Assert.assertFalse(erkek.isSelected());
        Assert.assertFalse(ozel.isSelected());

    }
}
