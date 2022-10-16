package org.example.pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P12_checkOut {


    public static WebElement checkoutTerms(){

        return Hooks.driver.findElement(By.xpath("//div[@class=\"terms-of-service\"]/input"));
    }

    public static WebElement CardExpMonth(){

        return Hooks.driver.findElement(By.xpath("//select[@id=\"ExpireMonth\"]"));
    }

    public static WebElement CardExpYear(){

        return Hooks.driver.findElement(By.xpath("//select[@id=\"ExpireYear\"]"));
    }

    public static WebElement CardCode(){

        return Hooks.driver.findElement(By.xpath("//input[@id=\"CardCode\"]"));
    }

    public static WebElement PaymentSaveBtn(){

        return Hooks.driver.findElement(By.xpath("//button[@onclick=\"PaymentInfo.save()\"]"));
    }

    public static WebElement confirmOrderBtn(){

        return Hooks.driver.findElement(By.cssSelector("button[onclick=\"ConfirmOrder.save()\"]"));
    }

    public static WebElement orderDetails(){

        return Hooks.driver.findElement(By.partialLinkText("details"));
    }

    public static WebElement InvoiceSave(){

        return Hooks.driver.findElement(By.xpath("//a[@class=\"button-2 pdf-invoice-button\"]"));
    }

    public static WebElement InvoicePrint(){

        return Hooks.driver.findElement(By.xpath("//a[@class=\"button-2 print-order-button\"]"));
    }

    public static WebElement checkoutFirstName(){

        return Hooks.driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_FirstName\"]"));
    }

    public static WebElement checkoutLastName(){

        return Hooks.driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_LastName\"]"));
    }

    public static WebElement checkoutEmail(){

        return Hooks.driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_Email\"]"));
    }

    public static WebElement checkoutCountry(){

        return Hooks.driver.findElement(By.xpath("//select[@name=\"BillingNewAddress.CountryId\"]"));
    }

    public static WebElement checkoutCity(){

        return Hooks.driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_City\"]"));
    }

    public static WebElement checkoutAddress(){

        return Hooks.driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_Address1\"]"));
    }

    public static WebElement checkoutPostalCode(){

        return Hooks.driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_ZipPostalCode\"]"));
    }

    public static WebElement checkoutPhoneNum(){

        return Hooks.driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]"));
    }

    public static WebElement checkoutFaxNum(){

        return Hooks.driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_FaxNumber\"]"));
    }

    public static WebElement checkoutBillAddSaveBtn(){

        return Hooks.driver.findElement(By.xpath("//button[@onclick=\"Billing.save()\"]"));
    }

    public static WebElement checkoutShipMethod(){

        return Hooks.driver.findElement(By.xpath("//ul[@class=\"method-list\"]/li[2]/div[1]/input"));
    }

    public static WebElement checkoutBtn(){

        return Hooks.driver.findElement(By.xpath("//div[@class=\"checkout-buttons\"]/button"));
    }

    public static WebElement checkoutShipMethodSaveBtn(){

        return Hooks.driver.findElement(By.xpath("//button[@onclick=\"ShippingMethod.save()\"]"));
    }

    public static WebElement payment_Method(){

        return Hooks.driver.findElement(By.cssSelector("input[id=\"paymentmethod_1\"]"));
    }

    public static WebElement PaymentMethSaveBtn(){

        return Hooks.driver.findElement(By.xpath("//button[@onclick=\"PaymentMethod.save()\"]"));
    }

    public static WebElement CardType(){

        return Hooks.driver.findElement(By.className("dropdownlists"));
    }

    public static WebElement cardHolderName(){

        return Hooks.driver.findElement(By.xpath("//input[@id=\"CardholderName\"]"));
    }

    public static WebElement cardNum(){

        return Hooks.driver.findElement(By.xpath("//input[@id=\"CardNumber\"]"));
    }

}
