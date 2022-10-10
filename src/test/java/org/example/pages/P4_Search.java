package org.example.pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P4_Search {
    public static WebElement clickSearchBox() {

        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public static WebElement Press_searchBtn() {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    public static WebElement Search_statment() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public static List<WebElement> Display_AllResults() {
        return Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
    }
}
