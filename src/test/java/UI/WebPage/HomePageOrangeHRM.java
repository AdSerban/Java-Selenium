package UI.WebPage;

import UI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageOrangeHRM extends BasePage {

    public final By USER_DISPLAYED = By.xpath("p[@class='oxd-userdropdown-name']");

    public String getText() {
        return findElementByCssSelector(USER_DISPLAYED).getText();
    }

}
