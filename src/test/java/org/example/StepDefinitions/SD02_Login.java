package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P2_Login;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class SD02_Login {
    public static SoftAssert verifyLogin = new SoftAssert();
    P2_Login P2_Login=new P2_Login();

    @Given("user had an actual account")
    public void user_had_account() {
        Assert.assertTrue(!(Hooks.ValidEmail.isEmpty() && Hooks.CheckRegistration),
                "There's no valid account registered yet");
    }
    @When("user pressed on Log-in link in the header")
    public void click_login_link() {
        P2_Login.clickLogInLink().click();
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/login?returnUrl=%2F", "Wrong Log In Link");
        Hooks.sleep(20);
    }
    @And("user enters email address in login page")
    public void entering_email() {
        P2_Login.getEmail().sendKeys(Hooks.ValidEmail);
    }
    @And("user enters invalid email address in login page")
    public void entering_Invalid_email() {
        P2_Login.getEmail().sendKeys(Hooks.InvalidEmail);
    }

    @And("user enters password")
    public void user_enters_password() {
        P2_Login.getPassword().sendKeys(Hooks.ValidPassword);
    }
    @When("user pressed on Log-in button")
    public void click_Login_button() {
        P2_Login.click_login_button().click();
        Hooks.sleep(20);
    }
    @Then("user could not login successfully")
    public void wrong_login() {

        String expectedResult = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]")).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals("Error Message : Text Is Wrong", actualResult.contains(expectedResult));
    }
    @Then("user could login successfully")
    public void user_log_in_successfully() {
        String expectedResult = "https://demo.nopcommerce.com/";
        verifyLogin.assertEquals(Hooks.driver.getCurrentUrl(), expectedResult, "Process Failed 1");
        verifyLogin.assertTrue(P2_Login.Account_displayed().isDisplayed(), "Process Failed 2");
        verifyLogin.assertAll();
    }

}
