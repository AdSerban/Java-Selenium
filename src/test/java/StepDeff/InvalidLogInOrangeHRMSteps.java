package StepDeff;

import UI.BasePage;
import UI.WebPage.OrangeHRM.OrangeHRM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class InvalidLogInOrangeHRMSteps extends BasePage {

    OrangeHRM orangeHRM;
    String username = " ";
    String password = " ";

    public InvalidLogInOrangeHRMSteps() {

        this.orangeHRM = new OrangeHRM();
    }
    @When("I enter invalid login credentials")
    public void iEnterInvalidLoginCredentials() {
        orangeHRM.goToOrangePage();
        orangeHRM.putUserAndPass(username,password);
//        orangeHRM.setUsername("invalid");
//        orangeHRM.setPassword("invalid");
    }

    @And("I press the Login button to log into my account")
    public void iPressTheLoginButtonToLogIntoMyAccount() {

        orangeHRM.clickLogin();

    }

    @Then("I verify that an appropriate message is displayed for invalid credentials")
    public void iVerifyThatAnAppropriateMessageIsDisplayedForInvalidCredentials() {
        Assert.assertEquals("Invalid credentials", orangeHRM.getAlert());
    }

}
