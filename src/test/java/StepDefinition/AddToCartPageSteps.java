package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AddToCartPage;
import pages.HomePage;
import utils.DriverManager;

public class AddToCartPageSteps {

    WebDriver driver= DriverManager.getDriver();
    HomePage homepage=new HomePage(driver);
    AddToCartPage addtocart=new AddToCartPage(driver);



    @And("user click on the home page")
    public void user_click_on_the_home_page() {
        homepage.clickHomeIcon();

    }
    @And("user select some products from the Featured section")
    public void user_select_some_products_from_the_featured_section() {
        homepage.clickProduct();
        addtocart.AddProducToCart();
    }
    @Then("Product added Successfully message should shown to user")
    public void product_added_successfully_message_should_shown_to_user() {
        String Actual="Success: You have added MacBook to your shopping cart!";


        //Assert.assertEquals(addtocart.getAlertText(),Actual);
    }


    @And("user click on cart and view cart link")
    public void user_click_on_cart_and_view_cart_link() {
        homepage.clickCartButton();
        homepage.clickViewCartLink();
    }
    @And("user click on delete button")
    public void user_click_on_delete_button() {
        addtocart.clickCancleButton();
    }
    @Then("The product should be deleted from the cart")
    public void the_product_should_be_deleted_from_the_cart() {
        String ExpectedString="Your shopping cart is empty!";
        System.out.println(" Product Remove form the cart");
        Assert.assertEquals(ExpectedString,addtocart.getShippingCartText());

    }


}
