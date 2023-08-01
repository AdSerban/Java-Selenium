package UI;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import utils.BrowserHelper;

import java.time.Duration;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class BasePage{


    String originalWindow;
    JavascriptExecutor je;
    Alert alert;

    BrowserHelper browserHelper = new BrowserHelper();
    protected int timeout = 30;
    protected WebDriver driver;

    public BasePage() {
        this.driver = browserHelper.getDriver();
        this.originalWindow = driver.getWindowHandle();
    }
    public void goTo(String link) {

        driver.get(link);
    }

    public void switchTabs() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(numberOfWindowsToBe(2));
        for (String windowHandle : driver.getWindowHandles()) {
            if (!this.originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public WebElement findElementById(String id) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        return driver.findElement(By.id(id));
    }

    public WebElement findElementByClassName(String className) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.elementToBeClickable(By.className(className)));
        return driver.findElement(By.className(className));
    }

    public WebElement findElementByCssSelector(By CSS_Selector) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOfElementLocated(CSS_Selector));
        return driver.findElement((CSS_Selector));
    }

    public WebElement findElementByXpath(String xPath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPath)));
        return driver.findElement(By.xpath(xPath));
    }

    public void fill(WebElement textbox, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.elementToBeClickable(textbox));
        je = (JavascriptExecutor) driver;

        je.executeScript("arguments[0].scrollIntoView(true);", textbox);

        textbox.sendKeys(text);
    }

    public void scrollTo(WebElement element){
        je = (JavascriptExecutor) driver;

        je.executeScript("arguments[0].scrollIntoView(true);", element);}

//    public void fill(String cssSelector, String text) {
//
//        findElementByCssSelector(cssSelector).sendKeys(text);
//    }

    public void pressKeyInTextbox(WebElement textbox, Keys keys) {
        je = (JavascriptExecutor) driver;

        je.executeScript("arguments[0].scrollIntoView(true);", textbox);

        textbox.sendKeys(keys);
    }

    public List<WebElement> findElementsByCssSelector(By CSS_Template) {
        return driver.findElements(CSS_Template);
    }


    public void waitForRefresh(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
    }
    public void waitUntilItIsVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitUntilItIsVisible(String element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(element))));
    }

    public void waitUntilItsGone(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
    public void waitUntilItsGone(String cssSelector) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(cssSelector))));
    }

    public void waitUntilAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void click(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

//    public void click(By element) {
//        getElement(element).click();
//    }

//    public void click(String cssLocator) {
//        findElementByCssSelector(cssLocator);
//        getElement(cssLocator).click();
//    }
    public void switchToAlert() {
        alert = driver.switchTo().alert();
    }

    public String getAlertText() {
        return alert.getText();
    }

    public void dismissAlert() {
        alert.dismiss();
    }

    public void acceptAlert() {
        alert.accept();
    }

    public WebElement getElementFromCombobox(WebElement combobox, String text) {

        List<WebElement> comboboxes = combobox.findElements(By.cssSelector(" "));
        for (WebElement element : comboboxes) {
            if (Objects.equals(element.getText(), text)) {
                return element;
            }
        }
        return null;
    }
    public WebElement getElement(By element)
    {

        return driver.findElement(element);
    }

    public WebElement getElementFromCombobox(String CssSelector, String text) {
        List<WebElement> comboboxes = driver.findElements(By.cssSelector(CssSelector));
        for (WebElement element : comboboxes) {
            if (Objects.equals(element.getText(), text)) {
                return element;
            }
        }
        return null;
    }

    public void selectFromDropdown(WebElement dropdown, String option) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(option);
    }

//    public void selectFromDropdown(String cssPath, String option) {
//        Select select = new Select(findElementByCssSelector(cssPath));
//        select.selectByVisibleText(option);
//    }

    public void pressButton(WebElement element, Keys key ){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(key);
    }

}
