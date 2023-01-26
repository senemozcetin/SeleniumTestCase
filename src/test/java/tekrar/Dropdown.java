package tekrar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class Dropdown extends TestBase {
    @Test
    public void test01() {
        //Given kullanici https://testcenter.techproeducation.com/index.php?page=dropdown sayfasindayken
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        //Dogum yilini , ayini, gununu su sekilde secer: 2000/ January, 10
        Select select=new Select(driver.findElement(By.xpath("//*[@id='year']")));
        select.selectByVisibleText("2000");

        Select select1=new Select(driver.findElement(By.xpath("//*[@id='month']")));
        select1.selectByVisibleText("January");

        Select select2=new Select(driver.findElement(By.xpath("//*[@id='day']")));
        select2.selectByVisibleText("10");

        //Tum eyalet isimlerini konsola yazdir
        WebElement state=driver.findElement(By.xpath("//*[@id='state']"));
        Select stateddm= new Select(state);
        List<WebElement> allState= stateddm.getOptions();
        allState.forEach(t-> System.out.println(t.getText()));

        //State dropdown indaki varsayilan secili secenegin 'Select a State' oldugunu verify(dogrulama) edelim
        Assert.assertEquals(stateddm.getFirstSelectedOption().getText(),"Select a State");
    }
}
