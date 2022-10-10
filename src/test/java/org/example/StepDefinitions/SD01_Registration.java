package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P1_Registration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SD01_Registration {
    P1_Registration P1_Registration = new P1_Registration();
    @When("user pressed on Register link")
    public void click_Register_link(){
        P1_Registration.registerlink().click();
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/register?returnUrl=%2F", "Wrong Registration Link");
        Hooks.sleep(20);
    }

    @When("user chooses gender")
    public void choose_gender() {
        if (Hooks.gender.equalsIgnoreCase("male")) {
            P1_Registration.getMaleGender().click();
        }
        if (Hooks.gender.equalsIgnoreCase("female")) {
            P1_Registration.getFemaleGender().click();
        }
    }

    @When("user enters first name")
    public void enter_first_name() {
        P1_Registration.getFirstName().clear();
        P1_Registration.getFirstName().sendKeys(Hooks.FirstName);
    }

    @When("user enters last name")
    public void enter_last_name() {
        P1_Registration.getLastName().clear();
        P1_Registration.getLastName().sendKeys(Hooks.LastName);
    }

    @When("user chooses birth of date")
    public void DOB_choose() {
        String[] dateField = Hooks.dateOfBirth.split("/");

        P1_Registration.getBirthdateDay().selectByValue(dateField[0]);
        P1_Registration.getBirthdateMonth().selectByValue(dateField[1]);
        P1_Registration.getBirthdateYear().selectByValue(dateField[2]);
    }

    @When("user enters company name")
    public void enter_companyName() {
        P1_Registration.getCompanyName().sendKeys(Hooks.companyName);
    }

    @When("user chooses Newsletter option")
    public void chooses_newsletter() throws InterruptedException {
        boolean isDisplayed = P1_Registration.newsLetter().isSelected();
        if (Hooks.option.equalsIgnoreCase("true") && isDisplayed == false) {
            P1_Registration.newsLetter().click();

        } else if (Hooks.option.equalsIgnoreCase("false") && isDisplayed == true) {
            P1_Registration.newsLetter().click();

        } else


            Hooks.sleep(20);
    }

    @When("user enters confirm password")
    public void confirm_password() {
        P1_Registration.getConfirmPassword().sendKeys(Hooks.ValidPassword);
    }

    @When("user pressed on REGISTER button")
    public void press_register_button() throws InterruptedException {
        P1_Registration.clickRegister().click();
        Hooks.sleep(20);
    }

    @Then("user log-in successfully and log-out link appears in the header")
    public void log_out_link_appears() {
        Hooks.verifyRegistration.assertTrue(P1_Registration.click_logoutLink().isDisplayed(), "Registration Process Failed_2");
        Hooks.verifyRegistration.assertAll();
        Hooks.CheckRegistration = true;
    }

    @Then("display {string} message to user")
    public void display_message(String expectedResult) {
        String actualResult = P1_Registration.messageDisplayed().getText();
        Hooks.verifyRegistration.assertTrue(actualResult.contains(expectedResult), "Registration Failed");
        Hooks.verifyRegistration.assertAll();
        P1_Registration.click_continue().click();
    }

}
