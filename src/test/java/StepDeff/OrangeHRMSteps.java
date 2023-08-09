package StepDeff;


import UI.BasePage;
import UI.WebPage.OrangeHRM.OrangeHRM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMSteps extends BasePage {

    OrangeHRM orangeHRM;

    public OrangeHRMSteps() {
        this.orangeHRM = new OrangeHRM();
    }

    @Given("User Navigate to LogIn Page")
    public void userNavigateToLogInPage() {

        orangeHRM.goToOrangePage();

    }

    @When("User enters {string} and {string}")
    public void userEntersAnd(String arg0, String arg1) throws InterruptedException {

        orangeHRM.putUserAndPass(arg0,arg1);
//        fill(findElementByCssSelector(orangeHRM.USER_NAME),arg0);
//        fill(findElementByCssSelector(orangeHRM.PASSWORD),arg1);
        Thread.sleep(5000);
        orangeHRM.clickLogin();
    }

    @Then("Message displayed Login Successfully")
    public void messageDisplayedLoginSuccessfully() {

        orangeHRM.getTitleOfPage();
    }

    @When("User LogOut from the Application")
    public void userLogOutFromTheApplication() {
        System.out.println("Ceva");
    }

    @Then("Message displayed LogOut Successfully")
    public void messageDisplayedLogOutSuccessfully() {

        System.out.println("CEVA");
    }


}
