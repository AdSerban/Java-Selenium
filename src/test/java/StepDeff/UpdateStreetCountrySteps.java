package StepDeff;

import UI.BasePage;
import UI.WebPage.HomePageOrangeHRM;
import UI.WebPage.MyInfoOrangeHRM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class UpdateStreetCountrySteps extends BasePage {

    HomePageOrangeHRM homePageOrangeHRM;
    MyInfoOrangeHRM myInfoOrangeHRM;

    public UpdateStreetCountrySteps() {
        this.homePageOrangeHRM = new HomePageOrangeHRM();
        this.myInfoOrangeHRM = new MyInfoOrangeHRM();
    }
    @And("I click the My Info option from the menu")
    public void iClickTheMyInfoOptionFromTheMenu() {

        homePageOrangeHRM.clickLeavePage();
        //homePageOrangeHRM.clickMyInfo();
    }

    @And("I click on the Contact Details link which will redirect me to the contactDetails page")
    public void iClickOnTheContactDetailsLinkWhichWillRedirectMeToTheContactDetailsPage() {

        myInfoOrangeHRM.clickMyDetails();
    }

    @And("I update the Street one field from contact details")
    public void iUpdateTheStreetFieldFromContactDetails() {

        myInfoOrangeHRM.changeAddress();
    }

    @And("I select Algeria as country")
    public void iSelectAlgeriaAsCountry() {

        myInfoOrangeHRM.changeCountry();
    }

    @And("I press the Save button")
    public void iPressTheSaveButton() {

        myInfoOrangeHRM.saveChanges();
    }

    @Then("I should see the successfully updated confirmation message")
    public void iShouldSeeTheSuccessfullyUpdatedConfirmationMessage() {

    }
}
