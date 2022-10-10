package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P11_compareList;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class SD11_compareList {
    P11_compareList P11_compareList = new P11_compareList();

    @Given("user adds First Product to CompareList")
    public void user_adds_First_Product_to_CompareList(){
        P11_compareList.compareProd1().click();

        Assert.assertTrue(P11_compareList.compareProd1Assert().isDisplayed());
        Hooks.sleep(10);
        System.out.println("First product has been added to your productComparison");
    }

    @And("user adds Second Product to CompareList")
    public void user_adds_Second_Product_to_CompareList() {
        P11_compareList.compareProd2().click();

        Assert.assertTrue(P11_compareList.compareProd2Assert().isDisplayed());
        Hooks.sleep(10);
        System.out.println("Second product has been added to your productComparison");
    }

    @And("user adds Third Product to CompareList")
    public void user_adds_Third_Product_to_CompareList()  {

        P11_compareList.compareProd3().click();

        Assert.assertTrue(P11_compareList.compareProd3Assert().isDisplayed());
        Hooks.sleep(10);
        System.out.println("Third product has been added to your productComparison");
    }

    @When("user goes to Compare Products")
    public void user_goes_to_CompareProductsList() {

        P11_compareList.GoToCompareProduct().click();
    }

    @Then("user compares between the choosen products")
    public void user_compares_between_the_chooesedProducts() {
        List<WebElement> elements = new ArrayList<>();
        elements.add(P11_compareList.compareCheck());

        // Check Compare products
        int quantity = elements.size();
        System.out.println(quantity);
        Assert.assertTrue(quantity > 0);

        for (int i = 0; i < quantity ; i++) {
            System.out.println(elements.get(i).isDisplayed());
            Assert.assertTrue(elements.get(i).isDisplayed());
        }

    }

    @And("user clears a product from compareList")
    public void user_clears_a_product_from_compareList() {
        P11_compareList.compareProdClear().click();

    }

    @And("user deletes all the Products choosen")
    public void user_deletes_all_the_choosedProducts() {

        P11_compareList.deleteList().click();
        // Check deleted list //
        String actualResult = P11_compareList.compareDeleteAssert().getText();
        Hooks.sleep(3);

        String expectedResult = "You have no items to compare.";
        Assert.assertEquals(actualResult, expectedResult, "ERROR: Assertion False!");

    }
}
