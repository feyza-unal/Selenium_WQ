package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//      ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook” oldugunu
//      dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "facebook";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title PASSED");
        }else System.out.println("Title FAILED. Title : "+actualTitle);

//      Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "facebook";
        if (actualURL.contains(expectedURL)){
            System.out.println("URL PASSED");
        }else System.out.println("URL FAILED. URL : "+actualURL);

//      https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");

//      Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualTitleWM = driver.getTitle();
        String expectedTitleWM = "Walmart.com";
        if (actualTitleWM.contains(expectedTitleWM)){
            System.out.println("WM Title PASSED");
        }else System.out.println("WM Title FAILED");

//      Tekrar “facebook” sayfasina donun
        Thread.sleep(3000);
        driver.navigate().back();

//      Sayfayi yenileyin
        Thread.sleep(3000);
        driver.navigate().refresh();

//      Sayfayi tam sayfa (maximize) yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

//      Browser’i kapatin
        driver.close();
    }
}
