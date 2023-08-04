package StepDeff;

import UI.BasePage;
import UI.WebPage.HomePageOrangeHRM;
import UI.WebPage.LeaveOrangeHRM;
import UI.WebPage.OrangeHRM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.is.En;


public class RejectedStatusOrangeHRMSteps extends BasePage {


    HomePageOrangeHRM homePageOrangeHRM;
    LeaveOrangeHRM leaveOrangeHRM;
    OrangeHRM orangeHRM;



    public RejectedStatusOrangeHRMSteps() {

        this.homePageOrangeHRM = new HomePageOrangeHRM();
        this.leaveOrangeHRM = new LeaveOrangeHRM();
        this.orangeHRM = new OrangeHRM();


    }

    @Given("I access OrangeHRM page A")
    public void iAccessOrangeHRMPageA() {
        orangeHRM.goToOrangePage();
    }

    @When("I enter valid login credentials A")
    public void iEnterValidLoginCredentialsA() {
        orangeHRM.putUserAndPass("Admin","admin123");

    }

    @And("I press the Login button to log into my account A")
    public void iPressTheLoginButtonToLogIntoMyAccountA() {
        orangeHRM.clickLogin();
    }
    @And("I click the Leave link from the menu")
    public void iClickTheLeaveLinkFromTheMenu() {

        homePageOrangeHRM.clickLeavePage();
    }

    @And("I select the Rejected status from the Show Leave with Status section")
    public void iSelectTheRejectedStatusFromTheShowLeaveWithStatusSection() {

        leaveOrangeHRM.checkAndClick();

    }

    @Then("I check that the Rejected status is present as a selection by using XPath selector")
    public void iCheckThatTheRejectedStatusIsPresentAsASelectionByUsingXPathSelector() {

        leaveOrangeHRM.assertThat();
    }


}
