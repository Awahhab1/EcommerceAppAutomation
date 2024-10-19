package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import utils.DriverManager;
import utils.configProperties;

import java.util.Properties;

public class HomePageSteps {


        WebDriver driver = DriverManager.getDriver();
        HomePage Hpage= new HomePage(driver);



    @Given("user hit the Open Cart Home page")
    public void user_hit_the_open_cart_home_page() {
        configProperties.initializePropertyFile();
        driver.get(configProperties.property.getProperty("App_URL"));
        driver.manage().window().maximize();


    }

    @When("user hover over the My account drop down and click on Register link")
    public void user_hover_over_the_my_account_drop_down_and_click_on_register_link() {
        Hpage.clickMyAccount();
        Hpage.clickRegister();

    }
    @Then("user redirect to Registration page")
    public void user_redirect_to_registration_page() {
        String expected_title="Register Account";

        Assert.assertEquals(driver.getTitle(),expected_title);
        driver.quit();
    }


    @When ("user hover over the My account drop down and click on login link")
    public void user_hover_over_the_My_account_drop_down_and_click_on_login_link() {

        Hpage.clickMyAccount();
        Hpage.clickLogin();
    }
    @Then("user redirect to login page")
    public void user_redirect_to_login_page(){
        System.out.println(driver.getTitle());
        String ExpectedLoginTitle="Account Login";
        Assert.assertEquals(ExpectedLoginTitle,driver.getTitle());
        driver.quit();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
