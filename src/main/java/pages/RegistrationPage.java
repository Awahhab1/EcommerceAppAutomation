package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.Flow;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css="#input-firstname")
    WebElement firstNameInput;

    @FindBy(id="input-lastname")
    WebElement lastNameInput;

    @FindBy(id="input-email")
    WebElement emailInput;

    @FindBy(id="input-telephone")
    WebElement phoneInput;

    @FindBy(id="input-password")
    WebElement passwordInput;

    @FindBy(id="input-confirm")
    WebElement conformPasswordInput;

    @FindBy(css="input[name='agree']")
    WebElement checkBoxWebElement;


    @FindBy(css="input[value='Continue']")
    WebElement buttonWebElement;

    @FindBy(xpath="//h1[contains(text(), 'Your Account Has Been Created!')]")
    WebElement Assertion_test;


    public void setFirstName(String firstname) {
        firstNameInput.sendKeys(firstname);
    }

    public void setLastName(String lastname) {
        lastNameInput.sendKeys(lastname);
    }
    public void setEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void setPhone(String phone) {
        phoneInput.sendKeys(phone);
    }

    public void setPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void setConformPassword(String c_password) {
        conformPasswordInput.sendKeys(c_password);
    }

    public void setPolicy() {
        checkBoxWebElement.click();
    }

    public void clickButton() {
        buttonWebElement.click();
    }

    public String getHeaderText(){
        String Actual=Assertion_test.getText();
        return Actual;
    }



}
