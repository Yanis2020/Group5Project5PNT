package com.grubhubtest;

import com.base.TestBase;
import com.data.DataProviders;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.RegisterPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserBeingAbleToTypeOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar("Java Books");
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "searchData", enabled = false)
    public void validateUserBeingAbleToSearchForAnItem(String data) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar(data);
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


    @Test(enabled = false)
    public void validateUserCanRegister() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);

        homePage.clickOnRegisterButton();
        registerPage.validateURL();
        registerPage.validateCreateAccountDisplayed();
    }


    @Test
    public void fieldsValidationOnRegisterPage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);
        homePage.clickOnRegisterButton();
        registerPage.validateFieldsUsingSoftAssert();
    }


}