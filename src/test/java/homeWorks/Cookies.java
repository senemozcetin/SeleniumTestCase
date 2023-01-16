package homeWorks;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;
import java.util.Set;
public class Cookies extends TestBase {
    @Test
    public void test01(){
        //amazon sayfasina gidin
        driver.get("https://www.amazon.com");

        //tum cookie leri listeleyin
        Set<Cookie> allCookie= driver.manage().getCookies();
        for(Cookie w:allCookie){
            System.out.println(w);
        }
        //Sayfadaki Cookies sayisinin 5den buyuk oldugunu test edin
        int cookieSayisi= allCookie.size();
        System.out.println(cookieSayisi);
        Assert.assertTrue(cookieSayisi>5);

        //ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        for (Cookie each: allCookie){
            if (each.getName().equals("i18n-prefs")){
                Assert.assertEquals("USD", each.getValue());
            }
        }
        //ismi "en sevdigim cookie" ve degeri "cikolatali" olan bir cookie olusturun ve sayfaya ekleyin
        Cookie cookie=new Cookie("en sevdigim cookie","cikolatali");
        driver.manage().addCookie(cookie);
        waitFor(3);
        System.out.println("Yeni cookies sayisi : "+ driver.manage().getCookies().size());

        //eklediginiz cookie nin sayfaya eklendigini test edin
        Set<Cookie> allCookie1= driver.manage().getCookies();
        Assert.assertTrue(allCookie1.contains(cookie));

        //ismi skin olan cookie yi silin ve silindigini test edin
        driver.manage().deleteCookieNamed("skin");
        Assert.assertFalse(allCookie.contains("skin"));

        //tum cookie leri silin ve silindigini test edin
        driver.manage().deleteAllCookies();
        allCookie= driver.manage().getCookies();
        Assert.assertTrue(allCookie.isEmpty());
    }
}
