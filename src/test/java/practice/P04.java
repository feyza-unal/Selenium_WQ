package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//      https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");

//      Sayfa basliginin “Google” ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Google")){
            System.out.println("Title PASSED");
        }else System.out.println("Title FAILED");

//      Arama cubuguna “Nutella” yazip aratin
        driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Nutella",Keys.ENTER);

//      Bulunan sonuc sayisini
        WebElement result = driver.findElement(By.xpath("//*[@id=\"result-stats\"]"));
        System.out.println(result.getText());

//      sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        String number = result.getText().split(" ")[1].replaceAll("\\D","");
//      Yaklaşık 138.000.000 sonuç bulundu --> [Yaklaşık,138.000.000,sonuç,bulundu]
//      \\D ile rakam olmayan herseyi sildik.   --> 138000000

        int onMilyon = 10000000;
        Integer intNumber = Integer.valueOf(number);
        if (intNumber>onMilyon){
            System.out.println("Result PASSED");
        }else System.out.println("Result FAILED");

//      8 Sayfayi kapatin
        driver.close();
    }

}
