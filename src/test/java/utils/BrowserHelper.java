package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.apache.commons.lang3.SystemUtils.IS_OS_MAC;

public class BrowserHelper {

    public static WebDriver driver;
    static {

        Runtime.getRuntime().addShutdownHook(new Thread() {

            public void run() { driver.quit(); }

        });

    }
    public WebDriver getDriver(){

        if (driver == null){

            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();
            driver.manage().window().maximize();

            return driver;

        }else {

            return driver;

        }

    }
//    public  WebDriver getChromeDriver(){
//
//        System.setProperty("webdriver.chrome.driver", "src/test/java/resources/drivers/chromedriver");
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//
//        WebDriver chromeDriver = new ChromeDriver(options);
//        chromeDriver.manage().window().maximize();
//
//        return chromeDriver;
//
//        // in basepage initializez driverul
//    }
}
