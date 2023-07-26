package WebPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage {


    @FindBy(css = "div [class='hh'] [href='/math-calculator.html']") public WebElement mathBtn;
    @FindBy(css = "[class='sectionlists'] [href='/percent-calculator.html']") public WebElement perBtn;
    @FindBy(id = "cpar1") public WebElement firstValue;
    @FindBy(id = "cpar2") public WebElement secondValue;
    @FindBy(css = "[value = 'Calculate']") public WebElement cltBtn;
    @FindBy(css = "div [id='content'] [class='h2result']") public WebElement result;

}
