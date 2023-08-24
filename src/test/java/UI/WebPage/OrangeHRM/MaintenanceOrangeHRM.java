package UI.WebPage.OrangeHRM;

import UI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MaintenanceOrangeHRM extends BasePage {

    public final By ACCESS_RECORDS_BTN = By.cssSelector("[class='oxd-topbar-body-nav-tab']");
    public final By EMPLOYEE_NAME = By.cssSelector("input[placeholder=\"Type for hints...\"]");
    public final By SEARCH_BTN = By.cssSelector("[type='submit']");
    public final By ID = By.cssSelector("[class='oxd-input oxd-input--active']");

    public void clickAccessRecords() {
        waitForPageLoadComplete();
        findElementByCssSelector(ACCESS_RECORDS_BTN).click();
    }

    private By dropdownAutoComplete = By.cssSelector("div[class=\"oxd-autocomplete-option\"]");

    public void fillEmployeeName() {
        waitForPageLoadComplete();
        hardWait(2);
        findElementByCssSelector(EMPLOYEE_NAME).sendKeys("a");
        hardWait(2);
        WebElement firstOption = driver.findElement(dropdownAutoComplete).findElement(By.xpath("//span[text()='aMohamed aAbdallah aRagab']"));
        firstOption.click();
    }

    public void clickSearchBTN() {
        waitForPageLoadComplete();
        findElementByCssSelector(SEARCH_BTN).click();
    }
    public void checkID() {
        if(findElementByCssSelector(ID).isDisplayed()) {
            System.out.println("true");
        } else
            System.out.println("false");
    }
}
