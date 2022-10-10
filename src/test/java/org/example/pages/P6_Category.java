package org.example.pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P6_Category {
    public static WebElement ChooseMenu() {

        return Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));
    }

    public static WebElement ChooseSubMenu() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/shoes\"]"));
    }
}
