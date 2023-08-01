package Selenium;

import WebPage.CalculatorPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.BasePage;
import utils.BaseTests;

public class DummyTest extends BaseTests {


    CalculatorPage calculatorPage;

    public DummyTest() {
        this.calculatorPage = new CalculatorPage();
    }

    @Test
    @DisplayName("First Test")
    public void dummyTest() {
        calculatorPage.goToStartPage();
        //calculatorPage.methods();

    }
}
