package UI.WebPage;

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
    public final By REJECTED_MES = By.xpath("//div[@class='oxd-multiselect-chips-area']/span[1]");

    //@FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']/div[1]") public WebElement showLeave;
    //@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]") public WebElement rejectedMessage;

    @FindBy(css = "[class='oxd-select-option']") public WebElement listaCss;

//    public final By DROPDOWN = By.className("oxd-select-dropdown");
//    WebElement rejectedOption = driver.findElement(DROPDOWN).findElement(By.xpath(".//span[text()='Rejected']"));


    public void checkAndClick() {
        waitForPageLoadComplete();
        findElementByCssSelector(SHOW_LEAVE).click();
//        rejectedOption.click();
//        waitUntilItIsVisible(listaCss);
//        selectFromDropDrown(listaCss,"Rejected");
    }
    public void assertThat() {
        Assert.assertEquals(REJECTED_MES, "Rejected");
    }

}
