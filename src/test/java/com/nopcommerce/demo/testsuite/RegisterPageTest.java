package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {

    /******************************** All Elements' Action Methods on Register page *************************************/

    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        loginPage= new LoginPage();
        registerPage = new RegisterPage();
    }


    /*********************** All Test Methods As Per Requirements *****************************************/


    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegisterLink();
        Assert.assertEquals(registerPage.getRegisterText(),"Register");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homePage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();
        Assert.assertEquals(registerPage.getFirstNameError(),"First name is required.");
        Assert.assertEquals(registerPage.getLastNameError(),"Last name is required.");
        Assert.assertEquals(registerPage.getEmailError(),"Email is required.");
        Assert.assertEquals(registerPage.getPasswordError(),"Password is required.");
        Assert.assertEquals(registerPage.getConfirmPasswordError(),"Password is required.");

    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.clickOnRadioButton();
        registerPage.enterFirstName("Meet");
        registerPage.enterLastName("Patel");
        registerPage.selectDateByValue("23");
        registerPage.selectMonthByValue("8");
        registerPage.selectYearByValue("2022");
        registerPage.enterEmail("aba@gmail.com");
        registerPage.enterPassword("123456");
        registerPage.enterConfirmPassword("123456");
        registerPage.clickOnRegisterButton();
        Assert.assertEquals(registerPage.getRegisterCompleteText(),"Your registration completed");
    }
}
