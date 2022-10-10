package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P7_colorFilter;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static org.example.pages.P6_Category.ChooseMenu;
import static org.example.pages.P6_Category.ChooseSubMenu;

public class SD07_colorFilter {
    P7_colorFilter P7_colorFilter = new P7_colorFilter();

    @When("user choose Category then hover to open sub-Category")
    public void Hoover_sub_category() throws InterruptedException {
        Actions act = new Actions(Hooks.driver);
        act.moveToElement(ChooseMenu()).moveToElement(ChooseSubMenu()).click().build().perform();
    }

    @And("user can filter sub-Category with color")
    public void user_filter_subcategory() {
        P7_colorFilter.colorFilterProduct().click();
    }

    @Then("user will find product with the selected color")
    public void product_found_withColor() {
        Hooks.sleep(15);
        Assert.assertTrue(P7_colorFilter.colorCheckProduct().isDisplayed(),
                "Error Message: Selected Color Not Found!");
        //System.out.println("Color Selected: Red Shoes");
    }

}
