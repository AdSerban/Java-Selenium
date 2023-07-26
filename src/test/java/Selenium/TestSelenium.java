package Selenium;

import WebPage.BrowserStack;
import WebPage.CalculatorPage;
import WebPage.OrangeHRM;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import utils.BrowserHelper;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.PageFactory.initElements;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestSelenium {

     private BrowserHelper browserHelper = new BrowserHelper();
     private WebDriver driver;
     private OrangeHRM orangeHRM;
     private CalculatorPage calculatorPage;
     private BrowserStack browserStack;



    @BeforeAll
     void befforeAll(){
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

        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.accept();



    }


}
