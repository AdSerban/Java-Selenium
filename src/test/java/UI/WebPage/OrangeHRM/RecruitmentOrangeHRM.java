package UI.WebPage.OrangeHRM;

import UI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class RecruitmentOrangeHRM extends BasePage {

        public final By VACANCIES_BTN = By.cssSelector("[aria-label='Topbar Menu'] li:nth-child(2)");
        public final By JOB_TITLE_BTN = By.cssSelector("[class='oxd-select-text--after']");
        public final By SEARCH_BTN = By.cssSelector("[type='submit']");
        public final By VIEW_ICON = By.cssSelector("[class='oxd-icon bi-eye-fill']");
        public final By DATE = By.cssSelector("[placeholder='yyyy-mm-dd']");
        public final By TIME = By.cssSelector("[class='oxd-time-input']");
        public final By UP_ARROW = By.cssSelector("[class='oxd-time-hour-input'] i");
        public final By PM_OPTION = By.cssSelector("[name='pm']");
        public final By SAVE_BTN = By.cssSelector("[type='submit']");
        public final By ADD_ANOTHER_BTN = By.cssSelector("[class='oxd-icon bi-plus oxd-button-icon']");
        public final By ALERT = By.cssSelector("div[class='oxd-toast-icon-wrap oxd-toast-icon-wrap--success']");

    public void clickVacancies() {
            waitForPageLoadComplete();
            findElementByCssSelector(VACANCIES_BTN).click();
        }

        public void clickOnJobTitle() {
            waitForPageLoadComplete();
            click(JOB_TITLE_BTN);

        }

        public void clickSearch() {
            waitForPageLoadComplete();
            click(SEARCH_BTN);
        }

        public void selectAccountAssistanti() {

            clickOnJobTitle();

            List<WebElement> listElementsJobTitle = driver.findElements(By.cssSelector("[class='oxd-select-option']"));
//            System.out.println("--------------------------------------------------------");
//            System.out.println(listElementsJobTitle.toString());
//            System.out.println("--------------------------------------------------------");
            for (int i = 0; i < listElementsJobTitle.size(); i++) {
                WebElement options = listElementsJobTitle.get(i);
                if (i == 1) {
                    options.click();
                }
            }

            clickSearch();

        }

        public void assertFilter() {
            Assert.assertEquals(findElementByCssSelector("[class='oxd-select-text oxd-select-text--active']").getText(),"Account Assistant");
        }

        public void clickOnViewIcon() {
            waitForPageLoadComplete();
            click(VIEW_ICON);
        }

        public void selectShortListedCandidates() {

            hardWait(1);
            List<WebElement> listOfTabs = driver.findElements(By.cssSelector("[class='oxd-select-text--after']"));
//            System.out.println("--------------------------------------------------------");
//            System.out.println(listElementsJobTitle.toString());
//            System.out.println("--------------------------------------------------------");
            for (int i = 0; i < listOfTabs.size(); i++) {
                WebElement options = listOfTabs.get(i);
                if (i == 3) {
                    options.click();
                }
            }

            hardWait(1);

            List<WebElement> listElementsJobTitle = driver.findElements(By.cssSelector("[class='oxd-select-option']"));
//            System.out.println("--------------------------------------------------------");
//            System.out.println(listElementsJobTitle.toString());
//            System.out.println("--------------------------------------------------------");
            for (int i = 0; i < listElementsJobTitle.size(); i++) {
                WebElement options = listElementsJobTitle.get(i);
                if (i == 2) {
                    options.click();
                }
            }
            hardWait(1);
            clickSearch();
            hardWait(1);
            clickOnViewIcon();
        }
        public void clickOnSchedule() {

            findElementByXpath(".//button[text()=' Schedule Interview ']").click();
            hardWait(1);
        }

        public void addInterviewTitle() {
            List<WebElement> listElementsLabel = driver.findElements(By.cssSelector("[class='oxd-input oxd-input--active']"));

            for (int i = 0; i < listElementsLabel.size(); i++) {
                WebElement options = listElementsLabel.get(i);
                if (i == 5) {
                    options.sendKeys("Interviu");
                }
            }
            hardWait(5);
        }

    private By dropdownAutoComplete = By.cssSelector("div[class=\"oxd-autocomplete-option\"]");
        public void addInterviewer() {

            List<WebElement> listElementsLabel = driver.findElements(By.cssSelector("input[placeholder=\"Type for hints...\"]"));

            for (int i = 0; i < listElementsLabel.size(); i++) {
                WebElement options = listElementsLabel.get(i);
                if (i == 0) {
                    options.click();
                    options.sendKeys("a");
                    hardWait(2);
                    WebElement firstInterviewer = driver.findElement(dropdownAutoComplete).findElement(By.xpath("//span[text()='Odis  Adalwin']"));
                    firstInterviewer.click();
                }
            }

            click(ADD_ANOTHER_BTN);
            hardWait(1);
            addSecondInterviewer();
        }


        public void addSecondInterviewer() {

            List<WebElement> listElementsLabel = driver.findElements(By.cssSelector("input[placeholder=\"Type for hints...\"]"));

            for (int i = 1; i < listElementsLabel.size(); i++) {
                WebElement options = listElementsLabel.get(i);
                if (i == 1) {
                    options.click();
                    options.sendKeys("a");
                    hardWait(2);
                    WebElement secondInterviewer = driver.findElement(dropdownAutoComplete).findElement(By.xpath("//span[text()='Linda Jane Anderson']"));
                    secondInterviewer.click();
                }
            }
        }

        public void addDate() {
            fill(DATE,"2024-12-12");
        }
        public void addTime() {
            //findElementByCssSelector(TIME).click();
            click(TIME);
            hardWait(1);
            int i=1;
            while(i<5){
                click(UP_ARROW);
                i++;
            }
            hardWait(1);
            //click(PM_OPTION);

        }

        public void addDateAndTime() {
            addDate();
            addTime();
        }

        public void clickSave() {
            waitForPageLoadComplete();
            click(SAVE_BTN);

        }
        public void getAlertConfirmSave() {
            Assert.assertTrue(findElementByCssSelector(ALERT).isDisplayed());
        }

}
