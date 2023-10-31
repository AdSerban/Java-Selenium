package utils;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.openqa.selenium.support.PageFactory.initElements;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

//    static ExtentTest test;
//    static ExtentReports report;

    @BeforeAll
    public void startDriver()
    {
//        LocalDateTime myDateObj = LocalDateTime.now();
//        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        String formattedDate = myDateObj.format(myFormatObj);
//        System.out.println("After formatting: " + formattedDate);
//
//        report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
//        test = report.startTest("ExtentDemo");

    }

    @AfterAll
    public void quitDriver()
    {
//        report.endTest(test);
//        report.flush();
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
