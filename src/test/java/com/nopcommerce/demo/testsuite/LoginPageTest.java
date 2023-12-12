package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {

    /******************************** All Elements' Action Methods on Login page *************************************/

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        loginPage= new LoginPage();
    }

    /*********************** All Test Methods As Per Requirements *****************************************/

    @Test(groups = {"sanity", "smoke", "regression"})
    public void userShouldNavigateToLoginPageSuccessFully (){
        homePage.clickOnLoginLink();
        Assert.assertEquals(loginPage.getWelcomeText(),"Welcome, Please Sign In!");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyTheErrorMessageWithInValidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmail("aaaaa@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getErrorMessage(),"Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found");
    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmail("aba@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getLogOutText(),"Log out");
    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogOutSuccessFully(){
        homePage.clickOnLoginLink();
        loginPage.enterEmail("aba@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        loginPage.clickOnLogOutButton();
        Assert.assertEquals(loginPage.getLogINText(),"Log in");
    }


}
