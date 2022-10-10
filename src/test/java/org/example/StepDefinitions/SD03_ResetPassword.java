package org.example.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P3_ResetPassword;
import org.testng.Assert;

public class SD03_ResetPassword {
    P3_ResetPassword P3_ResetPassword = new P3_ResetPassword();

    @When("user click on forgot password")
    public void clickForget() {
        P3_ResetPassword.click_ForgetPassword().click();
    }

    @When("user clicks on Recover button")
    public void click_recover() {
        P3_ResetPassword.click_recoverButton().click();
    }

    @Then("display message \"Email with instructions has been sent to you.\"at the top")
    public void Display_message_instructions() {
        String expectedResult = "Email with instructions has been sent to you.";
        Assert.assertTrue(P3_ResetPassword.Message_displayed().getText().contains(expectedResult));
    }
}
