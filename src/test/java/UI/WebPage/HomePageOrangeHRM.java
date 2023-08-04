package UI.WebPage;

import UI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageOrangeHRM extends BasePage {

    public final By USER_DISPLAYED = By.xpath("//p[@class='oxd-userdropdown-name']");
    public final By USER_DIS = By.cssSelector("[class='oxd-userdropdown-name']");

//    public final By LEAVE = By.xpath("//ul[@class='oxd-main-menu']/li[3]");
//    public final By LEAVE_CSS = By.cssSelector("[class='oxd-main-menu'] li:nth-child(3)");
    public final By MY_INFO_BTN = By.xpath("//ul[@class='oxd-main-menu']/li[6]");
    public final By LEAVE_BTN = By.cssSelector("div.oxd-sidepanel-body > ul > li:nth-child(3)");

    public String getText() {

        return findElementByCssSelector(USER_DISPLAYED).getText();
    }

    public void clickLeavePage() {

        findElementByCssSelector(LEAVE_BTN).click();
    }
    public void clickMyInfo() {

        waitForPageLoadComplete();
        findElementByCssSelector(MY_INFO_BTN).click();
    }
}
