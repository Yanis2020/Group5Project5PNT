package com.grubhubtest;

import com.base.TestBase;
import com.data.DataProviders;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.FindFoodPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    @Test
    public void validateUserBeingAbleToTypeOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.closePopuButton();
        homePage.typeOnSearchBar("Austin, TX, 78701");
        homePage.clickOnSearchButton();
    }



    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnSignInButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
    }


    @Test(dataProviderClass = DataProviders.class, dataProvider = "credentials", enabled = false)
    public void validateUserBeingAbleToLogin(String userName, String password) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        homePage.clickOnSignInButton();

        loginPage.typeOnEmailField(userName);
        loginPage.clickOnContinueButton();
        loginPage.typeOnPasswordField(password);
    }







}