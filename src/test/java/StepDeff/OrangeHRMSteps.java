package StepDeff;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OrangeHRMSteps {

    @Given("I navigate to OrangeHRM")
    public void iNavigateToOrangeHRM() {

    }

    @And("I enter the username as {string} and password as {string}")
    public void iEnterTheUsernameAsAndPasswordAs(String arg0, String arg1) {

        //System.out.println("username is: " + arg0 + "pass is " + arg1);
    }

    @And("I click on Login button")
    public void iClickOnLoginButton() {
    }

    @Then("I verified the WebPageName")
    public void iVerifiedTheWebPageName() {

        String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";

    }

}
