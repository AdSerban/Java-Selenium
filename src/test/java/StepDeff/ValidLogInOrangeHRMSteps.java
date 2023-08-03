package StepDeff;

import UI.BasePage;
import UI.WebPage.HomePageOrangeHRM;
import UI.WebPage.OrangeHRM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ValidLogInOrangeHRMSteps extends BasePage {


    OrangeHRM orangeHRM;
    HomePageOrangeHRM homePageOrangeHRM;

    public ValidLogInOrangeHRMSteps() {
        this.orangeHRM = new OrangeHRM();
        this.homePageOrangeHRM = new HomePageOrangeHRM();
    }

    @Given("I access OrangeHRM page")
    public void iAccessHttpsOpenSourceDemoOrangeHRMComPage() {

        orangeHRM.goToOrangePage();
    }

    @When("I enter valid login credentials")
    public void iEnterValidLoginCredentials() {

        orangeHRM.putUserAndPass("Admin","admin123");
    }

    @Then("I verify that I am logged into my account by checking that the username is displayed in the navigation bar in the right corner of the application by using XPath selector")
    public void iVerifyThatIAmLoggedIntoMyAccountByCheckingThatTheUsernameIsDisplayedInTheNavigationBarInTheRightCornerOfTheApplicationByUsingXPathSelector() {



        // ceva nu merge la expected. am un cod dubios la username + xPath
        Assert.assertEquals("abcdefgh Collingkjhkjhk",homePageOrangeHRM.getText());

    }
}
