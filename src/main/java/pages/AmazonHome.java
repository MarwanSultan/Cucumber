package pages;

import core.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AmazonHome extends BasePage {

  WebDriverWait wait;

  @FindBy(id = "twotabsearchtextbox")
  WebElement searchBox;

  @FindBy(css = "nav-link-accountList > span.nav-line-1")
  WebElement searchButton;

  @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
  WebElement signInLink;

  @FindBy(css = "#nav-link-prime")
  WebElement tryPrimeLink;

  @FindBy(css = "#nav-orders > span.nav-line-2")
  WebElement orderslink;

  @FindBy(id = "navFooter")
  WebElement amazonFooter;

  @FindBy(id = "div#nav-logo")
  WebElement amazonLogo;

  @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img")
  WebElement amazonsChoice;

  ///////////////////////////////////////////////
  public AmazonHome(WebDriver driver) {

    super(driver);
  }
  //////////////////////////////////////////////////

  // ----------------------------------------------------------------------------------

  /////////////////// METHODS//////////////////////////////////////////
/**/
    public void resetAmazonHome(){
        tryPrimeLink.click();

    }

  public void initialize() {
    tryPrimeLink.isEnabled();  }


  public void clickSignIn(){
    signInLink.click();

  }

  public void searchFeature(String var){
    searchBox.sendKeys(var);
    searchBox.sendKeys(Keys.ENTER);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }


}