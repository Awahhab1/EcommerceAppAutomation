package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.DriverManager;

import java.sql.Driver;

public class LoginPageSteps {

    WebDriver driver= DriverManager.getDriver();
    LoginPage loginpage= new LoginPage(driver);

    @And("user enter {string} as Email address")
    public void user_enter_as_email_address(String Email) {
        loginpage.setEmail(Email);

    }
    @And("user enter {string} as password")
    public void user_enter_as_password(String password) {
        loginpage.setPassword(password);
    }
    @And("user click on the login button")
    public void user_click_on_the_login_button() {
        loginpage.clickLogin();
    }
    @Then("user should redirect to Account page")
    public void user_should_redirect_to_account_page() {
        String Expected="My Account";
        Assert.assertEquals(Expected,driver.getTitle());
    }
    @After
    public void teardown()
    {
        DriverManager.quitDriver();
    }
}
