package org.example.pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P7_colorFilter {
    public static WebElement colorFilterProduct() {

        return Hooks.driver.findElement(By.id("attribute-option-15"));
    }

    public static WebElement colorCheckProduct() {

        return Hooks.driver.findElement(By.id("attribute-option-15"));
    }

}
