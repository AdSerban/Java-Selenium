package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static java.util.concurrent.TimeUnit.SECONDS;

public class BasePage{

    protected int timeout = 300;
    protected WebDriver driver;
    BrowserHelper browserHelper = new BrowserHelper();
    String originalWindow;


    public BasePage() {
        this.driver = browserHelper.getDriver();
        this.originalWindow = driver.getWindowHandle();
    }
    public void goTo(String link) {

        driver.get(link);
    }

    public WebElement findElementByCssSelector(String CSS_Selector){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(CSS_Selector)));
        return driver.findElement(By.cssSelector(CSS_Selector));
    }

    public void empty(String cssSelector) {
        findElementByCssSelector(cssSelector).clear();
    }

    public void fill(String cssSelector, String text) {
        findElementByCssSelector(cssSelector);
        empty(cssSelector);
        findElementByCssSelector(cssSelector).sendKeys(text);

    }
    public void clickOn( WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }



}
