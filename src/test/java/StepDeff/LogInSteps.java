package StepDeff;

import UI.BasePage;
import UI.WebPage.OrangeHRM.OrangeHRM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInSteps extends BasePage {

    OrangeHRM orangeHRM;

    public LogInSteps() {
        this.orangeHRM = new OrangeHRM();
    }
    @Given("Open the Chrome and launch the application")
    public void openTheChromeAndLaunchTheApplication() throws Throwable {

        orangeHRM.goToOrangePage();
    }

    @When("Enter the Username and Password")
    public void enterTheUsernameAndPassword$() throws Throwable {


        orangeHRM.loginInPage();

    }

    @Then("Reset the credential")
    public void resetTheCredential() throws Throwable {

        orangeHRM.switchPage();

    }
}
