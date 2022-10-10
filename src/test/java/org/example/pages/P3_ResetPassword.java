package org.example.pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P3_ResetPassword {
    public static WebElement click_ForgetPassword() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
    }

    public static WebElement click_recoverButton() {
        return Hooks.driver.findElement((By.cssSelector("button[class=\"button-1 password-recovery-button\"]")));
    }

    public static WebElement Message_displayed() {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }
}
