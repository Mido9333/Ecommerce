package org.example.pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P10_wishList {
    public static WebElement DisplayingSpecificProduct() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"product-grid home-page-product-grid\"]"));
    }

    public static WebElement click_wishlistIcon() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[3]"));
    }

    public static void ChoosingProcessorType() {
        Select select = new Select( Hooks.driver.findElement(By.id("product_attribute_1")));
        select.selectByValue("1");
    }

    public static void choose_OS() {

        Hooks.driver.findElement(By.id("product_attribute_4_9")).click();
    }

    public static void Choose_Software() {
        Hooks.driver.findElement(By.id("product_attribute_5_11")).click();
        Hooks.driver.findElement(By.id("product_attribute_5_12")).click();
    }

    public static void Choose_RAM() {
        Select select = new Select(Hooks.driver.findElement(By.id("product_attribute_2")));
        select.selectByValue("5");
    }

    public static void Choose_HDD() {
        Hooks.driver.findElement(By.id("product_attribute_3_7")).click();
    }

    public static WebElement click_wishListButton() {
        return Hooks.driver.findElement(By.id("add-to-wishlist-button-1"));
    }

    public static WebElement displayedMessage() {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }

    public static WebElement addSecondProduct(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[3]/div[1]/div[2]/div[3]/div[2]/button[3]"));
    }

    public static WebElement secondProdAssertDisplayed(){
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }

}
