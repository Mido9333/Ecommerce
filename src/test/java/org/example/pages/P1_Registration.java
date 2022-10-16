package org.example.pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P1_Registration {
    public WebElement registerlink()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public static WebElement getFirstName() {

        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public static WebElement getLastName() {

        return Hooks.driver.findElement(By.id("LastName"));
    }

    public static WebElement getMaleGender() {
        return Hooks.driver.findElement(By.id("gender-male"));
    }

    public static WebElement getFemaleGender() {
        return Hooks.driver.findElement(By.id("gender-female"));
    }

    public static WebElement getEmailAddress() {
        return Hooks.driver.findElement(By.id("Email"));

    }

    public static Select getBirthdateDay() {

      WebElement dayOfDOB = Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
        Select daychoosing = new Select(dayOfDOB);
       return daychoosing;
    }

    public static Select getBirthdateMonth() {
        WebElement monthOfDOB = Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
        Select monthChoosing = new Select(monthOfDOB);
        return monthChoosing;
    }

    public static Select getBirthdateYear() {
        WebElement yearOfDOB = Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
        Select yearChoosing = new Select(yearOfDOB);
        return yearChoosing;
    }

    public static WebElement getPassword() {

        return Hooks.driver.findElement(By.id("Password"));
    }

    public static WebElement getConfirmPassword() {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public static WebElement getCompanyName() {
        return Hooks.driver.findElement(By.cssSelector("input[name=\"Company\"]"));

    }

    public static WebElement newsLetter() {
        return Hooks.driver.findElement(By.cssSelector("input[id=\"Newsletter\"]"));

    }

    public static WebElement clickRegister() {
        return Hooks.driver.findElement(By.id("register-button"));
    }

    //resgistration done

    public static WebElement messageDisplayed() {
        return Hooks.driver.findElement(By.className("result"));
    }

    public static WebElement click_continue() {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"button-1 register-continue-button\"]"));
    }

    public static WebElement click_logoutLink() {
        return Hooks.driver.findElement(By.className("ico-logout"));
    }

    public static WebElement click_logoutButton() {
        return Hooks.driver.findElement(By.className("ico-logout"));
    }

}
