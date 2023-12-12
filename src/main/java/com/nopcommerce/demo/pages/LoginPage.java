package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

/******************************** All Elements' Path on Login page ***********************************************/

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailText;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement logInText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutLink;




    /******************************** All Elements' Action Methods on Login page *************************************/

    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        return message;
    }

    public void enterEmail(String email){
        sendTextToElement(emailText,email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordText,password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }

    public String getLogOutText(){
        return getTextFromElement(logOutText);
    }

    public String getLogINText(){
        return getTextFromElement(logInText);
    }

    public void clickOnLogOutButton(){
        clickOnElement(logOutLink);
    }
}
