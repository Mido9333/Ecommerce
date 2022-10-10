package org.example.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P5_currencies;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class SD05_currencies {
    P5_currencies P5_currencies = new P5_currencies();

    @When("user choose from currency list")
    public void user_chooses_from_currency_dropdown_list() {
        if (P5_currencies.choose_fromList().isEnabled() &&
                P5_currencies.choose_fromList().isDisplayed()) {
            System.out.println("List is Enabled");
        } else {
            System.out.println("List is not Visible");
        }

        Select select = new Select(P5_currencies.choose_fromList());
        select.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }

    @Then("verification from currency")
    public void verificationProcess_from_currency() {
        SoftAssert productAssert = new SoftAssert();
        String expectedResult = "€";
        for (int i = 0; i < P5_currencies.Choose_product_price().size(); i++) {
            productAssert.assertEquals(P5_currencies.Choose_product_price().get(i).getText().substring(0, 1), expectedResult, "Error found different currency");
            productAssert.assertAll();

        }
    }
}
