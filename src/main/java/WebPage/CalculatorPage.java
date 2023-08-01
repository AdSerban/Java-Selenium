package WebPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class CalculatorPage extends BasePage {

    public void goToStartPage() {
        goTo("http://www.calculator.net/");

    }

    @FindBy(css = "div [class='hh'] [href='/math-calculator.html']") public WebElement mathBtn;
    @FindBy(css = "[class='sectionlists'] [href='/percent-calculator.html']") public WebElement perBtn;
    @FindBy(id = "cpar1") public WebElement firstValue;
    @FindBy(id = "cpar2") public WebElement secondValue;
    @FindBy(css = "[value = 'Calculate']") public WebElement cltBtn;
    @FindBy(css = "div [id='content'] [class='h2result']") public WebElement result;

    public void methods() {
        mathBtn.click();
        perBtn.click();
        firstValue.sendKeys("40");
        secondValue.sendKeys("5");
        cltBtn.click();
        System.out.println(result.getText());
    }
}
