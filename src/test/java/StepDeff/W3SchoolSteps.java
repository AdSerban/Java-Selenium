package StepDeff;

import UI.BasePage;
import UI.WebPage.W3School;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class W3SchoolSteps extends BasePage {

    W3School w3School;


    public W3SchoolSteps() {

        this.w3School = new W3School();

    }

    @Given("I enter the page")
    public void i_enter_the_page() throws InterruptedException {
        w3School.goToW3school();
    }

    @Then("^I select option: (.*) for me$")
    public void iSelectOptionHTMLForMe(String opt) throws InterruptedException {
        w3School.selectRadioBtnOption(opt);
    }
}