package homeWorks;
import org.junit.Test;
public class FileExist {
    @Test
    public void test01() {
        System.out.println(System.getProperty("user.dir"));
        //bana icinde oldugum projenin dosya yolunu (path) verir.
        // C:\Users\Lenovo\IdeaProjects\SeleniumTestCase

        System.out.println(System.getProperty("user.home"));
        //C:\Users\Lenovo benim bilgisayarimin bana ozel kismini verdi

        //C:\Users\Lenovo\Desktop masaustu path
        //C:\Users\Lenovo\Downloads  indirilenler path
        //C:\Users\Lenovo\IdeaProjects\SeleniumTestCase\src\test\java\homeWorks\DropdownOptions.java

        //HomePath + "/Downloads"

        //Masaustumuzdeki text dosyasinin varligini test edin
        //C:\Users\Lenovo\Desktop\text.txt
        String dosyaYolu= System.getProperty("user.home") + "\\Desktop\\text.txt";
        System.out.println(dosyaYolu);
        //Bilgisayarimizdaki bir dosyanin varligini test etmemiz icin once o dosyaya ulasmamiz gerekir
        //Java da dosyay erisim icin dosya yoluna path ihtiyac vardir
        //Her pc in kullanci adi farkli olacagindan masaustu dosya yolu da birbirinden farkli olacaktir
        //Testlerimizin tum bilgisayarlarda calismasi icin dosya yolunu DINAMIK yapmak zorundayiz
        // Bunun icin her bilg birbirinden farkli olan yolunu bulmak icin

        String farkliKisim= System.getProperty("user.home");




    }
}

