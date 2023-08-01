package utils;

import WebPage.*;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import static org.openqa.selenium.support.PageFactory.initElements;

public class BaseTests {


    private static BrowserHelper browserHelper = new BrowserHelper();
    public static WebDriver driver;
    private OrangeHRM orangeHRM;
    private CalculatorPage calculatorPage;
    private BrowserStack browserStack;
    private GooglePage googlePage;
    private GmailPage gmailPage;
    private InternetHeroKuappPage internetHeroKuppaPage;


    @BeforeAll
    public void befforeAll() {
        driver = browserHelper.getChromeDriver();
        orangeHRM = initElements(driver,OrangeHRM.class);
        calculatorPage = initElements(driver, CalculatorPage.class);
        browserStack = initElements(driver,BrowserStack.class);
        googlePage = initElements(driver, GooglePage.class);
        gmailPage = initElements(driver, GmailPage.class);
        internetHeroKuppaPage = initElements(driver, InternetHeroKuappPage.class);

    }

//    @BeforeClass
//    public static void initialiseDriverAndProperties() {
//        loadTestProperties();
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
//        String username = "<your_lambdatest_username>";
//        String accesskey = "<your_lambdatest_accesstoken>";
//        String lambdaTestGridURL = "@hub.lambdatest.com/wd/hub";
//
//        capabilities.setCapability("build", "Selenium_Gherkin_Project");
//        capabilities.setCapability("name", "Placing order for a product");
//        capabilities.setCapability("platform", "Windows 10");
//        capabilities.setCapability("browserName", "chrome");
//        capabilities.setCapability("version", "73.0");
//        capabilities.setCapability("visual",false);
//        capabilities.setCapability("network",false);
//        capabilities.setCapability("console",false);
//        capabilities.setCapability("tunnel",false);
//        try {
//            driver = new RemoteWebDriver(new URL("http://" + username + ":" + accesskey + lambdaTestGridURL), capabilities);
//        } catch (MalformedURLException e) {
//            System.out.println("Invalid grid URL");
//        }
//    }

    @AfterAll
    void afterAll() {
        driver.quit();

    }

//    private static void loadTestProperties(){
//        Properties properties = System.getProperties();
//        try {
//            properties.load(
//                    new FileInputStream(new File("resources/test.properties")));
//        } catch(Exception ex) {
//            ex.printStackTrace();
//            System.exit(-1);
//        }
//    }

}
