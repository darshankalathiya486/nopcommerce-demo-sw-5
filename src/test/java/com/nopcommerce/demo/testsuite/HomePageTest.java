package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HomePageTest extends BaseTest {
    /******************************** All Elements' Action Methods on Apparel page *************************************/
    HomePage homePage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
    }

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = homePage.getAllTopManuName();

        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = homePage.getAllTopManuName();
        }
    }

    /*********************** All Test Methods As Per Requirements *****************************************/
    @Test
    //verify the page navigation
    public void verifyPageNavigation () {
        selectMenu("Apparel");
    }
}
