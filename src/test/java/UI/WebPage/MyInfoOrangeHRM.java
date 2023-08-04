package UI.WebPage;

import UI.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MyInfoOrangeHRM extends BasePage {

    public final By CONTACT_DETAILS = By.xpath("//div[@role='tablist']/div[1]");
    public final By STREET = By.cssSelector("input[class='oxd-input oxd-input--active']:nth-child(1)");
    public final By COUNTRY = By.cssSelector("[class='oxd-select-text-input']");

    public final By SAVE_BTN = By.cssSelector("[type='submit']");

    public final By PROMPTER = By.cssSelector("[id='oxd-toaster_1'][class='oxd-toast--success']");



    public void clickMyDetails() {

        waitForPageLoadComplete();
        findElementByCssSelector(CONTACT_DETAILS).click();
    }

    public void changeAddress() {
        findElementByCssSelector(STREET).clear();
        findElementByCssSelector(STREET).sendKeys("adresa schimbata");
        Assert.assertEquals(findElementByCssSelector(STREET).getText(),"adresa schimbata");

    }
    public void changeCountry() {
        findElementByCssSelector(COUNTRY).click();
//        findElementByCssSelector(selectFromDropDrown(,"Algeria")).click();

    }
    public void saveChanges() {
        click(SAVE_BTN);
    }
}
