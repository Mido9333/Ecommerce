package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P12_checkOut;
import org.openqa.selenium.support.ui.Select;

public class SD12_checkOut {
    P12_checkOut P12_checkOut = new P12_checkOut();
    public static String city = "Giza";
    public static String address1 = "Haram";
    public static String postCode = "12567";
    public static String phoneNo = "0129656598";
    public static String faxNo = "12345678";
    public static String cardHolderName = "mohamed Tolba";
    public static String cardNumber = "1455555555";
    public static String cardCode = "888";

    @And("open shopping page")
    public void open_shopping_page(){
        Hooks.driver.get("https://demo.nopcommerce.com/cart");
    }

    @When("user agrees with terms and proceed to Checkout")
    public void user_agrees_with_terms_and_proceed_to_Checkout()  {
        P12_checkOut.checkoutTerms().click();
        P12_checkOut.checkoutBtn().click();

        //System.out.println("Welcome in Checkout Page!");
    }

    @And("user types Billing address to Create Order")
    public void user_types_Billing_address_to_Create_Order() {
        // Enter First Name //
        P12_checkOut.orderDetails().click();
        P12_checkOut.checkoutFirstName().clear();
        P12_checkOut.checkoutFirstName().sendKeys(Hooks.FirstName);

        // Enter Last Name //
        P12_checkOut.checkoutLastName().click();
        P12_checkOut.checkoutLastName().clear();
        P12_checkOut.checkoutLastName().sendKeys(Hooks.LastName);

        // Write valid Email //
        P12_checkOut.checkoutEmail().click();
        P12_checkOut.checkoutEmail().clear();
        P12_checkOut.checkoutEmail().sendKeys(Hooks.ValidEmail);

        Select country = new Select(P12_checkOut.checkoutCountry());
        country.selectByVisibleText("Egypt"); //Select Country Name using visible text
        Hooks.sleep(5000);

        // Enter City //
        P12_checkOut.checkoutCity().click();
        P12_checkOut.checkoutCity().clear();
        P12_checkOut.checkoutCity().sendKeys(city);

        // Write Address_1 //
        P12_checkOut.checkoutAddress().click();
        P12_checkOut.checkoutAddress().clear();
        P12_checkOut.checkoutAddress().sendKeys(address1);

        // Enter Postal Code //
        P12_checkOut.checkoutPostalCode().click();
        P12_checkOut.checkoutPostalCode().clear();
        P12_checkOut.checkoutPostalCode().sendKeys(postCode);

        // Write Phone Number //
        P12_checkOut.checkoutPhoneNum().click();
        P12_checkOut.checkoutPhoneNum().clear();
        P12_checkOut.checkoutPhoneNum().sendKeys(phoneNo);

        // Write Fax Number //
        P12_checkOut.checkoutFaxNum().click();
        P12_checkOut.checkoutFaxNum().clear();
        P12_checkOut.checkoutFaxNum().sendKeys(faxNo);
    }

    @And("user confirms Billing address")
    public void user_confirms_Billing_address() {
        P12_checkOut.checkoutBillAddSaveBtn().click();
        Hooks.sleep(3000);
    }

    @And("user chooses Shipping Method to Continue")
    public void user_chooses_Shipping_Method_to_Continue() {

        P12_checkOut.checkoutShipMethod().click();


        P12_checkOut.checkoutShipMethodSaveBtn().click();
        Hooks.sleep(3000);
    }

    @And("user chooses Payment Method to Continue")
    public void user_chooses_Payment_Method_to_Continue() {

        P12_checkOut.payment_Method().click();


        P12_checkOut.PaymentMethSaveBtn().click();
        Hooks.sleep(3000);
    }

    @And("user fills out Payment Information")
    public void user_fills_out_Payment_Information() {

        Select card = new Select(P12_checkOut.CardType());
        card.selectByValue("MasterCard");

        P12_checkOut.cardHolderName().click();
        P12_checkOut.cardHolderName().clear();
        P12_checkOut.cardHolderName().sendKeys(cardHolderName);

        // Enter Card Number //
        P12_checkOut.cardNum().click();
        P12_checkOut.cardNum().clear();
        P12_checkOut.cardNum().sendKeys(cardNumber);


        Select month = new Select(P12_checkOut.CardExpMonth());
        month.selectByValue("8"); //Select Card Expiration Month from Value


        Select year = new Select(P12_checkOut.CardExpYear());
        year.selectByValue("2023"); //Select Card Expiration Year from Value

        // Write Card Code //
        P12_checkOut.CardCode().click();
        P12_checkOut.CardCode().clear();
        P12_checkOut.CardCode().sendKeys(cardCode);

        // Press CONTINUE //
        P12_checkOut.PaymentSaveBtn().click();

        System.out.println("Create Successful Order!");
    }

    @Then("user confirms his order")
    public void user_confirms_his_order() {
        P12_checkOut.confirmOrderBtn().click();
        System.out.println("Your order has been successfully processed!");
    }

    @And("user checks order details")
    public void user_checks_order_details() {
        // Click for order details //
        P12_checkOut.orderDetails().click();
        System.out.println("Title of page is: " + Hooks.driver.getTitle());
    }

    @And("user saves invoice")
    public void user_saves_invoice() {
        P12_checkOut.InvoiceSave().click();
        Hooks.sleep(3000);
        System.out.println("PDF Invoice has been downloaded Successfully");
    }

    @And("user prints invoice")
    public void user_prints_invoice() {
        P12_checkOut.InvoicePrint().click();
        Hooks.sleep(3000);
        System.out.println("Invoice has been printed Successfully");
    }

}
