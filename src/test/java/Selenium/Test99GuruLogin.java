package Selenium;

import UI.WebPage.Guru99HomePage;
import UI.WebPage.Guru99Login;

import org.openqa.selenium.Alert;
import org.testng.Assert;

import org.testng.annotations.Test;

import utils.BaseTest;

public class Test99GuruLogin extends BaseTest {

    Guru99Login guru99Login;
    Guru99HomePage guru99HomePage;

    public Test99GuruLogin() {
        this.guru99Login = new Guru99Login();
        this.guru99HomePage = new Guru99HomePage();
    }

    @Test()
    public void test_Home_Page_Appear_Correct() throws InterruptedException {

        guru99Login.goToGuruPage();

        String expectedTitle = "guru99 bank";

        Assert.assertEquals(guru99Login.getLoginTitle(),expectedTitle);

        guru99Login.loginToGuru99("mgr123", "mgr!23");
        guru99Login.alert();

        Thread.sleep(1000);
        String actualTitle = "manger id : mgr123";
        //Assert.assertEquals(guru99HomePage.getHomePageDashboardUserName(),actualTitle);

    }

}