package Selenium;

import UI.WebPage.CalculatorPage;
import UI.WebPage.Guru99CalendarPage;
import UI.WebPage.Guru99TablePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.BaseTest;

public class DummyTest extends BaseTest {


    CalculatorPage calculatorPage;
    Guru99TablePage guru99TablePage;
    Guru99CalendarPage guru99CalendarPage;

    public DummyTest() {

//        startDriver();
//        init();
//        quitDriver();

    }
    public void init() {
        this.calculatorPage = new CalculatorPage();
        this.guru99TablePage = new Guru99TablePage();
        this.guru99CalendarPage = new Guru99CalendarPage();
    }

    @Test
    @DisplayName("Calculator Page Test")
    public void calculatorTest() {
        init();
        calculatorPage.goToCalculatorPage();
        calculatorPage.calculateSimpleTest();


    }
    @Test
    @DisplayName("Table Test")
    public void tableTest() {
        init();
        guru99TablePage.goToTablePage();
        guru99TablePage.getText();

    }

    @Test
    @DisplayName("Nested Table Test")
    public void nestedTableTest() {
        init();
        guru99TablePage.goToNestedTablePage();
        guru99TablePage.getTextNestedTable();

    }

    @Test
    @DisplayName("Inner Text Table Test")
    public void innerTextTableTest() {
        init();
        guru99TablePage.goToInnerTextPage();
        guru99TablePage.getTextInnerTable();

    }

    @Test
    @DisplayName("Impossible Inner Text Table Test")
    public void impossibleInnerTextTest() {
        init();
        guru99TablePage.goToInnerText();
        guru99TablePage.getImpossibleInnerText();

    }

    @Test
    @DisplayName("Calendar Test")
    public void calendarTest() {
        init();
        guru99CalendarPage.goToCalendarPage();
        guru99CalendarPage.makeChanges();

    }

    @Test
    @DisplayName("Calendar_2 Test")
    public void calendarTwoTest() {
        init();
        guru99CalendarPage.goToCalendar_2();
        guru99CalendarPage.openCalendar();

    }
}
