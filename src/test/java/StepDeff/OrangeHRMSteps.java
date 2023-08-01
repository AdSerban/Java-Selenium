//package StepDeff;
//
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import org.openqa.selenium.WebDriver;
//
//
//import static org.openqa.selenium.support.PageFactory.initElements;
//
//public class OrangeHRMSteps {
//
//
//    @Given("I navigate to OrangeHRM")
//    public void iNavigateToOrangeHRM() {
//
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//    }
//
//    @And("I enter the username as {string} and password as {string}")
//    public void iEnterTheUsernameAsAndPasswordAs(String arg0, String arg1) {
//        orangeHRM.username.sendKeys(arg0);
//        orangeHRM.pass.sendKeys(arg1);
//        //System.out.println("username is: " + arg0 + "pass is " + arg1);
//    }
//
//    @And("I click on Login button")
//    public void iClickOnLoginButton() {
//        orangeHRM.loginBtn.click();
//    }
//
//    @Then("I verified the WebPageName")
//    public void iVerifiedTheWebPageName() {
//
//        String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
//        System.out.println(driver.getTitle());
//
//    }
//
//}
