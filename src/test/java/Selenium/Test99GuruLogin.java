//package Selenium;
//
//import java.util.concurrent.TimeUnit;
//
//import UI.WebPage.Guru99HomePage;
//import UI.WebPage.Guru99Login;
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import org.testng.Assert;
//
//import org.testng.annotations.BeforeTest;
//
//import org.testng.annotations.Test;
//
//import utils.BaseTest;
//
//public class Test99GuruLogin extends BaseTest {
//
//    Guru99Login objLogin;
//
//    Guru99HomePage objHomePage;
//
//    public Test99GuruLogin() {
//        this.objLogin = new Guru99Login();
//        this.objHomePage = new Guru99HomePage();
//    }
//
//    @BeforeTest
//
//    public void setup(){
//
//        objLogin.goToGuruPage();
//    }
//
//    /**
//
//     * This test case will login in http://demo.guru99.com/V4/
//
//     * Verify login page title as guru99 bank
//
//     * Login to application
//
//     * Verify the home page using Dashboard message
//
//     */
//
//    @Test(priority=0)
//
//    public void test_Home_Page_Appear_Correct(){
//
//        //Create Login Page object
//
//        objLogin = new Guru99Login(driver);
//
//        //Verify login page title
//
//        String loginPageTitle = objLogin.getLoginTitle();
//
//        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
//
//        //login to application
//
//        objLogin.loginToGuru99("mgr123", "mgr!23");
//
//        // go the next page
//
//        objHomePage = new Guru99HomePage(driver);
//
//        //Verify home page
//
//        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
//
//    }