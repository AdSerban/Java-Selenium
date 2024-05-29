package UI.WebPage.PractisePage;

import UI.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FlightPage extends BasePage {

    public final By AUTO_SUGGEST_DYNAMIC_DROPDOWN = By.cssSelector(" [id = 'autosuggest']");
    public final By ONE_WAY_RADIO_BTN = By.cssSelector("[id= 'ctl00_mainContent_rbtnl_Trip_0']");
    public final By ROUND_TRIP_RADIO_BTN = By.cssSelector("[id= 'ctl00_mainContent_rbtnl_Trip_1']");

    public final By MULTI_CITY_RADIO_BTN = By.cssSelector("[id = 'ctl00_mainContent_rbtnl_Trip_2']");
    public final By DEPARTURE_CITY_DROPDOWN = By.cssSelector(" [id = 'ctl00_mainContent_ddl_originStation1_CTXT']");
    public final By BLR_OPTION = By.xpath("//a[@value='BLR']");

    public final By ARRIVAL_CITY_DROPDOWN = By.cssSelector("[id= 'ctl00_mainContent_ddl_destinationStation1_CTNR']");
    public final By MAA_OPTION_SECOND_DROPDOWN = By.xpath("(//a[@value='MAA'])[2]");
    public final By CURRENCY_DROPDOWN = By.cssSelector(" [id = 'ctl00_mainContent_DropDownListCurrency']");
    public final By PASSENGERS_DROPDOWN = By.cssSelector("[id= 'divpaxinfo']");
    public final By PLUS_ADULT_BTN = By.cssSelector("[id= 'hrefIncAdt']");
    public final By DONE_BTN = By.cssSelector("[id= 'btnclosepaxoption']");

    public final By FAMILY_AND_FRIENDS_CHECKBOX = By.cssSelector("[id = 'ctl00_mainContent_chk_friendsandfamily']");

    @FindBy(css = "input[type='checkbox']") public List<WebElement> listOfCheckBoxes;
    public final By SENIOR_CITIZEN_CHECKBOX = By.cssSelector("input[id = 'ctl00_mainContent_chk_SeniorCitizenDiscount']");

    public final By IND_ARMED_FORCES_CHECKBOX = By.cssSelector("[id= 'ctl00_mainContent_chk_IndArm']");

    public final By STUDENT_CHECKBOX = By.cssSelector("[id= 'ctl00_mainContent_chk_StudentDiscount']");

    public final By MINOR_CHECKBOX = By.cssSelector("[id = 'ctl00_mainContent_chk_Unmr']");

    public final By LIST_OF_CHECKBOXES = By.cssSelector("input[type='checkbox']");

    public final By DEPART_DATA_DRRO_DOWN_CALENDAR = By.cssSelector("[id = 'ctl00_mainContent_view_date1']");
    public final By CALENDAR_OPTION_DEPARTURE = By.cssSelector("[id='ctl00_mainContent_view_date1']");

    public final By RETURN_DATA_DROP_DOWN_CALENDAR = By.cssSelector("[id = 'ctl00_mainContent_view_date2']");
    public final By RETURN_DROP_DOWN = By.cssSelector("[id=Div1]");
    public final By SUBMIT_BTN = By.cssSelector("[type=submit]");


    public void goToPractisePage() {
        hardWait(1);
        goTo("https://rahulshettyacademy.com/dropdownsPractise/");
    }

    public void selectFromDropDown(){
        Select currencyDrop= new Select(findElementByCssSelector(CURRENCY_DROPDOWN));
        currencyDrop.selectByVisibleText("AED");
        System.out.println(currencyDrop.getFirstSelectedOption().getText());
    }

    public void addPassengers() {
        click(PASSENGERS_DROPDOWN);
        int i = 1;
        while (i<5) {
            click(PLUS_ADULT_BTN);
            i++;
        }
    }

    public void saveChange() {
        click(DONE_BTN);
        Assert.assertEquals("mesaj daca ceva nu merge bine", findElementByCssSelector(PASSENGERS_DROPDOWN).getText() , "5 Adult");
        System.out.println(findElementByCssSelector(PASSENGERS_DROPDOWN).getText());
    }

    public void clickOnDeparture() {
        click(DEPARTURE_CITY_DROPDOWN);
        hardWait(1);
    }

    public void selectDeparture() {
        click(BLR_OPTION);
        hardWait(1);
    }

    public void selectArrival() {
        click(MAA_OPTION_SECOND_DROPDOWN);
        hardWait(1);
    }

    public void selectDataFromCalendar() {

        click(CALENDAR_OPTION_DEPARTURE);
        hardWait(1);
        List<WebElement> listWebElements = driver.findElements(By.cssSelector("[class='ui-state-default']"));

        for (WebElement option : listWebElements) {
            if(option.getText().equals("14")) {
                option.click();
                break;
            }
        }
    }

    public void searchDynamicDropDown() {
        findElementByCssSelector(AUTO_SUGGEST_DYNAMIC_DROPDOWN).sendKeys("ind");
        hardWait(1);
    }

    public void SelectFromDynamicDropDown() {

        List<WebElement> listWebElements = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for (WebElement option : listWebElements) {
            if(option.getText().equalsIgnoreCase("India")) {
                option.click();
                break;
            }
        }
    }

    public void selectCheckBox() {
        click(SENIOR_CITIZEN_CHECKBOX);
        //hardWait(1);
        Assert.assertTrue(findElementByCssSelector(SENIOR_CITIZEN_CHECKBOX).isSelected());
    }

    public void selectOneRadioBtn() {
        click(ROUND_TRIP_RADIO_BTN);
        hardWait(1);
        click(ONE_WAY_RADIO_BTN);
    }

    public void checkReturnDate() {
        if (findElementByCssSelector(RETURN_DROP_DOWN).getAttribute("style").contains("0.5")) {
            System.out.println("is disabled");
            Assert.assertFalse(false);
        } else {
            System.out.println("is enabled");
            Assert.assertFalse(true);
        }
    }

    public void clickSearchButton() {
        click(SUBMIT_BTN);
    }
}
