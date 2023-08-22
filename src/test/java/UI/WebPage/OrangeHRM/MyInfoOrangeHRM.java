package UI.WebPage.OrangeHRM;

import UI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class MyInfoOrangeHRM extends BasePage {

    public final By CONTACT_DETAILS = By.xpath("//div[@role='tablist']/div[2]");
    public final By STREET = By.cssSelector("input[class='oxd-input oxd-input--active']:nth-child(1)");
    public final By COUNTRY = By.cssSelector("[class='oxd-select-text-input']");
    public final By SAVE_BTN = By.cssSelector("[type='submit']");
    public final By SAVE_BTN_FILE = By.cssSelector("[class='oxd-form-actions'] [type='submit']:nth-child(3)");
    public final By PROMPTER = By.cssSelector("[id='oxd-toaster_1'][class='oxd-toast--success']");

    public final By ADD_ATTACHMENTS_BTN = By.cssSelector("[type='button']:nth-child(2)");
    //public final By UPLOAD_FILE = By.cssSelector("[class='oxd-icon bi-upload oxd-file-input-icon']");
    public final By TEXT_AREA = By.cssSelector("[placeholder='Type comment here']");
    public final By FIRST_ELEMENT_LIST = By.cssSelector("[class='oxd-checkbox-wrapper']");
    public final By DELETE_BTN = By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']");
    public final By CONFIRM_DELETE = By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");
    public final By NEW_CATE_CE_SA_TRIMIT_FISIERUL = By.cssSelector("[class='oxd-file-input']");
    public final By PROFILE_PICTURE = By.cssSelector("[class='employee-image']");
    public final By ADD_PROFILE_PICTURE = By.cssSelector("[type='file']");
    public final By SAVE_PROFILE_PICTURE = By.cssSelector("[class='oxd-form-actions'] button");
    public final By TOASTER_MESSAGE_PROFILE_PICTURE = By.cssSelector("[id='oxd-toaster_1']");


    public void clickMyDetails() {
        waitForPageLoadComplete();
        findElementByCssSelector(CONTACT_DETAILS).click();

        Actions actions = new Actions(driver);
        actions.scrollByAmount(0,900).perform();
    }

    public void changeAddress() {
        waitForPageLoadComplete();
        findElementByCssSelector(STREET).clear();
        findElementByCssSelector(STREET).sendKeys("adresa schimbata");

    }
    public void changeCountry() {
        //findElementByCssSelector(COUNTRY).click();
        click("[class='oxd-select-text-input']");
        //driver.findElement(By.xpath(".//span[text()='Algeria']")).click();
        driver.findElement(By.cssSelector("[class='oxd-select-option']:nth-child(4)")).click();
    }

    public void saveChanges() {
        click(SAVE_BTN);
    }
    public void assertSaveChanges() {
        Assert.assertTrue(findElementByCssSelector("[class='oxd-toast-start']").isDisplayed());
    }

    public void clickAttachmentsBtn() {
        findElementByCssSelector(ADD_ATTACHMENTS_BTN).click();
    }

    public void addFile() {
        WebElement chooseFile = driver.findElement(By.cssSelector("[class='oxd-file-input']"));
        chooseFile.sendKeys("/Users/adserban/Desktop/cevaTest.pdf");
        //findElementByCssSelector(NEW_CATE_CE_SA_TRIMIT_FISIERUL).sendKeys("/Users/adserban/Desktop/cevaTest.pdf");
    }

//    public void uploadFile(By cssSelector, String path) {
//        String root = System.getProperty("user.dir");
//        WebElement choseFile = getElement(cssSelector);
//        choseFile.sendKeys(root + path);
//    }

    public void addComment() {
        findElementByCssSelector(TEXT_AREA).sendKeys("ceva text aiurea adaugat");
    }
    public void saveChangesFileUp() {
        findElementByCssSelector((SAVE_BTN_FILE)).click();
    }

    public void assertFile() {
        Assert.assertTrue(findElementByCssSelector("[class='oxd-table-row oxd-table-row--with-border']").isDisplayed());
    }

    public void selectElement() {

        hardWait(1);

        List<WebElement> listElements = driver.findElements(By.cssSelector("div.oxd-table-card-cell-checkbox"));
        for(int i=0; i<listElements.size(); i++) {
            WebElement checkBoxToSelect = listElements.get(i);
            if (i==1) {
                    checkBoxToSelect.click();
            }
        }
    }

    public void deleteAct() {
        findElementByCssSelector(DELETE_BTN).click();
    }

    public void confirmDelete() {
        findElementByCssSelector(CONFIRM_DELETE).click();
    }

    public void assertDeletion() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(findElementByCssSelector("div[class='oxd-toast-container oxd-toast-container--bottom']").isDisplayed());
        //oxd-toaster_1
    }

    public void clickOnProfilePicture() {
        click(PROFILE_PICTURE);
        hardWait(1);
    }

    public void addProfilePicture() {
        hardWait(1);
        WebElement chooseFile = driver.findElement(By.cssSelector("[type='file']"));
        chooseFile.sendKeys("/Users/adserban/Desktop/Screenshot.png");
//        findElementByCssSelector(ADD_PROFILE_PICTURE).sendKeys("/Users/adserban/Desktop/Screenshot.png");
//        hardWait(1);
    }

    public void saveProfilePicture() {
        click(SAVE_PROFILE_PICTURE);
        hardWait(1);
    }

    public void assertProfilePicture() {
        Assert.assertTrue(findElementByCssSelector(TOASTER_MESSAGE_PROFILE_PICTURE).isDisplayed());
        hardWait(1);
    }
}
