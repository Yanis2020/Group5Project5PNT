package com.grubhubtest;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageValidations extends TestBase {

    @Test
    //public void validateUserBeingAbleToLogin(String userName, String password)
    public void validateUserBeingAbleToLogin() {

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        sleepFor(2);
        HomePage homePage = new HomePage();

        homePage.closePopuButton();
        sleepFor(2);
        loginPage.clickOnContinueButton();
        sleepFor(2);


        // homePage.clickOnSignInButton();

        // loginPage.typeOnEmailField(userName);
        //  loginPage.clickOnContinueButton();
        //  loginPage.typeOnPasswordField(password);
    }

}
