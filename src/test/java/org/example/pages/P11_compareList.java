package org.example.pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P11_compareList {

    public static WebElement compareProd1() {
        return Hooks.driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[1]/div[1]/div[2]/div[3]/div[2]/button[2]"));
    }

    public static WebElement compareProd1Assert() {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }

    public static WebElement compareProd2() {
        return Hooks.driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[2]/div[1]/div[2]/div[3]/div[2]/button[2]"));
    }

    public static WebElement compareProd2Assert() {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }

    public static WebElement compareProd3() {
        return Hooks.driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[3]/div[1]/div[2]/div[3]/div[2]/button[2]"));
    }

    public static WebElement compareProd3Assert() {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }

    public static WebElement compareCheck() {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"picture\"]"));
    }
    public static WebElement compareProdClear() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[4]/button"));
    }

    public static WebElement deleteList() {
        return Hooks.driver.findElement(By.xpath("//div[@class=\"page-body\"]/a"));
    }

    public static WebElement compareDeleteAssert() {
        return Hooks.driver.findElement(By.xpath("//div[@class=\"page-body\"]/div"));
    }

    public static WebElement GoToCompareProduct(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/compareproducts\"]"));
    }
}
