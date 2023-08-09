package StepDeff;

import UI.WebPage.OrangeHRM.AdminUserManagementOrangeHRM;
import UI.WebPage.OrangeHRM.ChangePasswordOrangeHRM;
import UI.WebPage.OrangeHRM.HomePageOrangeHRM;
import UI.WebPage.OrangeHRM.OrangeHRM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangePasswordOrangeHRMSteps {

    OrangeHRM orangeHRM;
    HomePageOrangeHRM homePageOrangeHRM;
    ChangePasswordOrangeHRM changePasswordOrangeHRM;

    public ChangePasswordOrangeHRMSteps() {

        this.orangeHRM = new OrangeHRM();
        this.homePageOrangeHRM = new HomePageOrangeHRM();
        this.changePasswordOrangeHRM = new ChangePasswordOrangeHRM();
    }

    @Given("I access OrangeHRM page - Change password")
    public void iAccessOrangeHRMPageChangePassword() {
        orangeHRM.goToOrangePage();
    }

    @When("I enter valid login credentials - Change password")
    public void iEnterValidLoginCredentialsChangePassword() {
        orangeHRM.putUserAndPass("Admin","admin123");
    }

    @And("I press the Login button to log into my account - Change password")
    public void iPressTheLoginButtonToLogIntoMyAccountChangePassword() {
        orangeHRM.clickLogin();
    }

    @And("I select the Change Password option from drop-down user profile menu")
    public void iSelectTheChangePasswordOptionFromDropDownUserProfileMenu() {
        homePageOrangeHRM.clickProfile();
    }

    @And("I enter the current password in the Current Password field")
    public void iEnterTheCurrentPasswordInTheCurrentPasswordField() {
        changePasswordOrangeHRM.currentPass();
    }

    @And("I enter in the Password field a new password")
    public void iEnterInThePasswordFieldANewPassword() {
        changePasswordOrangeHRM.newPass();
    }

    @And("I confirm the new password")
    public void iConfirmTheNewPassword() {
        changePasswordOrangeHRM.confirmPass();
    }

    @And("I press the Save button to update the password")
    public void iPressTheSaveButtonToUpdateThePassword() {
        changePasswordOrangeHRM.saveNewPass();
    }

    @Then("I should be able to see the confirmation message")
    public void iShouldBeAbleToSeeTheConfirmationMessage() {
        changePasswordOrangeHRM.assertSave();
    }
}
