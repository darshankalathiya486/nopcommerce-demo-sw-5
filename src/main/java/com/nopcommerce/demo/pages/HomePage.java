package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    /******************************** All Elements' Path on Homepage ***********************************************/
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//li")
    WebElement getAllTopManu;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(), 'Computers')][1]")
    WebElement computersTab;





    /******************************** All Elements' Action Methods on Homepage *************************************/
    public List<WebElement> getAllTopManuName (){
        List<WebElement> getListOfElements = driver.findElements((By) getAllTopManu);
        return getListOfElements;
    }

    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }

    public void clickOnComputerTab(){
        clickOnElement(computersTab);
    }


}
