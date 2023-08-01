package StepDeff;

import WebPage.*;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.BrowserHelper;

import static org.openqa.selenium.support.PageFactory.initElements;

public class OrangeHRMSteps {

    private BrowserHelper browserHelper = new BrowserHelper();
    //private WebDriver driver;
    private OrangeHRM orangeHRM;

    public static WebDriver driver;


//    @Given("I set up the driver")
//    public void iSetUpTheDriver() {
//        driver = browserHelper.getChromeDriver();
//        orangeHRM = initElements(driver,OrangeHRM.class);
//
//    }
    @Given("I navigate to OrangeHRM")
    public void iNavigateToOrangeHRM() {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @And("I enter the username as {string} and password as {string}")
    public void iEnterTheUsernameAsAndPasswordAs(String arg0, String arg1) {
        orangeHRM.username.sendKeys(arg0);
        orangeHRM.pass.sendKeys(arg1);
        //System.out.println("username is: " + arg0 + "pass is " + arg1);
    }

    @And("I click on Login button")
    public void iClickOnLoginButton() {
        orangeHRM.loginBtn.click();
    }

    @Then("I verified the WebPageName")
    public void iVerifiedTheWebPageName() {

        String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
        System.out.println(driver.getTitle());

    }

}
