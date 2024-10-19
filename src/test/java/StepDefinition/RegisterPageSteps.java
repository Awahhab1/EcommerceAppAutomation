package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.RegistrationPage;
import utils.DriverManager;

import java.time.Duration;

public class RegisterPageSteps {
    WebDriver driver = DriverManager.getDriver();
    RegistrationPage Rpage= new RegistrationPage(driver);
    @When("user enter {string} as first name")
    public void user_enter_as_first_name(String fname)  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Rpage.setFirstName(fname);

    }
    @And("user enter {string} as lastname")
    public void user_enter_as_lastname(String lname) {
        Rpage.setLastName(lname);
    }

    @And("user enter unique email")
    public void user_enter_unique_email() {
        long timestamp = System.currentTimeMillis();
        String uniqueEmail = "test" + timestamp + "@test.com";
        Rpage.setEmail(uniqueEmail);
    }
    @And("user enter {string} as telephone")
    public void user_enter_as_telephone(String phone) {
       Rpage.setPhone(phone);
    }
    @And("user enter {string} as password and {string} as confirm password")
    public void user_enter_as_password_and_as_confirm_password(String Password, String C_password) {
       Rpage.setPassword(Password);
       Rpage.setConformPassword(C_password);
    }
    @And("user check the checkbox Privacy Policy")
    public void user_check_the_checkbox_privacy_policy() {
        Rpage.setPolicy();
    }
    @And("user click on the Continue button")
    public void user_click_on_the_continue_button() {
        Rpage.clickButton();
    }
    @Then("A new user should be register successfully")
    public void a_new_user_should_be_register_successfully() {
        String ExpectedText="Your Account Has Been Created!";
        Assert.assertEquals(ExpectedText,Rpage.getHeaderText());
        driver.quit();

    }


}
