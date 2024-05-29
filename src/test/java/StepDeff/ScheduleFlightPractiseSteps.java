package StepDeff;

import UI.WebPage.PractisePage.FlightPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScheduleFlightPractiseSteps {

    FlightPage flightPage;

    public ScheduleFlightPractiseSteps(){
        this.flightPage = new FlightPage();
    }
    @Given("I access Practise page")
    public void iAccessPractisePage() {
        flightPage.goToPractisePage();
    }

    @When("I select AED from currency button")
    public void iSelectAEDFromCurrencyButton() {
        flightPage.selectFromDropDown();
    }

    @And("I add at least five passengers")
    public void iAddAtLeastPassengers() {
        flightPage.addPassengers();
    }

    @And("I click on Done button to save the change")
    public void iClickOnDoneButtonToSaveTheChange() {
        flightPage.saveChange();
    }

    @And("I click on Departure City option")
    public void iClickOnDepartureCityOption() {
        flightPage.clickOnDeparture();
    }

    @And("I select BLR destination")
    public void iSelectBLRDestination() {
        flightPage.selectDeparture();
    }

    @And("I select MAA destination from Arrival City")
    public void iSelectMAADestinationFromArrivalCity() {
        flightPage.selectArrival();
    }

    @And("I select a date for flight")
    public void iSelectADateForFlight() {
        flightPage.selectDataFromCalendar();
    }

    @And("I search after Ind in searching area")
    public void iSearchAfterIndInSearchingArea() {
        flightPage.searchDynamicDropDown();
    }

    @And("I select India from the Dynamic Dropdown")
    public void iSelectIndiaFromTheDynamicDropdown() {
        flightPage.SelectFromDynamicDropDown();
    }

    @And("I select Senior Citizen option and assert that is selected")
    public void iSelectSeniorCitizenOptionAndAssertThatIsSelected() {
        flightPage.selectCheckBox();
    }

    @And("I select One Way radio button")
    public void iSelectOneWayRadioButton() {
        flightPage.selectOneRadioBtn();
    }

    @Then("I should see that the Return Date is disabled")
    public void iShouldSeeThatTheReturnDateIsDisabled() {
        flightPage.checkReturnDate();
    }

    @And("I click Search Button")
    public void iClickSearchButton() {
        flightPage.clickSearchButton();
    }

}
