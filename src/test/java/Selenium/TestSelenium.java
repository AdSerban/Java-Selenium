package Selenium;

import org.junit.jupiter.api.Test;
import utils.BrowserHelper;

public class TestSelenium {
    
     BrowserHelper browserHelper = new BrowserHelper();

    @Test
    public void firstTest() {
        browserHelper.getChromeDriver();

    }


}
