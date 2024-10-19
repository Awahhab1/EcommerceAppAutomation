package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class AddToCartPage extends BasePage{


    public AddToCartPage(WebDriver driver ){
        super(driver);
    }

    @FindBy(id="button-cart")
    WebElement AddToCartButton;

    //"Success: You have added MacBook to your shopping cart!"



    //@FindBy(css="button[title='Remove']")
    @FindBy(css = ".fa.fa-times-circle")
    WebElement RemoveButton;


    @FindBy(css = ".alert.alert-success")
    WebElement AlertWebElement;


    @FindBy(xpath="//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]")
    WebElement ShoppingWebElement;

    public void AddProducToCart(){
        AddToCartButton.click();
    }

    public String getAlertText(){

        return AlertWebElement.getText();
    }



    public String getShippingCartText(){

        return ShoppingWebElement.getText();
    }




    public void clickCancleButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", RemoveButton);
        RemoveButton.click();

    }

}
