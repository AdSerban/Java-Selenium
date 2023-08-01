package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.apache.commons.lang3.SystemUtils.IS_OS_MAC;

public class BrowserHelper {

    public  WebDriver getChromeDriver(){

        System.setProperty("webdriver.chrome.driver", "src/test/java/resources/drivers/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.manage().window().maximize();

        return chromeDriver;

        // in basepage initializez driverul
    }
}
