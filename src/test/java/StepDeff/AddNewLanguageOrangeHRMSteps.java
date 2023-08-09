package StepDeff;

import UI.WebPage.OrangeHRM.AdminUserManagementOrangeHRM;
import UI.WebPage.OrangeHRM.HomePageOrangeHRM;
import UI.WebPage.OrangeHRM.OrangeHRM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewLanguageOrangeHRMSteps {

    OrangeHRM orangeHRM;
    HomePageOrangeHRM homePageOrangeHRM;
    AdminUserManagementOrangeHRM adminUserManagementOrangeHRM;

    public AddNewLanguageOrangeHRMSteps() {

        this.orangeHRM = new OrangeHRM();
        this.homePageOrangeHRM = new HomePageOrangeHRM();
        this.adminUserManagementOrangeHRM = new AdminUserManagementOrangeHRM();
    }

    @Given("I access OrangeHRM page - add new language")
    public void iAccessOrangeHRMPageAddNewLanguage() {
        orangeHRM.goToOrangePage();
    }

    @When("I enter valid login credentials - add new language")
    public void iEnterValidLoginCredentialsAddNewLanguage() {
        orangeHRM.putUserAndPass("Admin","admin123");
    }

    @And("I press the Login button to log into my account - add new language")
    public void iPressTheLoginButtonToLogIntoMyAccountAddNewLanguage() {
        orangeHRM.clickLogin();
    }

    @And("I click the Admin link from the menu which will redirect me to the viewSystemUsers page")
    public void iClickTheAdminLinkFromTheMenuWhichWillRedirectMeToTheViewSystemUsersPage() {
        homePageOrangeHRM.clickAdmin();
    }

    @And("I press on the Configuration drop-down menu button")
    public void iPressOnTheConfigurationDropDownMenuButton() {
        adminUserManagementOrangeHRM.clickOnDropDown();
    }

    @And("I click on the Language Packages option - add new language")
    public void iClickOnTheLanguagePackagesOptionAddNewLanguage() {
        adminUserManagementOrangeHRM.selectFromDropDown();
    }

    @And("I click the Add button to add a new language to the packages")
    public void iClickTheAddButtonToAddANewLanguageToThePackages() throws InterruptedException {
        adminUserManagementOrangeHRM.clickAddNewLanguageBtn();
    }

    @And("I select the language Colognian Germany from that list")
    public void iSelectTheLanguageColognianGermanyFromThatList() throws InterruptedException {
        adminUserManagementOrangeHRM.selectFromList();
    }

    @And("I press the Save to add this new language to my packages")
    public void iPressTheSaveToAddThisNewLanguageToMyPackages() {
        adminUserManagementOrangeHRM.saveSelection();

    }
    @Then("I should be able to see the confirmation message that the language was successfully saved")
    public void iShouldBeAbleToSeeTheConfirmationMessageThatTheLanguageWasSuccessfullySaved() throws InterruptedException {
        adminUserManagementOrangeHRM.assertSave();
    }


}
