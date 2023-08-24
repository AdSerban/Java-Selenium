package UI.WebPage.OrangeHRM;

import UI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class PIMOrangeHRM extends BasePage {

    public final By ADD_EMPLOYEE = By.xpath(".//a[text()='Add Employee']");

    public final By PROFILE_PICTURE = By.cssSelector("[type='file']");
    public final By FIRST_NAME = By.cssSelector("[placeholder='First Name']");
    public final By LAST_NAME = By.cssSelector("[placeholder='Last Name']");
    public final By LOGIN_DETAILS = By.cssSelector("[class='oxd-switch-input oxd-switch-input--active --label-right']");
    public final By SAVE_BTN = By.cssSelector("[type='submit']");

    //.//a[text()='Add Employee']

    public void clickOnAddEmployee() {
        waitForPageLoadComplete();
        click(ADD_EMPLOYEE);
    }

    public void addPicture() {
        waitForPageLoadComplete();
        hardWait(1);
        WebElement chooseFile = driver.findElement(By.cssSelector("[class='oxd-file-input']"));
        chooseFile.sendKeys("/Users/adserban/Desktop/Screenshot.png");

    }

    public void fillUserName() {
       fillFirstName();
       fillLastName();
    }
    public void fillFirstName() {
        waitForPageLoadComplete();
        fill(FIRST_NAME,"Neluuu");
    }
    public void fillLastName() {
        waitForPageLoadComplete();
        fill(LAST_NAME,"Vasileee");
    }

    public void fillID() {

        hardWait(1);

        List<WebElement> listElements = driver.findElements(By.cssSelector("[class='oxd-input oxd-input--active']"));
        for(int i=0; i<listElements.size(); i++) {
            WebElement element = listElements.get(i);
            if (i==1) {
                hardWait(1);
                element.clear();
                hardWait(1);
                element.sendKeys("123456");
            }
        }
    }

    public void clickCheckBoxForDetails() {
        waitForPageLoadComplete();
        click(LOGIN_DETAILS);

    }

    public void addUserNameAndPass() {
        addUserName();
        addPassAndConfirmation();
        hardWait(1);
        addPassConfirmation();

    }

    public void addUserName() {

        List<WebElement> listElements = driver.findElements(By.cssSelector("[class='oxd-input oxd-input--active']"));
        for(int i=0; i<listElements.size(); i++) {
            WebElement element = listElements.get(i);
            if (i == 2) {
                hardWait(1);
                element.sendKeys("NeluVasile");
            }
        }
    }

    public void addPassAndConfirmation() {

        //List<WebElement> listElements = driver.findElements(By.cssSelector("div [class='oxd-form-row user-password-row'] [class='oxd-input oxd-input--active']"));
        List<WebElement> listElements = driver.findElements(By.cssSelector("[class='oxd-input oxd-input--active']"));

        for(int i = 0; i<listElements.size(); i++) {
            WebElement element = listElements.get(i);
            if (i == 2) {
                hardWait(1);
                element.sendKeys("Passsss1");
            }
        }
    }
    public void addPassConfirmation() {
        //List<WebElement> listElements = driver.findElements(By.cssSelector("div [class='oxd-form-row user-password-row'] [class='oxd-input oxd-input--active']"));
        List<WebElement> listElements = driver.findElements(By.cssSelector("[class='oxd-input oxd-input--active']"));

        for(int i = 0; i<listElements.size(); i++) {
            WebElement element = listElements.get(i);
            if (i == 3) {
                hardWait(1);
                element.sendKeys("Passsss1");
            }
        }
    }

    public void clickOnSave() {
        waitForPageLoadComplete();
        click(SAVE_BTN);
    }

    public void assertThat() {
        hardWait(1);
        Assert.assertTrue(findElementByCssSelector("[class='oxd-toast-container oxd-toast-container--bottom']").isDisplayed());
    }
}
