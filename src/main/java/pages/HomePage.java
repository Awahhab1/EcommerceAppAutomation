package pages;

//import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class HomePage extends BasePage {


   public HomePage(WebDriver driver ){
       super(driver);
   }

    // Locators
   @FindBy(css="a[title='My Account']")
    WebElement myAccountLink;

    @FindBy(css="li[class='dropdown open'] li:nth-child(1)")
    WebElement registerLink;

    @FindBy(css="li[class='dropdown open'] li:nth-child(2)")
    WebElement loginLink;

    @FindBy(css = "img[title='MacBook']")
    WebElement MacbookWebElement;

   @FindBy(css="ul[class='breadcrumb'] li:nth-child(1)")
    WebElement HomeIconWebElement;

  @FindBy(xpath = "//a[normalize-space()='Qafox.com']")
  WebElement WebSiteLinkWebElement;

    @FindBy(id="cart-total")
    WebElement CartItemWebElement;

    @FindBy(xpath = "//*[contains(text(), 'View Cart')]")
    WebElement ViewCartWebElement;


    public void clickMyAccount(){
        myAccountLink.click();
    }



    public void clickRegister(){
        registerLink.click();
    }


    public void clickLogin(){
        loginLink.click();
    }


    public void clickHomeIcon(){


        WebSiteLinkWebElement.click();
        System.out.println("Home Icon Click");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));



    }
    public void clickAddtoCartButton(){
        CartItemWebElement.click();
    }

    public void clickViewCartLink(){
        ViewCartWebElement.click();
    }

    public void clickProduct(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", MacbookWebElement);
        MacbookWebElement.click();
    }


    public void clickCartButton(){
        CartItemWebElement.click();

    }


}
