package StepDeff;

import WebPage.BrowserStack;
import WebPage.CalculatorPage;
import WebPage.OrangeHRM;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.BaseTests;
import utils.BrowserHelper;

import static org.openqa.selenium.support.PageFactory.initElements;

public class PlaceOrderSteps extends BaseTests {

    private BrowserHelper browserHelper = new BrowserHelper();
    private WebDriver driver;

        @Given("Customer navigates to the website")
    public void navigateToWebsite(){

        driver.get("http://www.shopping.com/");
        System.out.println(driver.getTitle());


    }

    @And("Customer login to his account")
    public void customerLogin(){
//        driver.findElement(By.id(“username”)).enterData(“username”);
//        driver.findElement(By.id(“password”)).enterData(“password”);
//        driver.findElement(By.id(“login”)).click();
    }

    @When("customer searches for laptop")
    public void searchForLaptop(){
//        driver.findElement(By.id(“searchBox”)).enterData(“Laptop”);
//        driver.findElement(By.id(“searchButton”)).click();
    }

    @And("clicks on add to cart button")
    public void clickAddToCart(){
//        driver.findElement(By.id(“addToCart”)).click();
    }

    @Then("Customer is redirected to cart page")
    public void redirectionToCartPage(){
//        Assert.assertTrue(driver.findElement(By.id(“cartPageHeader”)).isDisplayed());
    }

    @And("Customer is able to click the place order button")
    public void clickPlaceOrderButton(){
//        Assert.assertTrue(driver.findElement(By.id(“placeOrderButton”)).isClickable());

    }

}
