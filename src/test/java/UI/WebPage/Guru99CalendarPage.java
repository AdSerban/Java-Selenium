package UI.WebPage;

import UI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Calendar;
import java.util.List;

public class Guru99CalendarPage extends BasePage {

    String dateTime ="12/07/2014 2:00 PM";
    public final By DATA_BOX = By.xpath("//form//input[@name='bdaytime']");
    public final By OPEN_CALENDAR_BTN = By.xpath("//button[@aria-label='Open the date view']");
    public final By NEXT_LINK = By.xpath("//span[@class='k-svg-icon k-svg-i-caret-alt-right k-button-icon']");
    public final By MID_LINK = By.xpath("//span[@class='k-button-text']");
    public final By PREVIOUS_LINK = By.xpath("//span[@class='k-svg-icon k-svg-i-caret-alt-left k-button-icon']");
    public final By SELECT_TIME = By.xpath("//span[@class='k-svg-icon k-svg-i-clock k-button-icon']");

    public void goToCalendarPage(){
        goTo("http://demo.guru99.com/test/");
    }

    public void goToCalendar_2() {
        goTo("https://demos.telerik.com/kendo-ui/datetimepicker/index");
    }

    public void makeChanges() {
        hardWait(1);
        findElementByCssSelector(DATA_BOX).sendKeys("09252013");
        findElementByCssSelector(DATA_BOX).sendKeys(Keys.TAB);
        findElementByCssSelector(DATA_BOX).sendKeys("0245PM");

    }

    String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("/");

    public void openCalendar() {
        click(OPEN_CALENDAR_BTN);
        int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2])- Calendar.getInstance().get(Calendar.YEAR);
        click(MID_LINK);
        if(yearDiff!=0){
            //if you have to move next year
            if(yearDiff>0){
                for(int i=0;i< yearDiff;i++){
                    System.out.println("Year Diff->"+i);
                    click(NEXT_LINK);
                }
            }

            //if you have to move previous year
            else if(yearDiff<0){
                for(int i=0;i< (yearDiff*(-1));i++){
                    System.out.println("Year Diff->"+i);
                    click(PREVIOUS_LINK);
                }
            }
        }

        //Get all months from calendar to select correct one

        List<WebElement> list_AllMonthToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
        list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1])-1).click();
        hardWait(1);

        //get all dates from calendar to select correct one

        List<WebElement> list_AllDateToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
        list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0])-1).click();
        hardWait(1);

        click(SELECT_TIME);

        //get list of times

        List<WebElement> allTime = driver.findElements(By.xpath("//div[@data-role='popup'][contains(@style,'display: block')]//ul//li[@role='option']"));
        dateTime = dateTime.split(" ")[1]+" "+dateTime.split(" ")[2];

        //select correct time

        for (WebElement webElement : allTime) {

            if(webElement.getText().equalsIgnoreCase(dateTime))

            {

                webElement.click();

            }

        }
    }


}
