package StepDeff;

import UI.WebPage.OrangeHRM.HomePageOrangeHRM;
import UI.WebPage.OrangeHRM.OrangeHRM;
import UI.WebPage.OrangeHRM.RecruitmentOrangeHRM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScheduleInterviewCandidateOrangeHRMSteps {

    RecruitmentOrangeHRM recruitmentOrangeHRM;
    HomePageOrangeHRM homePageOrangeHRM;
    OrangeHRM orangeHRM;

    public ScheduleInterviewCandidateOrangeHRMSteps() {

        this.recruitmentOrangeHRM = new RecruitmentOrangeHRM();
        this.homePageOrangeHRM = new HomePageOrangeHRM();
        this.orangeHRM = new OrangeHRM();

    }

    @Given("I access OrangeHRM page - interview")
    public void iAccessOrangeHRMPageInterview() {
        orangeHRM.goToOrangePage();
    }

    @When("I enter valid login credentials - interview")
    public void iEnterValidLoginCredentialsInterview() {
        orangeHRM.putUserAndPass("Admin","admin123");
    }

    @And("I press the Login button to log into my account - interview")
    public void iPressTheLoginButtonToLogIntoMyAccountInterview() {
        orangeHRM.clickLogin();
    }

    @And("I click on the Recruitment link from the menu which will redirect me to the viewCandidates page")
    public void iClickOnTheRecruitmentLinkFromTheMenuWhichWillRedirectMeToTheViewCandidatesPage() {
        homePageOrangeHRM.clickRecruitment();
    }

    @And("I click on the view icon located in the Actions section to see a candidate's application in Status Shortlisted")
    public void iClickOnTheViewIconLocatedInTheActionsSectionToSeeACandidateSApplicationInStatusShortlisted() {
        recruitmentOrangeHRM.selectShortListedCandidates();
    }

    @And("I click the Schedule Interview button for that candidate")
    public void iClickTheScheduleInterviewButtonForThatCandidate() {
        recruitmentOrangeHRM.clickOnSchedule();
    }

    @And("I add the title of the interview")
    public void iAddTheTitleOfTheInterview() {
        recruitmentOrangeHRM.addInterviewTitle();
    }

    @And("I add two interviewers in the Interviewer field")
    public void iAddTwoInterviewersInTheInterviewerField() {
        recruitmentOrangeHRM.addInterviewer();
    }

    @And("I select a date and hour")
    public void iSelectADateAndHour() {
        recruitmentOrangeHRM.addDateAndTime();

    }

    @And("I press the Save button to schedule the interview")
    public void iPressTheSaveButtonToScheduleTheInterview() {
        recruitmentOrangeHRM.clickSave();
    }

    @Then("I should see the confirmation message for this scheduled interview")
    public void iShouldSeeTheConfirmationMessageForThisScheduledInterview() {
        recruitmentOrangeHRM.getAlertConfirmSave();
    }
}
