package StepDeff;

import UI.WebPage.OrangeHRM.HomePageOrangeHRM;
import UI.WebPage.OrangeHRM.LeaveOrangeHRM;
import UI.WebPage.OrangeHRM.OrangeHRM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VacationLeaveRecordsOrangeHRMSteps {

    OrangeHRM orangeHRM;
    HomePageOrangeHRM homePageOrangeHRM;
    LeaveOrangeHRM leaveOrangeHRM;

    public VacationLeaveRecordsOrangeHRMSteps() {

        this.orangeHRM = new OrangeHRM();
        this.homePageOrangeHRM = new HomePageOrangeHRM();
        this.leaveOrangeHRM = new LeaveOrangeHRM();

    }
    @Given("I access OrangeHRM page - Vacation leave records")
    public void iAccessOrangeHRMPageVacationLeaveRecords() {
        orangeHRM.goToOrangePage();
    }

    @When("I enter valid login credentials - Vacation leave records")
    public void iEnterValidLoginCredentialsVacationLeaveRecords() {
        orangeHRM.putUserAndPass("Admin","admin123");
    }

    @And("I press the Login button to log into my account - Vacation leave records")
    public void iPressTheLoginButtonToLogIntoMyAccountVacationLeaveRecords() {
        orangeHRM.clickLogin();
    }

    @And("I click the Leave link from the menu - Vacation leave records")
    public void iClickTheLeaveLinkFromTheMenuVacationLeaveRecords() {
        homePageOrangeHRM.clickLeavePage();
    }

    @And("I select a specific period for which I want to see the records")
    public void iSelectASpecificPeriodForWhichIWantToSeeTheRecords() {
        leaveOrangeHRM.fromDateCalendar();
        leaveOrangeHRM.toDateCalendar();
    }

    @And("I select to see only leave with Pending Approval status")
    public void iSelectToSeeOnlyLeaveWithPendingApprovalStatus() {
        leaveOrangeHRM.assertPendingStatus();
    }

    @And("I set Leave Type as US - Vacation")
    public void iSetLeaveTypeAsUSVacation() {
        leaveOrangeHRM.selectUSVacation();
    }

    @And("I press search button")
    public void iPressSearchButton() {
        leaveOrangeHRM.clickSearch();
    }

    @Then("I should see all the records with all the data entered")
    public void iShouldSeeAllTheRecordsWithAllTheDataEntered() {
        leaveOrangeHRM.assertIfTheRecordsExist();
    }
}
