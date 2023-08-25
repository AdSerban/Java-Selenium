package UI.WebPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserStack {

    @FindBy(css = "[id='user_full_name']") public WebElement userName;
    @FindBy(css = "[id='user_password']") public WebElement passWord;
    @FindBy(css = "[id='user_email_login']") public WebElement email;
    @FindBy(css = "[id='user_submit']") public WebElement subBtn;
    @FindBy(id = "tnc_checkbox") public WebElement termsAcc;

}
