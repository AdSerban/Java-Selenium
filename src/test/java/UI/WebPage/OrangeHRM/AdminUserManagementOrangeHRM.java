package UI.WebPage.OrangeHRM;

import UI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class AdminUserManagementOrangeHRM extends BasePage {

    public final By CONFIGURATION_DROPDOWN = By.cssSelector("li:nth-child(7)[class='oxd-topbar-body-nav-tab --parent'] [class='oxd-topbar-body-nav-tab-item']");
    public final By LANG_PACK = By.cssSelector("[class='--active oxd-topbar-body-nav-tab --parent'] li:nth-child(4)");
    public final By SELECT_ARROW = By.cssSelector("i[class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']");
    public final By SAVE_NEW_LANG = By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--secondary:nth-child(3)");
    //public final By JOB_BTN = By.cssSelector("li[class='--active oxd-topbar-body-nav-tab --parent']");



    public void clickOnDropDown() {
        waitForPageLoadComplete();
        findElementByCssSelector(CONFIGURATION_DROPDOWN).click();
    }
    public void selectFromDropDown() {
        waitForPageLoadComplete();
        findElementByCssSelector(LANG_PACK).click();
    }
    public void clickOnTranslate() {
        waitForPageLoadComplete();
        hardWait(1);

        List<WebElement> listElementsTranslate = driver.findElements(By.cssSelector("button.oxd-button.oxd-button"));
//        System.out.println(listElementsTranslate + " ------------------------------------- text ");

        for (int i = 0; i < listElementsTranslate.size(); i++) {
            WebElement checkBoxToSelect = listElementsTranslate.get(i);
            if (i==21) {
                checkBoxToSelect.click();
            }
        }
    }
    public void getTextMess() {
        waitForPageLoadComplete();
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

    public void clickAddNewLanguageBtn() {
        waitForPageLoadComplete();
        hardWait(1);

        List<WebElement> listElementsTranslate = driver.findElements(By.cssSelector("button.oxd-button.oxd-button"));
//        System.out.println(listElementsTranslate + " ------------------------------------- text ");

        for (int i = 0; i < listElementsTranslate.size(); i++) {
            WebElement checkBoxToSelect = listElementsTranslate.get(i);
            if (i==0) {
                checkBoxToSelect.click();
            }
        }
    }

    public void selectFromList() {
        click(SELECT_ARROW);
        hardWait(1);
        driver.findElement(By.xpath(".//span[text()='Colognian (Germany)']")).click();

//        Actions actions = new Actions(driver);
//        actions.scrollByAmount(0,2000).perform();
//        scrollElement("(class='oxd-select-dropdown --positon-bottom')");
//        COLOGNIA_GERMANY.click();
//        click(COLOGNIA_GERMANY);
    }

    public void saveSelection() {
        click(SAVE_NEW_LANG);
    }
    public void assertSave() {
        hardWait(1);
        Assert.assertTrue(findElementByCssSelector("div[class='oxd-toast-container oxd-toast-container--bottom']").isDisplayed());
    }

    public void clickOnJobTitles() {

        hardWait(1);
        List<WebElement> listElements = driver.findElements(By.cssSelector ("span[class='oxd-topbar-body-nav-tab-item']"));
//        System.out.println(listElementsTranslate + " ------------------------------------- text ");

        for (int i = 0; i < listElements.size(); i++) {
            WebElement job = listElements.get(i);
            if (i==1) {
                job.click();
            }
        }

        hardWait(1);

        List<WebElement> listElementsJobs = driver.findElements(By.cssSelector("a.oxd-topbar-body-nav-tab-link"));
//        System.out.println(listElementsTranslate + " ------------------------------------- text ");

        for (int i = 0; i < listElementsJobs.size(); i++) {
            WebElement jobs = listElementsJobs.get(i);
            if (i==0) {
                jobs.click();
            }
        }
    }

}
