package StepDeff;

import UI.BasePage;
import UI.WebPage.OrangeHRM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInSteps extends BasePage {

    OrangeHRM orangeHRM;

    public LogInSteps() {
        this.orangeHRM = new OrangeHRM();
    }
    @Given("Open the Firefox and launch the application")
    public void openTheFirefoxAndLaunchTheApplication() throws Throwable {

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
