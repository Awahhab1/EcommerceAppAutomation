package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="#input-email")
    WebElement EmailWebElement;

    @FindBy(css="#input-password")
    WebElement PasswordWebElement;


    @FindBy(css = "input[value='Login']")
    WebElement LogInWebElement;


    public void setEmail(String email) {
        EmailWebElement.sendKeys(email);

    }

    public void setPassword(String password) {
        PasswordWebElement.sendKeys(password);

    }

    public void clickLogin() {
        LogInWebElement.click();

    }




}
