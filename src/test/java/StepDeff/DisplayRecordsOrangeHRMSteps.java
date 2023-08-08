package StepDeff;

import UI.WebPage.HomePageOrangeHRM;
import UI.WebPage.LeaveOrangeHRM;
import UI.WebPage.OrangeHRM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisplayRecordsOrangeHRMSteps {

    OrangeHRM orangeHRM;
    HomePageOrangeHRM homePageOrangeHRM;
    LeaveOrangeHRM leaveOrangeHRM;

    public DisplayRecordsOrangeHRMSteps() {

        this.orangeHRM = new OrangeHRM();
        this.homePageOrangeHRM = new HomePageOrangeHRM();
        this.leaveOrangeHRM = new LeaveOrangeHRM();

    }
    @Given("I access OrangeHRM page - Display Records")
    public void iAccessOrangeHRMPageDisplayRecords() {
        orangeHRM.goToOrangePage();
    }

    @When("I enter valid login credentials - Display Records")
    public void iEnterValidLoginCredentialsDisplayRecords() {
        orangeHRM.putUserAndPass("Admin","admin123");
    }

    @And("I press the Login button to log into my account - Display Records")
    public void iPressTheLoginButtonToLogIntoMyAccountDisplayRecords() {
        orangeHRM.clickLogin();
    }

    @And("I click the Leave link from the menu - Display Records")
    public void iClickTheLeaveLinkFromTheMenuDisplayRecords() {
        homePageOrangeHRM.clickLeavePage();
    }

    @And("I click on the Leave List option")
    public void iClickOnTheLeaveListOption() {

    }

    @And("I select Rejected status by filtering from Show Leave section")
    public void iSelectRejectedStatusByFilteringFromShowLeaveSection() {
        leaveOrangeHRM.checkAndClick();
    }

    @Then("I check that the Rejected status is present as a selection - Display Records")
    public void iCheckThatTheRejectedStatusIsPresentAsASelectionDisplayRecords() {
        leaveOrangeHRM.assertThat();
    }
}
