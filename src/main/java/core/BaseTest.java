package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AmazonHome;

public class BaseTest {

    public WebDriver driver;
    AmazonHome amazonHome;

   @BeforeClass
    public void setup(){
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.get("https://www.amazon.com/");
       WebDriverWait wait = new WebDriverWait(driver, 30);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
        AmazonHome amazonHome = new AmazonHome(driver);
        amazonHome.initialize();
        driver.manage().window().maximize();
    }

   @AfterClass
   public void tearDown(){
        driver.quit();
    }
}
