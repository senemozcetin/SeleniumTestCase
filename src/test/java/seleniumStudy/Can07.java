package seleniumStudy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Can07 extends TestBase {
    @Test
    public void test01() {
        /*
1) go to 'https://www.amazon.com.tr/'
2) Search iphone13 512
3) Check that reesults are listed
4) Click on iphone 13 at top of the list
5) Log the following values for each size
.Size information  .Price .Color .Stock Status
 */
        driver.get("https://www.amazon.com.tr");
        driver.findElement(By.xpath("//*[@id='sp-cc-accept']")).click();
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iphone13 512"+ Keys.ENTER);




    }
}
