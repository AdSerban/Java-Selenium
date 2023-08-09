package UI.WebPage.OrangeHRM;

import UI.BasePage;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class LeaveOrangeHRM extends BasePage {


    public final By SHOW_LEAVE = By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[1]");
    public final By REJECTED_MES = By.xpath("//div[@class='oxd-multiselect-chips-area']/span[2]");
    @FindBy(css = "[class='oxd-select-option']") public WebElement listaCss;
    @FindBy(css = "[class='oxd-select-text oxd-select-text--active']") public WebElement dropDown;
    //public final By DROPDOWN = By.className("oxd-select-dropdown");
    @FindBy(xpath = ".//span[text()='Rejected']") public WebElement rejectedOption;
    //WebElement rejectedOption = driver.findElement(DROPDOWN).findElement(By.xpath(".//span[text()='Rejected']"));


    public void checkAndClick() {

        click("[class='oxd-select-text oxd-select-text--active']");
        driver.findElement(By.xpath(".//span[text()='Rejected']")).click();
    }
    public void assertThat() {
//*[@class="oxd-multiselect-chips-area"]/span[2]
        //Assert.assertTrue(findElementByCssSelector("[class='oxd-chip oxd-chip--default oxd-multiselect-chips-selected']:nth-child(2)").isDisplayed());
        Assert.assertTrue(findElementByXpath("//*[@class=\"oxd-multiselect-chips-area\"]/span[2]").isDisplayed());

    }

}
