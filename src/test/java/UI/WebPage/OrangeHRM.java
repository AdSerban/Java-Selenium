package UI.WebPage;

import UI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRM extends BasePage {



    @FindBy(css ="[name= 'username']") public WebElement username;
    @FindBy(css ="[name= 'password']") public WebElement pass;
    @FindBy(css ="[type= 'submit']") public WebElement loginBtn;

    @FindBy(css ="[class*= 'orangehrm-login-forgot-header']") public WebElement forgotPass;
    @FindBy(css ="[class*= 'orangehrm-login-title']") public WebElement title;

    @FindBy(css = "nav[aria-label='Sidepanel'] li:nth-child(3)") public WebElement nextPage;


    public final By USER_NAME = By.cssSelector("[name= 'username']");

    public final By PASSWORD = By.cssSelector("[name= 'password']");

    public final By LOGIN_BTN = By.cssSelector("[type= 'submit']");

    public final By FORGOT_PASS = By.cssSelector("[class*= 'orangehrm-login-forgot-header']");

    public final By TITTLE = By.cssSelector("[class*= 'orangehrm-login-title']");

    public final By NEXT_PAGE = By.cssSelector("nav[aria-label='Sidepanel'] li:nth-child(3)");


    public void goToOrangePage() {
        goTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    public void loginInPage() {
        fill(findElementByCssSelector(USER_NAME),"Admin");
        fill(findElementByCssSelector(PASSWORD),"admin123");
        click(LOGIN_BTN);

    }

    public void clickLogin() {
        click(LOGIN_BTN);
    }

    public void switchPage() throws InterruptedException {
        Thread.sleep(500);
        click(NEXT_PAGE);

    }
    public void getTitleOfPage() {
        findElementByCssSelector(TITTLE).getText();
    }


    public void setUsername(String strUserName) {
        findElementByCssSelector(USER_NAME).sendKeys(strUserName);
    }

    public void setPassword(String strPassword) {
        findElementByCssSelector(PASSWORD).sendKeys(strPassword);
    }

    public void putUserAndPass(String strUserName, String strPassword) {
        this.setUsername(strUserName);
        this.setPassword(strPassword);
    }
}
