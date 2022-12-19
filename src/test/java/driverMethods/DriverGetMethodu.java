package driverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethodu {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        //"get()" --> icine yazdigimiz linke gider
        // "https://" mutlaka yazilmali

        System.out.println("Page title : "+driver.getTitle());
        // "getTitle()" --> string deger dondurdugu icin ya stringe atamamiz yada yazdirmamiz gerek

        System.out.println("Page url : "+ driver.getCurrentUrl());
        // "getCurrentUrl()" --> gittigimiz sayfadaki url'i bize dondurur

        System.out.println("===========");
        System.out.println("Page source : "+driver.getPageSource());
        // "getPageSource()" --> sayfanin kaynak kodlarini dondurur
        System.out.println("===========");

        System.out.println("Window handle : "+driver.getWindowHandle());
        // "getWindowHandle()" --> icinde oldugu sayfanin UNIQUE hash code unu dondurur
        //bu deger her seferinde degisir

        System.out.println("Window handles :"+driver.getWindowHandles());
        // "getWindowHandles()" --> driver calisirken acilan tum sayfalarin UNIQUE hash code unu dondurur
 

    }
}
