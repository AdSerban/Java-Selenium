package StepDeff;

import UI.WebPage.OrangeHRM.HomePageOrangeHRM;
import UI.WebPage.OrangeHRM.OrangeHRM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScheduleInterviewCandidateOrangeHRMSteps {

    HomePageOrangeHRM homePageOrangeHRM;
    OrangeHRM orangeHRM;

    public ScheduleInterviewCandidateOrangeHRMSteps() {

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
    }

    @And("I click on the view icon located in the Actions section to see a candidate's application in Status Shortlisted")
    public void iClickOnTheViewIconLocatedInTheActionsSectionToSeeACandidateSApplicationInStatusShortlisted() {
    }

    @And("I click the Schedule Interview button for that candidate")
    public void iClickTheScheduleInterviewButtonForThatCandidate() {
    }

    @And("I add the title of the interview")
    public void iAddTheTitleOfTheInterview() {
    }

    @And("I add two interviewers in the Interviewer field")
    public void iAddTwoInterviewersInTheInterviewerField() {
    }

    @And("I select a date and hour")
    public void iSelectADateAndHour() {
    }

    @And("I press the Save button to schedule the interview")
    public void iPressTheSaveButtonToScheduleTheInterview() {
    }

    @Then("I should see the confirmation message for this scheduled interview")
    public void iShouldSeeTheConfirmationMessageForThisScheduledInterview() {
    }
}
