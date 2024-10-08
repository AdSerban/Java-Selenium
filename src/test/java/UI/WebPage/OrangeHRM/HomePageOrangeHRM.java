package UI.WebPage.OrangeHRM;

import UI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePageOrangeHRM extends BasePage {

    public final By USER_DISPLAYED = By.xpath("//p[@class='oxd-userdropdown-name']");

    public final By USER_DIS = By.cssSelector("[class='oxd-userdropdown-name']");

//    public final By LEAVE = By.xpath("//ul[@class='oxd-main-menu']/li[3]");
//    public final By LEAVE_CSS = By.cssSelector("[class='oxd-main-menu'] li:nth-child(3)");
    public final By MY_INFO_BTN = By.xpath("//ul[@class='oxd-main-menu']/li[6]");
    public final By LEAVE_BTN = By.cssSelector("div.oxd-sidepanel-body > ul > li:nth-child(3)");
    public final By ADMIN_PAGE_BTN = By.cssSelector("li:nth-child(1) [class='oxd-main-menu-item']");
    public final By PROFILE_BTN = By.cssSelector("[class='oxd-userdropdown']");

    public final By CHANGE_PASS_OPS = By.cssSelector("[class='oxd-userdropdown-link']");
    public final By RECRUITMENT_BTN = By.xpath("//ul[@class='oxd-main-menu']/li[5]");
    public final By MAINTENANCE_BTN = By.xpath("//ul[@class='oxd-main-menu']/li[9]");
    public final By PIM_BTN = By.xpath("//ul[@class='oxd-main-menu']/li[2]");
    public final By CHECK_PASS  = By.cssSelector("[type='password']");
    public final By CONFIRM_BTN = By.cssSelector("[type='submit']");



    public String getText() {

        return findElementByCssSelector(USER_DISPLAYED).getText();
    }

    public void clickLeavePage() {
        waitForPageLoadComplete();
        findElementByCssSelector(LEAVE_BTN).click();
    }
    public void clickMyInfo() {
        waitForPageLoadComplete();
        findElementByCssSelector(MY_INFO_BTN).click();
    }
    public void clickAdmin() {
        waitForPageLoadComplete();
        findElementByCssSelector(ADMIN_PAGE_BTN).click();
    }
    public void clickProfile() {
        waitForPageLoadComplete();
        findElementByCssSelector(PROFILE_BTN).click();
        hardWait(3);


        List<WebElement> listElementsFromProfileDropDown = driver.findElements(By.cssSelector("[class='oxd-userdropdown-link']"));

        for (int i = 0; i < listElementsFromProfileDropDown.size(); i++) {
            WebElement checkBoxToSelect = listElementsFromProfileDropDown.get(i);
            if (i == 2) {
                checkBoxToSelect.click();
            }
        }
//        findElementByCssSelector(CHANGE_PASS_OPS).click();
    }

    public void clickRecruitment() {
        waitForPageLoadComplete();
        findElementByCssSelector(RECRUITMENT_BTN).click();
    }
    public void clickPIM() {
        waitForPageLoadComplete();
        findElementByCssSelector(PIM_BTN).click();
    }
    public void clickMaintenance() {
        waitForPageLoadComplete();
        findElementByCssSelector(MAINTENANCE_BTN).click();
    }
    public void checkPass() {
        waitForPageLoadComplete();
        findElementByCssSelector(CHECK_PASS).sendKeys("admin123");
    }
    public void confirmPass() {
        waitForPageLoadComplete();
        findElementByCssSelector(CONFIRM_BTN).click();
    }

}
