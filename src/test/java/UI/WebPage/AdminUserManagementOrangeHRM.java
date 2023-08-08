package UI.WebPage;

import UI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminUserManagementOrangeHRM extends BasePage {

    public final By CONFIGURATION_DROPDOWN = By.cssSelector("li:nth-child(7)[class='oxd-topbar-body-nav-tab --parent'] [class='oxd-topbar-body-nav-tab-item']");
    public final By LANG_PACK = By.cssSelector("[class='--active oxd-topbar-body-nav-tab --parent'] li:nth-child(4)");
    @FindBy(xpath = "*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[8]/div/div[2]/div/button[1]") public WebElement translateEsp;


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
        findElementByXpath("//*[@id='app'']/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[9]/div/div[2]/div/button[1]).click()").click();
    }
    public void getTextMess() {
        waitForPageLoadComplete();
        System.out.println(driver.getTitle());
    }

}
