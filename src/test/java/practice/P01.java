package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

//      Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

//      Sayfanin konumunu ve boyutlarini yazdirin
        Point konum = driver.manage().window().getPosition();
        System.out.println("sayfanin konumu : "+konum);

        Dimension boyut = driver.manage().window().getSize();
        System.out.println("sayfanin boyutlari : "+boyut);

//      Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

//      simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

//      Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin 7. Sayfayi fullscreen yapin
        System.out.println("maximize konum : "+driver.manage().window().getPosition());
        System.out.println("maximize boyut : "+driver.manage().window().getSize());

//      Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin 9. Sayfayi kapatin
        driver.manage().window().fullscreen();
        System.out.println("fullscreen konum : "+driver.manage().window().getPosition());
        System.out.println("fullscreen boyut : "+driver.manage().window().getSize());
        driver.close();


    }
}
