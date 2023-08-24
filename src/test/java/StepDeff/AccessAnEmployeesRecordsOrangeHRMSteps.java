package StepDeff;

import UI.WebPage.OrangeHRM.HomePageOrangeHRM;
import UI.WebPage.OrangeHRM.LeaveOrangeHRM;
import UI.WebPage.OrangeHRM.MaintenanceOrangeHRM;
import UI.WebPage.OrangeHRM.OrangeHRM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccessAnEmployeesRecordsOrangeHRMSteps {

    MaintenanceOrangeHRM maintenanceOrangeHRM;
    HomePageOrangeHRM homePageOrangeHRM;
    OrangeHRM orangeHRM;


    public AccessAnEmployeesRecordsOrangeHRMSteps() {

        this.maintenanceOrangeHRM = new MaintenanceOrangeHRM();
        this.homePageOrangeHRM = new HomePageOrangeHRM();
        this.orangeHRM = new OrangeHRM();

    }
    @Given("I access OrangeHRM page - employee's records")
    public void iAccessOrangeHRMPageEmployeeSRecords() {
        orangeHRM.goToOrangePage();
    }

    @When("I enter valid login credentials - employee's records")
    public void iEnterValidLoginCredentialsEmployeeSRecords() {
        orangeHRM.putUserAndPass("Admin","admin123");
    }

    @And("I press the Login button to log into my account - employee's records")
    public void iPressTheLoginButtonToLogIntoMyAccountEmployeeSRecords() {
        orangeHRM.clickLogin();
    }

    @And("I click on the Maintenance option from the menu which will redirect me to the purgeEmployee page")
    public void iClickOnTheMaintenanceOptionFromTheMenuWhichWillRedirectMeToThePurgeEmployeePage() {
        homePageOrangeHRM.clickMaintenance();
    }

    @And("I enter my password to validate my administrator credentials")
    public void iEnterMyPasswordToValidateMyAdministratorCredentials() {
        homePageOrangeHRM.checkPass();
    }

    @And("I click the Confirm button")
    public void iClickTheConfirmButton() {
        homePageOrangeHRM.confirmPass();
    }

    @And("I click on the Access Records option")
    public void iClickOnTheAccessRecordsOption() {
        maintenanceOrangeHRM.clickAccessRecords();
    }

    @And("I enter Anthony Anadebe in the Employee Name field")
    public void iEnterAnthonyAnadebeInTheEmployeeNameField() {
        maintenanceOrangeHRM.fillEmployeeName();
    }

    @And("click on the Search button")
    public void clickOnTheSearchButton() {
        maintenanceOrangeHRM.clickSearchBTN();
    }

    @Then("I can see that the employee ID is displayed in the Selected Employee section by using css selector")
    public void iCanSeeThatTheEmployeeIDIsDisplayedInTheSelectedEmployeeSectionByUsingCssSelector() {
        maintenanceOrangeHRM.checkID();
    }
}
