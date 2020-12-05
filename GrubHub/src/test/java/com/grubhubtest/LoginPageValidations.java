package com.grubhubtest;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginPageValidations extends TestBase {

    //private static Logger LOGGER1 = Logger.getLogger(LoginPageValidations.class);


    @Test(enabled = false)
    //public void validateUserBeingAbleToLogin(String userName, String password)
    public void validateUserBeingAbleToLogin() {

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        sleepFor(2);
       try {
           loginPage.closePopuButton2();
       } catch (Exception e){
           e.printStackTrace();

       }
        sleepFor(2);
     //   LOGGER1.info("Chrome opened properly");
        loginPage.clickOnContinueButton();
        sleepFor(2);

      //  loginPage.typeOnEmailField("Yanis");
      //  sleepFor(2);
      //  loginPage.typeOnPasswordField("hola");
       // sleepFor(2);

        //loginPage.clickOnFinalSignInButton();
        closeDriver();


    }

    @Test(enabled = false)
    public void validateUserAbleToCreateAccount() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        sleepFor(2);
       // loginPage.closePopuButton2();
        //sleepFor(2);
        loginPage.clickOnFinalSignInButton();
        sleepFor(2);

        closeDriver();
    }

}
