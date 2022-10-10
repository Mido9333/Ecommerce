package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P9_shoppingCart;
import org.testng.asserts.SoftAssert;

public class SD09_shoppingCart {
    P9_shoppingCart P9_shoppingCart = new P9_shoppingCart();

    @And("user chooses product randomly")
    public void choose_product() {

        P9_shoppingCart.chooseProduct().click();
    }

    @And("click on ADD TO CART button")
    public void click_addToCart() {
        P9_shoppingCart.addProductButton().click();
    }

    @Then("the product is added to the user's shopping cart and message appears says The product has been added to your shopping cart")
    public void the_product_is_added_to_the_user_s_shopping_cart_and_message_appears_says_the_product_has_been_added_to_your_shopping_cart() {
        SoftAssert wishlistAssertion = new SoftAssert();
        if (P9_shoppingCart.displayedMessage().isDisplayed()) {
            wishlistAssertion.assertEquals(P9_shoppingCart.displayedMessage().getText(), "The product has been added to your shopping cart");
            wishlistAssertion.assertEquals(P9_shoppingCart.displayedMessage().getCssValue("background-color"), "rgba(75, 176, 122, 1)");
            wishlistAssertion.assertAll();
            //System.out.println("Add product to shopping cart successfully");
        }
    }

}
