package UI.WebPage.OrangeHRM;

import UI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AdminUserJobOrangeHRM extends BasePage {

    public final By ADD_NEW_JOB = By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--secondary");
    public final By JOB_TITLE_NAME = By.cssSelector("input.oxd-input.oxd-input--active:nth-child(1)");
    public final By DESCRIPTION_AREA = By.cssSelector("[placeholder='Type description here']");
    public final By ADD_FILE_BTN = By.cssSelector("input[type=\"file\"]"); //"input.oxd-file-input"
    public final By SAVE_BTN = By.cssSelector("[type='submit']");
    public final By POP_UP = By.cssSelector("[class='oxd-table-row oxd-table-row--with-border']");



    public void addNewJob() {
        hardWait(1);
        click(ADD_NEW_JOB);
    }
    public void addTitleName() {
        hardWait(1);
        fill(JOB_TITLE_NAME,"Manager_New");
    }
    public void fillDescription() {
        hardWait(1);
        findElementByCssSelector(DESCRIPTION_AREA).sendKeys("dummy test");
    }
    public void addFile() {
        hardWait(3);

        WebElement chooseFile = driver.findElement(By.cssSelector("input[type=\"file\"]"));
        chooseFile.sendKeys("/Users/adserban/Desktop/cevaTest.pdf");

    }
    public void saveData() {
        hardWait(1);
        click(SAVE_BTN);
    }
    public void assertFile() {
        hardWait(1);
        Assert.assertTrue(findElementByCssSelector(POP_UP).isDisplayed());
    }
}
