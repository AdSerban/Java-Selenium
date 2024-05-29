package UI.WebPage;

import UI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.NoSuchElementException;

import static java.sql.DriverManager.getDriver;

public class W3School extends BasePage {

    String radioXpath = "//input[@type='radio']/following-sibling::label[contains(text(), '%s')]";
     String radioCssSelector = "input[type='radio'] + label";


    public void goToW3school() throws InterruptedException {
        Thread.sleep(2000);
        goTo("https://qa-automation-practice.netlify.app/radiobuttons.html");

    }

    public void selectRadioBtnOption(String opt) {
        WebElement radio = driver.findElement(By.xpath(
           String.format("//input[@type='radio']/following-sibling::label[contains(text(), '%s')]", opt)
        ));

        radio.click();
        hardWait(3);
    }

//    public void selectRadioBtnOption(String opt) {
//
//        List<WebElement> radioLabels = driver.findElements(By.cssSelector("label"));
//
//
//        for (WebElement label : radioLabels) {
//            if (label.getText().equalsIgnoreCase(opt)) {
//                label.click();
//                hardWait(5);
//                return;
//            }
//        }
//
//        throw new NoSuchElementException("Radio button with label '" + opt + "' not found");
//    }

//    public void selectRadioBtnOption(String opt) {
//        // Trebuie să asociezi valorile HTML cu id-urile respective (html, css, javascript)
//        String optionId;
//        switch (opt.toLowerCase()) {
//            case "html":
//                optionId = "html";
//                break;
//            case "css":
//                optionId = "css";
//                break;
//            case "javascript":
//                optionId = "javascript";
//                break;
//            default:
//                throw new IllegalArgumentException("Invalid option: " + opt);
//        }
//
//        WebElement radioLabel = driver.findElement(By.xpath(String.format(radioXpath, optionId)));
//        radioLabel.click();
//    }

}
