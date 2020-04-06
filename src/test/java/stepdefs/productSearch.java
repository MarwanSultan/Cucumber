package stepdefs;

import core.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AmazonHome;

public class productSearch extends BaseTest {

    AmazonHome amazonHome;
    @Given("^User is on Home Page$")
    public void userIsOnHomePage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
    }

    @When("^User enters a product$")
    public void userEntersAProduct() {
        AmazonHome amazonHome=new AmazonHome(driver);
        amazonHome.searchFeature("VIZIO");
    }

    @Then("^User clicks search$")
    public void userClicksSearch() {
        driver.navigate().refresh();
        driver.quit();
    }
}
