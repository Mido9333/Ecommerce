package org.example.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P4_Search;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SD04_Search {
    P4_Search P4_Search = new P4_Search();

    public static String store = "";

    @When("user clicks on search box")
    public void user_clicks_search_box() {
        P4_Search.clickSearchBox().click();
    }

    @When("write {string} in the search box")
    public void searchBox(String searchTerm) {
        P4_Search.Search_statment().sendKeys(searchTerm);
        store = searchTerm;
    }

    @When("user clicks on search button")
    public void user_clicks_search_button() {
        P4_Search.Press_searchBtn().click();
    }

    @Then("find all related products")
    public void user_will_find_all_related_products() {
        List<WebElement> results = P4_Search.Display_AllResults();
        for (int i = 0; i < results.size(); i++) {
            Assert.assertTrue(results.get(i).getText().toLowerCase().contains(store),
                    "Search result validation failed at [ + i + ].");

        }
    }

    @Then("user will find {string}")
    public void user_will_find(String expectedResult) {
        SoftAssert softAssert = new SoftAssert();
        String actual = Hooks.driver.findElement(By.cssSelector("div[class=\"details\"]")).getText();
        softAssert.assertTrue(actual.contains(expectedResult), "Not found product");
        softAssert.assertAll();
    }
}
