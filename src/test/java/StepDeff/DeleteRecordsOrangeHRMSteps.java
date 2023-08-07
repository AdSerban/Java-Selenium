package StepDeff;

import UI.BasePage;
import UI.WebPage.HomePageOrangeHRM;
import UI.WebPage.LeaveOrangeHRM;
import UI.WebPage.MyInfoOrangeHRM;
import UI.WebPage.OrangeHRM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteRecordsOrangeHRMSteps extends BasePage {

    HomePageOrangeHRM homePageOrangeHRM;
    LeaveOrangeHRM leaveOrangeHRM;
    OrangeHRM orangeHRM;
    MyInfoOrangeHRM myInfoOrangeHRM;



    public DeleteRecordsOrangeHRMSteps() {

        this.homePageOrangeHRM = new HomePageOrangeHRM();
        this.leaveOrangeHRM = new LeaveOrangeHRM();
        this.orangeHRM = new OrangeHRM();
        this.myInfoOrangeHRM = new MyInfoOrangeHRM();


    }
    @Given("I access OrangeHRM page - Contact Details")
    public void iAccessOrangeHRMPageContactDetails() {
        orangeHRM.goToOrangePage();
    }

    @When("I enter valid login credentials - Contact Details")
    public void iEnterValidLoginCredentialsContactDetails() {
        orangeHRM.putUserAndPass("Admin","admin123");
    }

    @And("I press the Login button to log into my account - Contact Details")
    public void iPressTheLoginButtonToLogIntoMyAccountContactDetails() {
        orangeHRM.clickLogin();
    }

    @And("I click the My Info option from the menu - Contact Details")
    public void iClickTheMyInfoOptionFromTheMenuContactDetails() {
        homePageOrangeHRM.clickMyInfo();
    }

    @And("I select the Contact Details link which will redirect me to the contactDetails page")
    public void iSelectTheContactDetailsLinkWhichWillRedirectMeToTheContactDetailsPage() {
        myInfoOrangeHRM.clickMyDetails();

    }

    @And("I tick the checkbox to select one record saved in the Records Found section")
    public void iTickTheCheckboxToSelectOneRecordSavedInTheRecordsFoundSection() {
        myInfoOrangeHRM.selectElement();
    }

    @And("I press the Delete button to delete that record")
    public void iPressTheDeleteButtonToDeleteThatRecord() {
        myInfoOrangeHRM.deleteAct();
    }

    @And("I press Yes to confirm this deletion")
    public void iPressYesToConfirmThisDeletion() {
        myInfoOrangeHRM.confirmDelete();
    }

    @Then("I should receive a confirmation message that the record has been deleted successfully")
    public void iShouldReceiveAConfirmationMessageThatTheRecordHasBeenDeletedSuccessfully() {
        myInfoOrangeHRM.assertDeletion();

        // CODE
    }

}
