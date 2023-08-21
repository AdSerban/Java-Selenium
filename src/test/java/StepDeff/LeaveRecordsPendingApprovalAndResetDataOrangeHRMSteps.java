package StepDeff;

import UI.WebPage.OrangeHRM.HomePageOrangeHRM;
import UI.WebPage.OrangeHRM.LeaveOrangeHRM;
import UI.WebPage.OrangeHRM.OrangeHRM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeaveRecordsPendingApprovalAndResetDataOrangeHRMSteps {

    HomePageOrangeHRM homePageOrangeHRM;
    LeaveOrangeHRM leaveOrangeHRM;
    OrangeHRM orangeHRM;


    public LeaveRecordsPendingApprovalAndResetDataOrangeHRMSteps() {

        this.homePageOrangeHRM = new HomePageOrangeHRM();
        this.leaveOrangeHRM = new LeaveOrangeHRM();
        this.orangeHRM = new OrangeHRM();

    }
    @Given("I access OrangeHRM page - reset data")
    public void iAccessOrangeHRMPageResetData() {
        orangeHRM.goToOrangePage();
    }

    @When("I enter valid login credentials - reset data")
    public void iEnterValidLoginCredentialsResetData() {
        orangeHRM.putUserAndPass("Admin","admin123");
    }

    @And("I press the Login button to log into my account - reset data")
    public void iPressTheLoginButtonToLogIntoMyAccountResetData() {
        orangeHRM.clickLogin();
    }

    @And("I click the Leave link from the menu - reset data")
    public void iClickTheLeaveLinkFromTheMenuResetData() {
        homePageOrangeHRM.clickLeavePage();
    }

    @And("I select a period from {string} to {string}")
    public void iSelectAPeriodFromTo(String arg0, String arg1) {
        leaveOrangeHRM.fromAndToDateCalendarSimple(arg0, arg1);
    }

    @And("I select to see only leave with Pending Approval status - reset data")
    public void iSelectToSeeOnlyLeaveWithPendingApprovalStatusResetData() {
        leaveOrangeHRM.assertPendingStatus();

    }

    @And("I select Leave Type as CAN - Personal")
    public void iSelectLeaveTypeAsCANPersonal() {
        leaveOrangeHRM.selectCANPersonal();
    }

//    @And("I enter Anthony Nolan in the Employee Name field")
//    public void iEnterAnthonyNolanInTheEmployeeNameField() {
//        leaveOrangeHRM.fillEmployeeName();
//    }
    @And("I enter {string} in the Employee Name field")
    public void iEnterInTheEmployeeNameField(String arg0) {
        leaveOrangeHRM.fillEmployeeName(arg0);
    }

    @And("I press the Search button")
    public void iPressTheSearchButton() {
        leaveOrangeHRM.clickSearch();
    }

    @And("I click on the Reset button")
    public void iClickOnTheResetButton() {
        leaveOrangeHRM.clickReset();
    }

    @Then("I should see a pop-up message that says no records found")
    public void iShouldSeeAPopUpMessageThatSaysNoRecordsFound() {
        leaveOrangeHRM.getAlertLConfirmReset();
    }

}
