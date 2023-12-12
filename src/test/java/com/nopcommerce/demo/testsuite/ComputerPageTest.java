package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class ComputerPageTest extends BaseTest {

    /******************************** All Elements' Action Methods on Computer page *************************************/

    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;

    @BeforeMethod(alwaysRun = true)

    public void inIt(){
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
    }

    /*********************** All Test Methods As Per Requirements *****************************************/

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        homePage.clickOnComputerTab();
        Assert.assertEquals(computerPage.getComputerText(),"Computers");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.clickOnComputerTab();
        computerPage.clickOnDesktopLink();
        Assert.assertEquals(desktopsPage.getDesktopText(),"Desktops");
    }

    @Test(groups = {"regression"},dataProvider = "computerConfigs",dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram,String hdd, String os, String software){
        homePage.clickOnComputerTab();
        computerPage.clickOnDesktopLink();
        desktopsPage.clickOnProductName();
        desktopsPage.selectFeaturesOfComputer(processor, ram, hdd, os, software);
        desktopsPage.clickOnAddToCart();
        Assert.assertEquals(desktopsPage.getProductAddMessage(),"The product has been added to your shopping cart");


    }

}
