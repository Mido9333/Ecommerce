package org.example.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P6_Category;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class SD06_Catrgory {
    P6_Category P6_Category = new P6_Category();

    SoftAssert verificationLink = new SoftAssert();

    @When("user choose category")
    public void select_category() {
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(P6_Category.ChooseMenu());
        actions.moveToElement(P6_Category.ChooseSubMenu());

        Hooks.sleep(20);

        actions.click().build().perform();
    }

    @Then("user return to the category that choosen")
    public void selected_category_choosen() {
        String expectedResult = "https://demo.nopcommerce.com/shoes";
        verificationLink.assertEquals(Hooks.driver.getCurrentUrl(), expectedResult, "Wrong Page");
        verificationLink.assertAll();
    }

}
