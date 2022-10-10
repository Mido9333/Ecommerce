package org.example.pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P5_currencies {
    public static List<WebElement> Choose_product_price() {
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }

    public static WebElement choose_fromList() {

        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

}
