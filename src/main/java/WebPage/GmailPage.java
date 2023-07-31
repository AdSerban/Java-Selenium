package WebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BasePage;

import java.time.Duration;

public class GmailPage extends BasePage {

    protected int timeout = 300;

    @FindBy(css = "[id='username']") public WebElement userName;

    @FindBy(css = "[id ='password']") public WebElement pass;

    @FindBy(css = "[id='submit']") public WebElement submitBtn;

    @FindBy(css = "[id='menu-item-20']") public WebElement practiceBtn;
    @FindBy(css = "[id='form_email_7']") public WebElement mailInner;
//    @FindBy(css = "div[class='_6ltj'] a:nth-child(1)") public WebElement accesBtn;


    public void methodA() {


        userName.sendKeys("student");
        userName.sendKeys(Keys.RETURN);
        pass.sendKeys("Password123");
        submitBtn.click();


//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='menu-item-20']")));
//        findElementByCssSelector("[id='menu-item-20']").click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='form_email_7']")));
//        findElementByCssSelector("[id='form_email_7']").click();


    }

}
