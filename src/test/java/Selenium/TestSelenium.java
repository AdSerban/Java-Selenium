package Selenium;

import WebPage.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utils.BrowserHelper;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;
import static org.openqa.selenium.support.PageFactory.initElements;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestSelenium {

     private BrowserHelper browserHelper = new BrowserHelper();
     private WebDriver driver;
     private OrangeHRM orangeHRM;
     private CalculatorPage calculatorPage;
     private BrowserStack browserStack;



    @BeforeAll
    public void befforeAll(){
         driver = browserHelper.getChromeDriver();
         orangeHRM = initElements(driver,OrangeHRM.class);
         calculatorPage = initElements(driver, CalculatorPage.class);
         browserStack = initElements(driver,BrowserStack.class);

     }

     @AfterAll
     void afterAll() {
         driver.quit();

     }
    @Test
    public void calculatorTest() throws InterruptedException {

         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("http://www.calculator.net/");
         Thread.sleep(5000);
         calculatorPage.mathBtn.click();
         calculatorPage.perBtn.click();
         calculatorPage.firstValue.sendKeys("40");
         calculatorPage.secondValue.sendKeys("5");
         calculatorPage.cltBtn.click();
         System.out.println(calculatorPage.result.getText());


    }

    @Test
    public void orangeTest() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);
        System.out.println("page title is: " + driver.getTitle());
        System.out.println("url is: " + driver.getCurrentUrl());
        System.out.println("text is: " + orangeHRM.title.getText());
        System.out.println("attribute is " + orangeHRM.title.getAttribute("class"));


        orangeHRM.username.sendKeys("Admin");
        orangeHRM.pass.sendKeys("admin123");
        orangeHRM.loginBtn.click();
//        orangeHRM.nextPage.click();
        Thread.sleep(5000);

    }

    @Test
    public void alertsTest() throws InterruptedException {
        driver.get("https://www.browserstack.com/users/sign_up");

        browserStack.userName.sendKeys("ceva");
        browserStack.email.sendKeys("ceva@yahoo.com");
        browserStack.passWord.sendKeys("cevaaa");
        browserStack.termsAcc.click();
        System.out.println(browserStack.termsAcc.isEnabled());
        System.out.println(browserStack.termsAcc.isSelected());
        browserStack.termsAcc.click();
        System.out.println(browserStack.termsAcc.isSelected());
        browserStack.subBtn.click();

        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.accept();



    }

    @Test
    public void multipleWindows() {
        driver.get("http://www.naukri.com/");

        String parent=driver.getWindowHandle();
        Set<String> set= driver.getWindowHandles();
        Iterator<String> it = set.iterator();

        while(it.hasNext()) {
            String child = it.next();
            if(!parent.equals(child)) {
                driver.switchTo().window(child);
            }
            System.out.println(driver.switchTo().window(child).getTitle());

        }
        driver.switchTo().window(parent);
    }


    @Test
    public void multipleWindowsHandle() throws InterruptedException {
        driver.get("https://www.browserstack.com/");
        String title = driver.getTitle(); System.out.println(title);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.cssSelector("div[class='widget_nav_menu'] [id='menu-solutions']")).click();
        driver.findElement(By.cssSelector("li[id*='45112']")).click();
        js.executeScript("window.scrollBy(0,40)");

//        WebElement link = driver.findElement(By.xpath("//a[@id='product-menu-toggle']//span[@class='account-down-caret']//*[local-name()='svg']"));
        Actions newwin = new Actions(driver);
//        newwin.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
//Thread.sleep(2000);
//js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(3000);
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows);
        System.out.println("a1");
        for (String window : windows)
        {
            driver.switchTo().window(window);
            if (driver.getTitle().contains("Most Reliable App & Cross Browser Testing Platform | Browserstack"))
            {
                System.out.println("a2");
                js.executeScript("window.scrollBy(0,1000)");
                System.out.println("b1");
                driver.findElement(By.xpath("//a[@id='logo']//*[local-name()='svg']")).click();

                driver.findElement(By.xpath("//a[@id='signupModalButton']")).click();
                driver.manage().window().setPosition(new Point(2000, 0));
            }
        }
        Thread.sleep(3000);
        Set<String> windows1 = driver.getWindowHandles();
        System.out.println(windows1);
        System.out.println("a3");
        for (String window : windows1)
        {
            driver.switchTo().window(window);
            System.out.println("a4");
            js.executeScript("window.scrollBy(0,400)");
        }
    }

    @Test
    public void assertionTest() {
        driver.get("https://www.browserstack.com/");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
        Assert.assertEquals(actualTitle,expectedTitle);

        String expectedTitleForNotEquals = "Most Reliable App & Cross Browser Testing Platform | BrowserStack + added";
        Assert.assertNotEquals(actualTitle,expectedTitleForNotEquals);

        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
        Boolean expectedTitleForNotEquals_2 =  driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack + added");

        assertTrue(verifyTitle);
        assertFalse(expectedTitleForNotEquals_2);
    }
    @Test
    public void assertionTest_2() {
        driver.get("https://www.browserstack.com/");

        String verifyAssertNull = null;
        assertNull(verifyAssertNull);

        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform");
        assertNotNull(verifyTitle);

        SoftAssert softAssert = new SoftAssert();
        driver.navigate().to("https://www.browserstack.com/");
        String getActualTitle = driver.getTitle();
        Boolean verifyTitleForSoftAssert = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
        softAssert.assertEquals(getActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
        softAssert.assertNotEquals(getActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack + added");
        softAssert.assertNull(verifyTitleForSoftAssert);
        softAssert.assertNotNull(verifyTitleForSoftAssert);
        softAssert.assertTrue("BrowserStack".equals("Browserstack"), "First soft assert failed");
        softAssert.assertFalse("BrowserStack".equals("BrowserStack"), "Second soft assert failed");
        softAssert.assertAll();
    }
}
