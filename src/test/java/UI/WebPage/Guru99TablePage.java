package UI.WebPage;

import UI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Guru99TablePage extends BasePage {

    /**
     * By.xpath() is commonly used to access elements of WebTable in Selenium.
     * If the element is written deep within the HTML code such that the number to use for the predicate is very difficult to determine, we can use that element’s unique attribute instead for Selenium get table element.
     * Attributes are used as predicates by prefixing them with the @ symbol.
     * Use Inspect Element for Accessing WebTable in Selenium
     */

    @FindBy(xpath = "//center/table/tbody/tr[2]/td[2]") public WebElement fourthCell;
    @FindBy(xpath = "//table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[2]") public WebElement secondCell;
    @FindBy(xpath = "//table[@width=\"270\"]/tbody/tr[4]/td") public WebElement innerText;
    @FindBy(xpath = "//table/tbody/tr/td[2]" + "//table/tbody/tr[4]/td/" + "table/tbody/tr/td[2]/" + "table/tbody/tr[2]/td[1]/" + "table[2]/tbody/tr[3]/td[2]/font") public WebElement impossibleInnerText;


    public void goToTablePage() {
        goTo("https://demo.guru99.com/test/write-xpath-table.html");

    }

    public void goToNestedTablePage() {
        goTo("https://demo.guru99.com/test/accessing-nested-table.html");

    }

    public void goToInnerTextPage() {
        goTo("http://demo.guru99.com/test/newtours/");
    }

    public void goToInnerText() {
        goTo("http://demo.guru99.com/test/newtours/");
    }

    public void getText() {
        String text = driver.findElement(By.xpath("//center/table/tbody/tr[2]/td[2]")).getText();
        System.out.println(text);
    }
    public void getTextNestedTable() {
        String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[2]")).getText();
        System.out.println(text);
    }
    public void getTextInnerTable() {
        String innerText = driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[4]/td")).getText();
        System.out.println(innerText);
    }
    public void getImpossibleInnerText() {
        String innerText = driver.findElement(By.xpath("//table/tbody/tr/td[2]"
                                + "//table/tbody/tr[4]/td/"
                                + "table/tbody/tr/td[2]/"
                                + "table/tbody/tr[2]/td[1]/"
                                + "table[2]/tbody/tr[3]/td[2]/font")).getText();
        System.out.println(innerText);
    }
}
