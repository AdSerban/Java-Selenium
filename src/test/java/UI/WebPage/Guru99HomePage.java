package UI.WebPage;

import UI.BasePage;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Guru99HomePage extends BasePage {

    WebDriver driver;

    By homePageUserName = By.xpath("//table//tr[@class='heading3']");


    public String getHomePageDashboardUserName(){

        return findElementByCssSelector(homePageUserName).getText().toLowerCase();

    }

}