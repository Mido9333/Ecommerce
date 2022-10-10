package org.example.pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P2_Login {
    public static WebElement clickLogInLink() {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }

    public static WebElement click_login_button() {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }

    public static WebElement getEmail() {

        return Hooks.driver.findElement(By.id("Email"));
    }
    public static WebElement getPassword() {

        return Hooks.driver.findElement(By.id("password"));
    }
    public static WebElement Account_displayed() {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }
}
