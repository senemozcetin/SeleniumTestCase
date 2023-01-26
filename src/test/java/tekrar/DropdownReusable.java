package tekrar;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class DropdownReusable extends TestBase {
    @Test
    public void test01() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        selectFromDropdown(driver.findElement(By.xpath("//select[@id='year']")),"2001");
        selectFromDropdown(driver.findElement(By.xpath("//*[@id='month']")),"May");
        selectFromDropdown(driver.findElement(By.xpath("//*[@id='day']")),"10");
    }
    public void selectFromDropdown(WebElement dropdown, String secenek){
        List<WebElement> allOptions= dropdown.findElements(By.tagName("option"));
        for (WebElement w: allOptions){
            if (w.getText().equals(secenek)){
                w.click();
                break;
            }
        }
    }

}
