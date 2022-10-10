package org.example.pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P9_shoppingCart {
    public static WebElement chooseProduct() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]"));
    }

    public static WebElement addProductButton() {
        return Hooks.driver.findElement(By.id("add-to-cart-button-4"));
    }

    public static WebElement displayedMessage() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
}
