package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P10_wishList;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SD10_wishList {
    SoftAssert softAssert = new SoftAssert();
    P10_wishList P10_wishList = new P10_wishList();

    @When("user clicks add to wishlist")
    public void user_presses_on_add_to_wishlist() {
        P10_wishList.click_wishlistIcon().click();
        Hooks.sleep(20);
    }

    @Then("user chooses attributes for product")
    public void user_chooses_attributes_for_product_if_found() {
        P10_wishList.ChoosingProcessorType();
        P10_wishList.Choose_RAM();
        P10_wishList.Choose_HDD();
        P10_wishList.choose_OS();
        P10_wishList.Choose_Software();
    }

    @Then("product added and user can find it")
    public void user_should_found_the_product_added_to_wishlist_in_the_wishlist() {
        P10_wishList.click_wishListButton().click();

        String expectedMessage = "The product has been added to your wishlist";
        softAssert.assertTrue(P10_wishList.displayedMessage().getText().contains(expectedMessage), "Not add in wishlist");

        if (P10_wishList.displayedMessage().isDisplayed()) {
            Hooks.driver.findElement(By.cssSelector(".content > a:nth-child(1)")).click();
            softAssert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/wishlist", "Not ");
            softAssert.assertEquals(Hooks.driver.findElement(By.cssSelector("a[class=\"product-name\"]")).getText(), "Build your own computer", "Wrong product in wishlist");
            softAssert.assertAll();
            System.out.println("Add product to wishlist successfully");
        }
    }

    @And("user adds another product to the Wishlist")
    public void add_another_product_to_Wishlist()  {
        // Add product_2 to Wishlist & Assert its existence using POM //
        P10_wishList.addSecondProduct().click();
        // Assertion product_2 //
        Assert.assertTrue(P10_wishList.secondProdAssertDisplayed().isDisplayed());
        Hooks.sleep(3);
        System.out.println("Second product has been added to your wishlist");
    }

    @Then("user navigates to his Wishlist page")
    public void navigates_to_Wishlist() {
        Hooks.driver.get("https://demo.nopcommerce.com/wishlist");
        System.out.println("You have two products in your Wishlist table");
    }

}
