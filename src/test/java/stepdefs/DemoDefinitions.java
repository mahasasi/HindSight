package stepdefs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import java.util.concurrent.TimeUnit;


public class DemoDefinitions {

    private static WebDriver driver;
    @Given("^I access the link QAShop$")
    public void i_access_the_link_qashop() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Selinium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://shop.demoqa.com");
        throw new PendingException();
    }

    @When("^I enter the userid and password$")
    public void i_enter_the_userid_and_password() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I entered into the site$")
    public void i_entered_into_the_site() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
