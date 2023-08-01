package UI.WebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GooglePage {

    @FindBy(css = "[id='APjFqb']") public WebElement putText;
    @FindBy(css = "[id='L2AGLb']") public WebElement acceptAll;
    @FindBy(css = "[class='_Rm]") public List<WebElement> elements;


}