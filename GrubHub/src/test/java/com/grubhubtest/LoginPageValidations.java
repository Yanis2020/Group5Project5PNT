package com.grubhubtest;

import com.base.TestBase;
import com.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageValidations extends TestBase {

    @Test
    //public void validateUserBeingAbleToLogin(String userName, String password)
    public void validateUserBeingAbleToLogin() {

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);


        sleepFor(3);

        loginPage.closePopuButton2();
        sleepFor(2);
        loginPage.clickOnContinueButton();
        sleepFor(2);

        loginPage.typeOnEmailField("Yanis");
        sleepFor(2);
        loginPage.typeOnPasswordField("hola");
        sleepFor(2);

        loginPage.clickOnFinalSignInButton();


    }

    @Test
    public void validateUserAbleToCreateAccount() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        sleepFor(3);
        loginPage.closePopuButton2();
        sleepFor(2);
        loginPage.clickOnFinalSignInButton();
        sleepFor(2);
        loginPage.clickOnCreateAccount();

    }

}
