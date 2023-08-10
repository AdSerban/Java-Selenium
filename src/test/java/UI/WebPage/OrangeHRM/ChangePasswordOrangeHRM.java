package UI.WebPage.OrangeHRM;

import UI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ChangePasswordOrangeHRM extends BasePage {

    String newPass = "admin1234";

    public final By SAVE_BTN = By.cssSelector("[type='submit']");

    public void currentPass() {
        hardWait(1);

        List<WebElement> fillLabels = driver.findElements(By.cssSelector("input.oxd-input.oxd-input--active:nth-child(1)"));
        for (int i = 0; i < fillLabels.size(); i++) {
            WebElement checkBoxToSelect = fillLabels.get(i);
            if (i == 0) {
                checkBoxToSelect.sendKeys("admin123");
            }
        }
    }

    public void newPass() {
        hardWait(1);

        List<WebElement> fillLabels = driver.findElements(By.cssSelector("input.oxd-input.oxd-input--active:nth-child(1)"));
        for (int i = 0; i < fillLabels.size(); i++) {
            WebElement checkBoxToSelect = fillLabels.get(i);
            if (i == 0) {
                checkBoxToSelect.sendKeys("admin123456");
            }
        }
    }

    public void confirmPass() {
        hardWait(1);

        List<WebElement> fillLabels = driver.findElements(By.cssSelector("input.oxd-input.oxd-input--active:nth-child(1)"));
        for (int i = 0; i < fillLabels.size(); i++) {
            WebElement checkBoxToSelect = fillLabels.get(i);
            if (i == 1) {
                checkBoxToSelect.sendKeys("admin123456");
            }
        }
    }

    public void saveNewPass() {
        hardWait(1);
        click(SAVE_BTN);
    }

    public void assertSave() {
        hardWait(1);
        Assert.assertTrue(findElementByCssSelector("[class='oxd-toast-container oxd-toast-container--bottom']").isDisplayed());

    }
}
