package StepDeff;

import UI.WebPage.OrangeHRM.HomePageOrangeHRM;
import UI.WebPage.OrangeHRM.LeaveOrangeHRM;
import UI.WebPage.OrangeHRM.OrangeHRM;
import UI.WebPage.OrangeHRM.RecruitmentOrangeHRM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomationTesterVacanciesOrangeHRMSteps {

    RecruitmentOrangeHRM recruitmentOrangeHRM;
    HomePageOrangeHRM homePageOrangeHRM;
    LeaveOrangeHRM leaveOrangeHRM;
    OrangeHRM orangeHRM;

    public AutomationTesterVacanciesOrangeHRMSteps() {

        this.recruitmentOrangeHRM = new RecruitmentOrangeHRM();
        this.homePageOrangeHRM = new HomePageOrangeHRM();
        this.leaveOrangeHRM = new LeaveOrangeHRM();
        this.orangeHRM = new OrangeHRM();

    }
    @Given("I access OrangeHRM page - Vacancies")
    public void iAccessOrangeHRMPageVacancies() {
        orangeHRM.goToOrangePage();
    }

    @When("I enter valid login credentials - Vacancies")
    public void iEnterValidLoginCredentialsVacancies() {
        orangeHRM.putUserAndPass("Admin","admin123");
    }

    @And("I press the Login button to log into my account - Vacancies")
    public void iPressTheLoginButtonToLogIntoMyAccountVacancies() {
        orangeHRM.clickLogin();
    }

    @And("I click on the Recruitment option from the menu")
    public void iClickOnTheRecruitmentOptionFromTheMenu() {
        homePageOrangeHRM.clickRecruitment();
    }

    @And("I click on the Vacancies option")
    public void iClickOnTheVacanciesOption() {
        recruitmentOrangeHRM.clickVacancies();
    }

    @And("I search for vacancies with job title as Account Assistant")
    public void iSearchForVacanciesWithJobTitleAsAccountAssistant() {
        recruitmentOrangeHRM.selectAccountAssistanti();
    }

    @Then("I can see that all records are displayed for Account Assistant")
    public void iCanSeeThatAllRecordsAreDisplayedForAccountAssistant() {
        recruitmentOrangeHRM.assertFilter();
    }
}
