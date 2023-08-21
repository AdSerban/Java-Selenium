package UI.WebPage.OrangeHRM;

import UI.BasePage;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class LeaveOrangeHRM extends BasePage {


    public final By SHOW_LEAVE = By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[1]");
    public final By REJECTED_MES = By.xpath("//div[@class='oxd-multiselect-chips-area']/span[2]");
    @FindBy(css = "[class='oxd-select-option']") public WebElement listaCss;
    @FindBy(css = "[class='oxd-select-text oxd-select-text--active']") public WebElement dropDown;
    //public final By DROPDOWN = By.className("oxd-select-dropdown");
    @FindBy(xpath = ".//span[text()='Rejected']") public WebElement rejectedOption;
    //WebElement rejectedOption = driver.findElement(DROPDOWN).findElement(By.xpath(".//span[text()='Rejected']"));

    public final By WORKING_DAY = By.cssSelector("[class='oxd-calendar-date-wrapper']");
    public final By NOT_WOKING_DAY = By.cssSelector("[class='--non-working-day oxd-calendar-date-wrapper']");
    public final By ALL_CALENDAR = By.cssSelector("[class='oxd-date-input-calendar']");
    public final By LEAVE_TYPE = By.cssSelector("div.oxd-select-wrapper");
    public final By SEARCH_BTN = By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    public final By RESET_BTN = By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--ghost']");
    public final By TABEL = By.cssSelector("[class='oxd-table-body']");
    public final By ADD_COMMENT = By.cssSelector("[class='oxd-dropdown-menu'] li:nth-child(1)");
    public final By TEXT_AREA = By.cssSelector("textarea.oxd-textarea.oxd-textarea--active");
    public final By ALERT = By.cssSelector("p.oxd-text--toast-message");
    public final By ALERT_RESET = By.cssSelector("div.oxd-toast-start");
    public final By EMPLOYEE_NAME = By.cssSelector("[placeholder='Type for hints...']");
    private final By CLEAR_BTN = By.cssSelector("div[class='oxd-date-input-link --clear']");





    public void checkAndClick() {

        click("[class='oxd-select-text oxd-select-text--active']");
        driver.findElement(By.xpath(".//span[text()='Rejected']")).click();
    }

    public void assertThat() {
//*[@class="oxd-multiselect-chips-area"]/span[2]
        //Assert.assertTrue(findElementByCssSelector("[class='oxd-chip oxd-chip--default oxd-multiselect-chips-selected']:nth-child(2)").isDisplayed());
        Assert.assertTrue(findElementByXpath("//*[@class=\"oxd-multiselect-chips-area\"]/span[2]").isDisplayed());
    }


    public void fromDateCalendar() {
        hardWait(2);
        List<WebElement> listOfCalendarsBtn = driver.findElements(By.cssSelector("i.oxd-icon.bi-calendar.oxd-date-input-icon"));
//        System.out.println(listOfCalendarsBtn);
        for (int i = 0; i < listOfCalendarsBtn.size(); i++) {
            WebElement checkBoxToSelect = listOfCalendarsBtn.get(i);
            if (i == 0) {
                checkBoxToSelect.click();
            }
        }
        hardWait(1);
        List<WebElement> listOfSelectDay = driver.findElements(By.cssSelector("[class='oxd-calendar-date-wrapper']"));
//        System.out.println(listOfSelectDay);
        for (int i = 0; i < listOfSelectDay.size(); i++) {
            WebElement selected = listOfSelectDay.get(i);
            if (i == 0) {
                selected.click();
            }
        }

//        hardWait(1);
//        List<WebElement> listOfMonths = driver.findElements(By.cssSelector("div.oxd-calendar-selector-month-selected"));
//        System.out.println(listOfMonths);
//        for (int i = 0; i < listOfMonths.size(); i++) {
//            WebElement checkBoxToSelect = listOfMonths.get(i);
//            if (i == 1) {
//                checkBoxToSelect.click();
//            }
//        }

        hardWait(1);

    }

    public void toDateCalendar() {
        hardWait(2);
        List<WebElement> listOfCalendarsBtn = driver.findElements(By.cssSelector("i.oxd-icon.bi-calendar.oxd-date-input-icon"));
//        System.out.println(listOfCalendarsBtn);
        for (int i = 0; i < listOfCalendarsBtn.size(); i++) {
            WebElement checkBoxToSelect = listOfCalendarsBtn.get(i);
            if (i == 1) {
                checkBoxToSelect.click();
            }
        }
        hardWait(1);
        List<WebElement> listOfSelectDay2 = driver.findElements(By.cssSelector("[class='oxd-calendar-date-wrapper']"));
//        System.out.println(listOfSelectDay2);
        for (int i = 0; i < listOfSelectDay2.size(); i++) {
            WebElement selected2 = listOfSelectDay2.get(i);
            if (i == 0) {
                selected2.click();
            }
        }

//        hardWait(1);
//        List<WebElement> listOfMonths = driver.findElements(By.cssSelector("div.oxd-calendar-selector-month"));
//        System.out.println(listOfMonths);
//        for (int i = 0; i < listOfMonths.size(); i++) {
//            WebElement checkBoxToSelect = listOfMonths.get(i);
//            if (i == 2) {
//                checkBoxToSelect.click();
//            }
//        }
//        hardWait(1);
    }

    public void assertPendingStatus() {
//        System.out.println(findElementByXpath("//*[@class=\"oxd-multiselect-chips-area\"]/span[1]").toString());
        Assert.assertTrue(findElementByXpath("//*[@class=\"oxd-multiselect-chips-area\"]/span[1]").isDisplayed());
    }

    public void selectUSVacation() {
        findElementByCssSelector(LEAVE_TYPE).click();
        hardWait(1);
        driver.findElement(By.xpath(".//span[text()='US - Vacation']")).click();

//        List<WebElement> listOfElements = driver.findElements(By.cssSelector("div.oxd-select-option"));
//        System.out.println(listOfElements+"----------------------------------------");
//        for (int i = 0; i < listOfElements.size(); i++) {
//            WebElement checkBoxToSelect = listOfElements.get(i);
//            if (i == listOfElements.size()) {
//                checkBoxToSelect.click();
//            }
//        }
    }
    public void selectCANPersonal() {
        findElementByCssSelector(LEAVE_TYPE).click();
        hardWait(1);
        driver.findElement(By.xpath(".//span[text()='CAN - Personal']")).click();
        hardWait(1);

    }

    public void clickSearch() {
        hardWait(1);
        findElementByCssSelector(SEARCH_BTN).click();
    }
    public void clickReset() {
        hardWait(1);
        findElementByCssSelector(RESET_BTN).click();
    }

    public void assertIfTheRecordsExist() {

        hardWait(1);
        List<WebElement> listOfTabel = driver.findElements(By.cssSelector("div.oxd-table-card"));
        listOfTabel.isEmpty();

    }

    public void clickOnThreeDots() {
        hardWait(2);
        List<WebElement> listOfThreeDots = driver.findElements(By.cssSelector("[class='oxd-icon bi-three-dots-vertical']"));
//        System.out.println(listOfCalendarsBtn);
        for (int i = 0; i < listOfThreeDots.size(); i++) {
            WebElement checkBoxToSelect = listOfThreeDots.get(i);
            if (i == 0) {
                checkBoxToSelect.click();
            }
        }
    }

    public void addComent() {
        click(ADD_COMMENT);
    }

    public void fillComentArea() {
//        hardWait(1);
//        click(TEXT_AREA);
        hardWait(1);
        fill(TEXT_AREA,"comment dummy");

    }

    public void saveComent() {
        driver.findElement(By.xpath(".//button[text()=' Save ']")).click();
    }
    public void getAlertConfirmComment() {
        hardWait(1);
        findElementByCssSelector(ALERT).isDisplayed();
    }
    public void getAlertLConfirmReset() {
        hardWait(1);
        findElementByCssSelector(ALERT_RESET).isDisplayed();
    }

    public void fillEmployeeName(String arg0) {
        findElementByCssSelector(EMPLOYEE_NAME).sendKeys(arg0);
        hardWait(1);

    }

    public void fromAndToDateCalendarSimple(String arg0, String arg1) {
        hardWait(1);
        List<WebElement> listOfCalendars = driver.findElements(By.cssSelector("[class='oxd-date-input'] [class='oxd-input oxd-input--active']"));
        //System.out.println(listOfCalendars);
        for (int i = 0; i < listOfCalendars.size(); i++) {
            WebElement calendars = listOfCalendars.get(i);
            if (i == 0) {
                calendars.click();
                hardWait(1);
                click(CLEAR_BTN);
                calendars.sendKeys(arg0);
            }
            if (i == 1) {
                calendars.click();
                hardWait(1);
                click(CLEAR_BTN);
                calendars.sendKeys(arg1);
            }
        }
    }

}
