package StepDeff;

import UI.WebPage.OrangeHRM.AdminUserJobOrangeHRM;
import UI.WebPage.OrangeHRM.AdminUserManagementOrangeHRM;
import UI.WebPage.OrangeHRM.HomePageOrangeHRM;
import UI.WebPage.OrangeHRM.OrangeHRM;
import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddANewJobOrangeHRMSteps {

    AdminUserManagementOrangeHRM adminUserManagementOrangeHRM;
    AdminUserJobOrangeHRM adminUserJobOrangeHRM;
    HomePageOrangeHRM homePageOrangeHRM;
    OrangeHRM orangeHRM;


    public AddANewJobOrangeHRMSteps() {

        this.adminUserManagementOrangeHRM = new AdminUserManagementOrangeHRM();
        this.adminUserJobOrangeHRM = new AdminUserJobOrangeHRM();
        this.homePageOrangeHRM = new HomePageOrangeHRM();
        this.orangeHRM = new OrangeHRM();

    }
    @Given("I access OrangeHRM page - add new job")
    public void iAccessOrangeHRMPageAddNewJob() {
        orangeHRM.goToOrangePage();
    }

    @When("I enter valid login credentials - add new job")
    public void iEnterValidLoginCredentialsAddNewJob() {
        orangeHRM.putUserAndPass("Admin","admin123");
    }

    @And("I press the Login button to log into my account - add new job")
    public void iPressTheLoginButtonToLogIntoMyAccountAddNewJob() {
        orangeHRM.clickLogin();
    }

    @And("I click the Admin link on the menu")
    public void iClickTheAdminLinkOnTheMenu() {
        homePageOrangeHRM.clickAdmin();
    }

    @And("I select the Job Titles option from the Job menu dropdown")
    public void iSelectTheJobTitlesOptionFromTheJobMenuDropdown() {
        adminUserManagementOrangeHRM.clickOnJobTitles();
    }

    @And("I click the Add button to add a new job")
    public void iClickTheAddButtonToAddANewJob() {
        adminUserJobOrangeHRM.addNewJob();
    }

    @And("I add a name for the job in the Job Title field")
    public void iAddANameForTheJobInTheJobTitleField() {
        adminUserJobOrangeHRM.addTitleName();
    }

    @And("I add a job description")
    public void iAddAJobDescription() {
        adminUserJobOrangeHRM.fillDescription();
    }

    @And("I add a Job Specification file")
    public void iAddAJobSpecificationFile() {
        adminUserJobOrangeHRM.addFile();
    }

    @And("I click the Save button to add the new job")
    public void iClickTheSaveButtonToAddTheNewJob() {
        adminUserJobOrangeHRM.saveData();
    }

    @Then("I should see the confirmation message that the job was successfully added")
    public void iShouldSeeTheConfirmationMessageThatTheJobWasSuccessfullyAdded() {
        adminUserJobOrangeHRM.assertFile();
    }
}
