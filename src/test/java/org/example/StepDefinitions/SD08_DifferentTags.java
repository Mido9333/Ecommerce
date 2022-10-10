package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P8_DifferentTags;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class SD08_DifferentTags {
    P8_DifferentTags P8_DifferentTags = new P8_DifferentTags();

    @When("user choose a popular tag")
    public void select_popular_tag() {
        P8_DifferentTags.select_coolTag().click();

        Hooks.sleep(8);

        String actualResult = P8_DifferentTags.select_itemPage().getText();

        String expectedResult = "Products tagged with 'cool'";

        Assert.assertEquals(actualResult, expectedResult, "Assertion False: ");

    }

    @And("user will find products")
    public void find_products() {

        List<WebElement> CoolPageCount = new ArrayList<>();
        CoolPageCount.add(P8_DifferentTags.GetCoolPageCount());

        List<WebElement> CoolAsser = new ArrayList<>();
        CoolAsser.add(P8_DifferentTags.CoolAssertDisplay());

        Assert.assertTrue(CoolPageCount.size() > 0);

        ArrayList<String> firstProductList = new ArrayList<>();

        for (int x = 0; x < CoolPageCount.size(); x++) {
            firstProductList.add(CoolPageCount.get(x).getText());
            Assert.assertTrue(CoolAsser.get(x).getText().toUpperCase().contains("ADD TO CART"), "Error Message: Cool Products Not Found");
        }
    }

    @Then("user choose a different tag")
    public void select_a_different_tag() {
        P8_DifferentTags.shirtTag().click();

        String actualResult = P8_DifferentTags.shirtTag().getText();

        Hooks.sleep(8);

        String expectedResult = "shirt";
        Assert.assertEquals(actualResult, expectedResult, "Error Message: There are No Products");
    }

    @And("user will find different products")
    public void find_another_different_products() {
        List<WebElement> ShirtCount = new ArrayList<>();
        ShirtCount.add(P8_DifferentTags.GetShirtCount());

        List<WebElement> ShirtAsser = new ArrayList<>();
        ShirtAsser.add(P8_DifferentTags.DisplayShirtAssert());


        Assert.assertTrue(ShirtCount.size() > 0);

        ArrayList<String> secondProductList = new ArrayList<>();

        for (int x = 0; x < ShirtCount.size(); x++) {
            System.out.println(ShirtCount.get(x).getText());
            secondProductList.add(ShirtCount.get(x).getText());
            Assert.assertTrue(ShirtAsser.get(x).getText().contains("Shirt"), "Error Message: Shirt Products Not Found");
        }
    }
}