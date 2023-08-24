package StepDeff;

import UI.WebPage.OrangeHRM.HomePageOrangeHRM;
import UI.WebPage.OrangeHRM.LeaveOrangeHRM;
import UI.WebPage.OrangeHRM.OrangeHRM;
import UI.WebPage.OrangeHRM.PIMOrangeHRM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddANewEmployeeOrangeHRMSteps {

    HomePageOrangeHRM homePageOrangeHRM;
    OrangeHRM orangeHRM;
    PIMOrangeHRM pimOrangeHRM;

    public AddANewEmployeeOrangeHRMSteps() {

        this.homePageOrangeHRM = new HomePageOrangeHRM();
        this.orangeHRM = new OrangeHRM();
        this.pimOrangeHRM = new PIMOrangeHRM();

    }
    @Given("I access OrangeHRM page - add a new employee")
    public void iAccessOrangeHRMPageAddANewEmployee() {
        orangeHRM.goToOrangePage();
    }

    @When("I enter valid login credentials - add a new employee")
    public void iEnterValidLoginCredentialsAddANewEmployee() {
        orangeHRM.putUserAndPass("Admin","admin123");
    }

    @And("I press the Login button to log into my account - add a new employee")
    public void iPressTheLoginButtonToLogIntoMyAccountAddANewEmployee() {
        orangeHRM.clickLogin();
    }

    @And("I click on the PIM option from the menu")
    public void iClickOnThePIMOptionFromTheMenu() {
        homePageOrangeHRM.clickPIM();
    }

    @And("I choose the Add Employee option")
    public void iChooseTheAddEmployeeOption() {
        pimOrangeHRM.clickOnAddEmployee();

    }

    @And("I add a profile picture for that employee")
    public void iAddAProfilePictureForThatEmployee() {
        pimOrangeHRM.addPicture();
    }

    @And("I enter the employee's full name in the Employee Full Name section")
    public void iEnterTheEmployeeSFullNameInTheEmployeeFullNameSection() {
        pimOrangeHRM.fillUserName();
    }

    @And("I enter an employee id in the Employee Id field")
    public void iEnterAnEmployeeIdInTheEmployeeIdField() {
        pimOrangeHRM.fillID();
    }

    @And("I click the Create Login Details button to make the option available")
    public void iClickTheCreateLoginDetailsButtonToMakeTheOptionAvailable() {
        pimOrangeHRM.clickCheckBoxForDetails();
    }

    @And("I add a username and password")
    public void iAddAUsernameAndPassword() {
        pimOrangeHRM.addUserNameAndPass();
    }

    @And("I press the Save button - add a new employee")
    public void iPressTheSaveButtonAddANewEmployee() {
        pimOrangeHRM.clickOnSave();
    }

    @Then("I should see a confirmation message that the employee was successfully saved")
    public void iShouldSeeAConfirmationMessageThatTheEmployeeWasSuccessfullySaved() {
        pimOrangeHRM.assertThat();
    }
}
