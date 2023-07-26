package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRM {



    @FindBy(css ="[name= 'username']") public WebElement username;
    @FindBy(css ="[name= 'password']") public WebElement pass;
    @FindBy(css ="[type= 'submit']") public WebElement loginBtn;
    @FindBy(css ="[class*= 'orangehrm-login-forgot-header']") public WebElement forgotPass;
    @FindBy(css ="[class*= 'orangehrm-login-title']") public WebElement title;


}
