package StepDeff;

import UI.WebPage.OrangeHRM.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangeProfilePictureOrangeHRMSteps {

    HomePageOrangeHRM homePageOrangeHRM;
    OrangeHRM orangeHRM;
    MyInfoOrangeHRM myInfoOrangeHRM;

    public ChangeProfilePictureOrangeHRMSteps() {

        this.homePageOrangeHRM = new HomePageOrangeHRM();
        this.myInfoOrangeHRM = new MyInfoOrangeHRM();
        this.orangeHRM = new OrangeHRM();
    }

    @Given("I access OrangeHRM page - profile picture")
    public void iAccessOrangeHRMPageProfilePicture() {
        orangeHRM.goToOrangePage();
    }

    @When("I enter valid login credentials - profile picture")
    public void iEnterValidLoginCredentialsProfilePicture() {
        orangeHRM.putUserAndPass("Admin","admin123");
    }

    @And("I press the Login button to log into my account - profile picture")
    public void iPressTheLoginButtonToLogIntoMyAccountProfilePicture() {
        orangeHRM.clickLogin();
    }

    @And("I click on the My Info link on the menu which will redirect me to the PersonalDetails page")
    public void iClickOnTheMyInfoLinkOnTheMenuWhichWillRedirectMeToThePersonalDetailsPage() {
        homePageOrangeHRM.clickMyInfo();
    }

    @And("I click on the profile picture")
    public void iClickOnTheProfilePicture() {
        myInfoOrangeHRM.clickOnProfilePicture();
    }

    @And("I add a picture")
    public void iAddAPicture() {
        myInfoOrangeHRM.addProfilePicture();
    }

    @And("I click the Save button")
    public void iClickTheSaveButton() {
        myInfoOrangeHRM.saveProfilePicture();
    }

    @Then("I can see that my profile picture has been updated")
    public void iCanSeeThatMyProfilePictureHasBeenUpdated() {
        myInfoOrangeHRM.assertProfilePicture();
    }
}
