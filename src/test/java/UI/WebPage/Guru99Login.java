package UI.WebPage;

import UI.BasePage;
import com.beust.ah.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Guru99Login extends BasePage {

    WebDriver driver;


    public final By USER = By.cssSelector("[name= 'uid']");
    public final By PASS = By.cssSelector("[name= 'password']");
    public final By TITTLE = By.cssSelector("[class= 'barone']");
    public final By LOGIN = By.cssSelector("[name= 'btnLogin']");




    public void goToGuruPage() {
        goTo("http://demo.guru99.com/V4/");

    }

    //Set user name in textbox

    public void setUserName(String strUserName){

        findElementByCssSelector(USER).sendKeys(strUserName);

    }
    //Set password in password textbox

    public void setPassword(String strPassword){

        findElementByCssSelector(PASS).sendKeys(strPassword);
    }

    //Click on login button

    public void clickLogin(){

        findElementByCssSelector(LOGIN).click();
    }

    //Get the title of Login Page

    public String getLoginTitle(){

        return findElementByCssSelector(TITTLE).getText().toLowerCase();
    }

    /**

     * This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param strPasword

     * @return

     */

    public void loginToGuru99(String strUserName,String strPasword) {

        //Fill user name
        this.setUserName(strUserName);

        //Fill password
        this.setPassword(strPasword);

        //Click Login button
        this.clickLogin();
    }

    public void alert() {
        switchToAlert();
        acceptAlert();
    }
}