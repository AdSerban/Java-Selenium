package UI.WebPage.OrangeHRM;

import UI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class AdminUserManagementOrangeHRM extends BasePage {

    public final By CONFIGURATION_DROPDOWN = By.cssSelector("li:nth-child(7)[class='oxd-topbar-body-nav-tab --parent'] [class='oxd-topbar-body-nav-tab-item']");
    public final By LANG_PACK = By.cssSelector("[class='--active oxd-topbar-body-nav-tab --parent'] li:nth-child(4)");


    public void clickOnDropDown() {
        waitForPageLoadComplete();
        findElementByCssSelector(CONFIGURATION_DROPDOWN).click();
    }
    public void selectFromDropDown() {
        waitForPageLoadComplete();
        findElementByCssSelector(LANG_PACK).click();
    }
    public void clickOnTranslate() throws InterruptedException {
        waitForPageLoadComplete();

        Thread.sleep(1000);
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

}
