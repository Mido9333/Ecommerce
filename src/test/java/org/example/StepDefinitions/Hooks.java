package org.example.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P10_wishList;
import org.example.pages.P1_Registration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;

    P1_Registration P1_Registration = new P1_Registration();
    P10_wishList P10_wishList = new P10_wishList();
   static public String FirstName = "Testing";
    static public String LastName = "project";
    static public String dateOfBirth =  "01/01/1993";
    static public String gender =  "male";
    static public String companyName = "EcommerceTesting";
    static public String option = "True";
    static public String ValidEmail = "automationTesting12@gmail.com";
    static public String InvalidEmail = "automationTesting@123.com";
    static public String ValidPassword = "P@ssword";
    static public boolean CheckRegistration = false;

    @Before
    public void openBrowser(){

        //bridge
        String chromePath=System.getProperty("user.dir")+"\\chromedriver.exe";

        System.setProperty("webdriver.chorme.webdrive",
                chromePath);


        //create new object
        driver=new ChromeDriver();

        //configuration
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// 4- navigate to url
        driver.get("https://demo.nopcommerce.com/");

    }

    public static void sleep(int seconds) {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    // steps between features
    @Given("open home page again")
    public void open_home_page_again() {

        driver.get("https://demo.nopcommerce.com/");
    }


    @When("user enters email address")
    public void user_enters_email_address() throws InterruptedException {
        P1_Registration.getEmailAddress().clear();

        while (!(ValidEmail.contains("@")));


        P1_Registration.getEmailAddress().sendKeys(ValidEmail);
    }


    @When("user enters password")
    public void user_enters_password() {
        P1_Registration.getPassword().sendKeys(ValidPassword);
    }

    @Then("user pressed on Log-out link")
    public void user_pressed_on_Log_out_link() {
        P1_Registration.click_logoutButton().click();
    }

   @When("user scrolls down to products")
    public void user_scrolls_down_to_products() {
       JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("arguments[0].scrollIntoView();", P10_wishList.DisplayingSpecificProduct());
        Hooks.sleep(20);
    }

    @After
    public static void closeDriver() throws InterruptedException {
        Thread.sleep(200);
        driver.quit();
    }
}
