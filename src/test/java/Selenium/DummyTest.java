package Selenium;

import UI.WebPage.CalculatorPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.BaseTest;

public class DummyTest extends BaseTest {


    CalculatorPage calculatorPage;

    public DummyTest() {
        this.calculatorPage = new CalculatorPage();
    }

    @Test
    @DisplayName("Calculator Page Test")
    public void calculatorTest() throws InterruptedException {
        calculatorPage.goToCalculatorPage();
        calculatorPage.calculateSimpleTest();


    }
}
