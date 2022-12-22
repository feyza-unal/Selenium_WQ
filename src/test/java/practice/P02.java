package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//      Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

//      Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("position : " + driver.manage().window().getPosition());
        System.out.println("size : " + driver.manage().window().getSize());

//      Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(80, 0));
        driver.manage().window().setSize(new Dimension(800, 600));

//      Sayfanin sizin istediginiz konum ve boyuta geldigini test edin 8. Sayfayi kapatin
        Point konum = driver.manage().window().getPosition();
        if (konum.getX() == 80 && konum.getY() == 0) {
            System.out.println("Konum PASSED");
        } else System.out.println("Konum FAILED");

        Dimension boyut = driver.manage().window().getSize();
        if (boyut.width == 800 && boyut.height == 600) {
            System.out.println("Boyut PASSED");
        } else System.out.println("Boyut FAILED");
        
        driver.close();
    }
}