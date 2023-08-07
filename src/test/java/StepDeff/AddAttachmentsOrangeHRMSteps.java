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

public class AddAttachmentsOrangeHRMSteps extends BasePage {

    HomePageOrangeHRM homePageOrangeHRM;
    LeaveOrangeHRM leaveOrangeHRM;
    OrangeHRM orangeHRM;
    MyInfoOrangeHRM myInfoOrangeHRM;


    public AddAttachmentsOrangeHRMSteps() {

        this.homePageOrangeHRM = new HomePageOrangeHRM();
        this.leaveOrangeHRM = new LeaveOrangeHRM();
        this.orangeHRM = new OrangeHRM();
        this.myInfoOrangeHRM = new MyInfoOrangeHRM();


    }
    @Given("I access OrangeHRM page - attachment")
    public void iAccessOrangeHRMPageAttachment() {
        orangeHRM.goToOrangePage();
    }

    @When("I enter valid login credentials - attachment")
    public void iEnterValidLoginCredentialsAttachment() {
        orangeHRM.putUserAndPass("Admin","admin123");
    }

    @And("I press the Login button to log into my account - attachment")
    public void iPressTheLoginButtonToLogIntoMyAccountAttachment() {
        orangeHRM.clickLogin();
    }

    @And("I click the My Info option on the menu")
    public void iClickTheMyInfoOptionOnTheMenu() {
        homePageOrangeHRM.clickMyInfo();
    }

    @And("I click on the Contact Details link which will redirect me to the contactDetails page - attachment")
    public void iClickOnTheContactDetailsLinkWhichWillRedirectMeToTheContactDetailsPageAttachment() {
        myInfoOrangeHRM.clickMyDetails();
    }

    @And("I click the Add Attachments button")
    public void iClickTheAddAttachmentsButton() {
        myInfoOrangeHRM.clickAttachmentsBtn();
    }

    @And("I select to upload a file")
    public void iSelectToUploadAFile() throws InterruptedException {
        //myInfoOrangeHRM.addFile();
    }

    @And("I add a comment for this document uploaded in the comment field")
    public void iAddACommentForThisDocumentUploadedInTheCommentField() {
        myInfoOrangeHRM.addComment();
    }

    @And("I press the Save button for this attachment added")
    public void iPressTheSaveButtonForThisAttachmentAdded() {
        myInfoOrangeHRM.saveChangesFileUp();
    }

    @Then("I am able to see my document added in the record found section by using css selector")
    public void iAmAbleToSeeMyDocumentAddedInTheRecordFoundSectionByUsingCssSelector() {
        myInfoOrangeHRM.assertFile();
    }
}
