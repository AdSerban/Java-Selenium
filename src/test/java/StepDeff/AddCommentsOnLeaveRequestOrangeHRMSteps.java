package StepDeff;

import UI.WebPage.OrangeHRM.HomePageOrangeHRM;
import UI.WebPage.OrangeHRM.LeaveOrangeHRM;
import UI.WebPage.OrangeHRM.MyInfoOrangeHRM;
import UI.WebPage.OrangeHRM.OrangeHRM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddCommentsOnLeaveRequestOrangeHRMSteps {

    HomePageOrangeHRM homePageOrangeHRM;
    LeaveOrangeHRM leaveOrangeHRM;
    OrangeHRM orangeHRM;


    public AddCommentsOnLeaveRequestOrangeHRMSteps() {

        this.homePageOrangeHRM = new HomePageOrangeHRM();
        this.leaveOrangeHRM = new LeaveOrangeHRM();
        this.orangeHRM = new OrangeHRM();

    }
    @Given("I access OrangeHRM page - add comment")
    public void iAccessOrangeHRMPageAddComment() {
        orangeHRM.goToOrangePage();
    }

    @When("I enter valid login credentials - add comment")
    public void iEnterValidLoginCredentialsAddComment() {
        orangeHRM.putUserAndPass("Admin","admin123");
    }

    @And("I press the Login button to log into my account - add comment")
    public void iPressTheLoginButtonToLogIntoMyAccountAddComment() {
        orangeHRM.clickLogin();
    }

    @And("I click the Leave link from the menu - add comment")
    public void iClickTheLeaveLinkFromTheMenuAddComment() {
        homePageOrangeHRM.clickLeavePage();
    }

    @And("I click on the button with three dots which is located in the left corner for an employee record")
    public void iClickOnTheButtonWithThreeDotsWhichIsLocatedInTheLeftCornerForAnEmployeeRecord() {
        leaveOrangeHRM.clickOnThreeDots();
    }

    @And("I select to Add Comment from that list")
    public void iSelectToAddCommentFromThatList() {
        leaveOrangeHRM.addComent();
    }

    @And("I enter a comment in the Leave Request Comments section")
    public void iEnterACommentInTheLeaveRequestCommentsSection() {
        leaveOrangeHRM.fillComentArea();
    }

    @And("I save the comment")
    public void iSaveTheComment() {
        leaveOrangeHRM.saveComent();
    }

    @Then("I should be able to see the confirmation message that the comment was added successfully")
    public void iShouldBeAbleToSeeTheConfirmationMessageThatTheCommentWasAddedSuccessfully() {
        leaveOrangeHRM.getAlertConfirmComment();
    }
}
