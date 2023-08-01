package StepDeff;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrderSteps {



        @Given("Customer navigates to the website")
    public void navigateToWebsite(){
            System.out.println("Ceva");


    }

    @And("Customer login to his account")
    public void customerLogin(){
        System.out.println("Ceva");

    }

    @When("customer searches for laptop")
    public void searchForLaptop(){
        System.out.println("Ceva");

    }

    @And("clicks on add to cart button")
    public void clickAddToCart(){
        System.out.println("Ceva");
    }

    @Then("Customer is redirected to cart page")
    public void redirectionToCartPage(){
        System.out.println("Ceva");
    }

    @And("Customer is able to click the place order button")
    public void clickPlaceOrderButton(){
//        Assert.assertTrue(driver.findElement(By.id(“placeOrderButton”)).isClickable());

    }

}
