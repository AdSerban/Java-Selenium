package StepDeff;

import UI.BasePage;
import UI.WebPage.AdminUserManagementOrangeHRM;
import UI.WebPage.HomePageOrangeHRM;
import UI.WebPage.OrangeHRM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LanguagePackagesOrangeHRMSteps extends BasePage {

    OrangeHRM orangeHRM;
    HomePageOrangeHRM homePageOrangeHRM;
    AdminUserManagementOrangeHRM adminUserManagementOrangeHRM;

    public LanguagePackagesOrangeHRMSteps() {

        this.orangeHRM = new OrangeHRM();
        this.homePageOrangeHRM = new HomePageOrangeHRM();
        this.adminUserManagementOrangeHRM = new AdminUserManagementOrangeHRM();
    }
    @Given("I access OrangeHRM page - Language Packages")
    public void iAccessOrangeHRMPageLanguagePackages() {
        orangeHRM.goToOrangePage();
    }

    @When("I enter valid login credentials - Language Packages")
    public void iEnterValidLoginCredentialsLanguagePackages() {
        orangeHRM.putUserAndPass("Admin","admin123");
    }

    @And("I press the Login button to log into my account - Language Packages")
    public void iPressTheLoginButtonToLogIntoMyAccountLanguagePackages() {
        orangeHRM.clickLogin();
    }

    @And("I click the Admin link from the menu")
    public void iClickTheAdminLinkFromTheMenu() {
        homePageOrangeHRM.clickAdmin();
    }

    @And("I click on the Configuration dropdown menu button")
    public void iClickOnTheConfigurationDropdownMenuButton() {
        adminUserManagementOrangeHRM.clickOnDropDown();

    }

    @And("I click on the Language Packages option")
    public void iClickOnTheLanguagePackagesOption() {
        adminUserManagementOrangeHRM.selectFromDropDown();
    }

    @And("I click on the Translate button for Spanish - Español language package")
    public void iClickOnTheTranslateButtonForSpanishEspañolLanguagePackage() {
        adminUserManagementOrangeHRM.clickOnTranslate();
    }

    @Then("I should be redirected to the languageCustomization page")
    public void iShouldBeRedirectedToTheLanguageCustomizationPage() {
        adminUserManagementOrangeHRM.getTextMess();
    }
}
