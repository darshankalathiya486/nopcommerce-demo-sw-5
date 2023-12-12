package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    /******************************** All Elements' Path on Register page ***********************************************/

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Male']")
    WebElement radioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateText;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthText;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registerCompleteText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordError;



    /******************************** All Elements' Action Methods on Register page *************************************/

    public String getRegisterText(){
        return getTextFromElement(registerText);
    }

    public void clickOnRadioButton(){
        clickOnElement(radioButton);
    }

    public void enterFirstName(String firstname){
        sendTextToElement(firstName,firstname);
    }

    public void enterLastName(String lastname){
        sendTextToElement(lastName,lastname);
    }

    public void selectDateByValue(String value){
        selectByValueFromDropDown(dateText,value);
    }

    public void selectMonthByValue(String value){
        selectByValueFromDropDown(monthText,value);
    }

    public void selectYearByValue(String value){
        selectByValueFromDropDown(yearText,value);
    }

    public void enterEmail(String email){
        sendTextToElement(emailText,email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordText,password);
    }

    public void enterConfirmPassword(String password){
        sendTextToElement(confirmPassword,password);
    }

    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String getRegisterCompleteText(){
        return getTextFromElement(registerCompleteText);
    }

    public String getFirstNameError(){
        return getTextFromElement(firstNameError);
    }

    public String getLastNameError(){
        return getTextFromElement(lastNameError);
    }

    public String getEmailError (){
        return getTextFromElement(emailError);
    }

    public String getPasswordError(){
        return getTextFromElement(passwordError);
    }

    public String getConfirmPasswordError(){
        return getTextFromElement(confirmPasswordError);
    }





}
